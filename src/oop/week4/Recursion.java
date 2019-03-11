package oop.week4;

public class Recursion {
    public static void main(String[] args) {

    }

        public static void foo () {
            foo();
        }

        public static int iter ( int i){
            if (i == 11) {
                return i;
            } else {
                return i + iter(i);
            }
        }

        public static int fibo ( int num){
            if (num == 1 || num == 2) {
                return 1;
            }

            int prev1 = fibo(num - 1);
            int prev2 = fibo(- 2);

            return prev1 + prev2;

        }
    }

