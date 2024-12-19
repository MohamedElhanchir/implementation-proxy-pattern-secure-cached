package elhanchir.mohamed.proxy;

import elhanchir.mohamed.service.IService;

public class Proxy implements IService {

    private IService service;

    public Proxy(IService service) {
        this.service = service;
    }

    @Override
    public double doSomething(int param) {
        System.out.println("___________Proxy___________________");
        double result = service.doSomething(param);
        result = result * 2;
        return result;
    }
}
