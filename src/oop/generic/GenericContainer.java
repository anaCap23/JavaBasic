package oop.generic;

public class GenericContainer <T> {

    private T el;

    public GenericContainer(T el){
        this.el = el;
    }

    public T getEl(){
        return el;
    }
    public void setEl(T el){
        this.el = el;
    }


}
