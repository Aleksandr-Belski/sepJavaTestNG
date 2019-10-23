import org.testng.annotations.Test;

import java.util.Arrays;

public class Day2 {
    @Test
    public void testPrintEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }


    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1, 2, 3, 4};
        swap(array, 1, 2);
        String arrayAsString = Arrays.toString(array);
        System.out.println(arrayAsString);
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    @Test
    public void testCountLetters() {
        String input = "hello world";
        int result = 0;
        for (char eachChar : input.toCharArray()) {
            if (eachChar == 'l') result++;
        }
        System.out.println(result);
    }

    @Test
    public void testArraySum() {
        int[] Array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        int i;

        for (i = 0; i < Array1.length; i++)
            sum += Array1[i];
        System.out.println(sum);

    }

    @Test
    public void testClassObjects() {
        Boxer boxer1 = new Boxer("George", "Foreman", 275, 77);
        Boxer boxer2 = new Boxer("Mike", "Tyson", 250, 70);

        boxer1.jab();
        System.out.println("Good strike");
        System.out.println("I eat in my head");

    }

    @Test
    public void testExample1() {
        for (int i = 1; i <= 6; i++)
            if (0 == i % 3) {
                System.out.println(i);
            }
    }

    @Test
    public void testExample2() {
        int[] Array = {1,2,3,4,4,5,6};
        for (int num : Array) {
            System.out.println("for-each enhanced loop" + num) ;
        }
    }

    @Test
    public void testExample4() {

            int my_array[ ] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = 0;

            for (int i : my_array)
                sum += i;
            System.out.println("The sum is " + sum);
        }


    }
