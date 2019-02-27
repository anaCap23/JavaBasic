package oop.generic;

import java.util.Comparator;

public class GenMethod {


    public static void main(String[] args) {
        Double doub = test1(2.2);
        String str = test2("some");

        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
//          jAVA8
//        Comparator<Integer> comparator1 = (Integer o1, Integer o2) -> {return o1 - o2};
//        SAME AS:
//          Comparator<Integer> comparator1 = (o1, o2) -> o1 - o2;



    }

    public static<T, E > T test(T t, E e) {
        return t;
    }

    public static<T> T test1(T t){
        return t;
    }

    public static <T> T test2(T t){
        return t;
    }

    public static<T, A, E> T test3(T t, A a, E e){
        return t;
    }

}

class TwoGen <T, A> {
    T t;
    A a;
}
