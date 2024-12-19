package elhanchir.mohamed.proxy;

import elhanchir.mohamed.service.IService;
import elhanchir.mohamed.service.SecurityContext;

public class SecurityProxy implements IService {
    private IService service;

    public SecurityProxy(IService service) {
        this.service = service;
    }


    @Override
    public double doSomething(int param) {
        System.out.println("___________SecurityProxy___________________");
        if (SecurityContext.getRole().equals("admin")) {
            return service.doSomething(param);
        } else {
            throw new SecurityException("User is not allowed to execute this method");
        }
    }
}
