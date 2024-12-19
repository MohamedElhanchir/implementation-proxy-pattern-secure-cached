package elhanchir.mohamed.service;

public class Context {
    private IService service;

    public void setService(IService service) {
        this.service = service;
    }

    public void execute(int param) {
        System.out.println("___________Context___________________");
        System.out.println("Result => "+service.doSomething(param));
        System.out.println("___________/Context___________________");
    }
}
