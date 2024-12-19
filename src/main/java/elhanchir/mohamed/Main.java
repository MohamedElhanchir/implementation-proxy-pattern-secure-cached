package elhanchir.mohamed;

import elhanchir.mohamed.proxy.CacheProxy;
import elhanchir.mohamed.proxy.Proxy;
import elhanchir.mohamed.proxy.SecurityProxy;
import elhanchir.mohamed.service.Context;
import elhanchir.mohamed.service.IServiceImpl;
import elhanchir.mohamed.service.SecurityContext;

public class Main {
    public static void main(String[] args) {

        Context context = new Context();
        context.setService(new IServiceImpl());
        context.execute(5);

        context.setService(new Proxy(new IServiceImpl()));
        context.execute(5);


        /*
        SecurityContext.setRole("root");
        context.setService(new SecurityProxy(new IServiceImpl()));
        context.execute(5);*/

        SecurityContext.setRole("admin");
        context.setService(new SecurityProxy(new IServiceImpl()));
        context.execute(5);

        context.setService(new CacheProxy(new IServiceImpl()));
        context.execute(5);
        context.execute(4);
        context.execute(6);
        context.execute(5);


        System.out.println("_____________________________");
        System.out.println();
        context.setService(new SecurityProxy(new CacheProxy(new Proxy(new IServiceImpl()))));
        context.execute(5);



    }
}