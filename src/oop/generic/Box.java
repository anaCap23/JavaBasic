package oop.generic;

public class Box<B> {
    private B[] genMas = (B[]) new Object[10];
    private B el;

    public Box (B el){
        this.el = el;
    }

    public B getEl(){
        return el;
    }
}
