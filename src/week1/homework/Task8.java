package week1.homework;
/*    Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
        124    4    -   true
        1456   567  -   false
        1      2    -   false
        18     98   -   true
*/
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 1num");
        int num1 = sc.nextInt();
        System.out.println("please enter 2num");
        int num2 = sc.nextInt();
        int lastNum1 = num1 % 10;
        int lastNum2 = num2 % 10;

        if(lastNum1 == lastNum2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
