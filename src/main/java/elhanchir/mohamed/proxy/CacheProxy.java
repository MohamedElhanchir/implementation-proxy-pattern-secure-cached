package elhanchir.mohamed.proxy;

import elhanchir.mohamed.service.IService;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements IService {
    private Map<Integer, Double> cache;
    private IService service;

    public CacheProxy(IService service) {
        this.service = service;
        this.cache = new HashMap<>();
    }

    @Override
    public double doSomething(int param) {
        if (cache.containsKey(param)) {
            System.out.println("___________CacheProxy: From Cache___________________");
            return cache.get(param);
        }
        System.out.println("___________CacheProxy: New Result___________________");
        double result = service.doSomething(param);
        cache.put(param, result);
        return result;
    }
}
