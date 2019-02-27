package oop.design_patterns;


public class ServiceFactory {

    public static Service create(){
        return new Service(new VkApi(new Host("Service")));
    }


}
