package week2.homework2;
//Заповнити масив випадковими значеннями. На парних індексах парними значеннями, на непарних індексах - непарними.
public class Task6 {
    public static int[] rightArray(int length, int limit) {
        int[] resultArray = new int[length];

        for (int i = 0; i < length; i++) {

            if (resultArray[i] % 2 == 0) {
                double random = Math.random();
                int element = (int) (limit * random);
                resultArray[i] = element % 2 == 0 ? element : + 1;
            } else {
                double random = Math.random();
                int element = (int) (limit * random);
                resultArray[i] =  element % 2 != 0 ? element: + 1;
            }
        }
        return resultArray;

    }
}