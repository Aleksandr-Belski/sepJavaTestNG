import org.testng.annotations.Test;

import java.util.Arrays;

public class Day1 {

    @Test
    public void testMethod1() {
        System.out.println("Hello, World");
    }

    @Test
    public void testNumbers() {
        int myNumber = 5;
        double d  = 4.5;

        System.out.println(myNumber);
        System.out.println(d);
    }

    @Test
    public void testCharsAndString() {
     char letterM = 'M';
     String s2 = "Who did it?";
     String s3 = "shuba duba";

        System.out.println(s3);
        System.out.println(letterM);
        System.out.println(s2);
    }

    @Test
    public void testConcat()  {
        int numberOfCookies = 4;
        String message = "I have " + numberOfCookies + " cookies";
        System.out.println(message);
    }

    @Test
    public void testBoolean()  {
        boolean b = true;
        System.out.println(b);
    }

    @Test
    public void testOperators() {
        boolean value1  = true;
        boolean value2 = false;
        System.out.println(!value1);
        System.out.println(!value2);
        System.out.println(value1 || value2);
        System.out.println(value1 && value2);
    }

    @Test
    public void testConditionals() {
        int a = 5;
        int b = 6;
        int c = 7;

        boolean result;
        result = a < b;
        System.out.println(result);

        result = a > b;
        System.out.println(result);

        result = a <=7;
        System.out.println(result);

        result = a == b;
        System.out.println(result);

        result = a != b;
        System.out.println(result);

        result = 8 > a && a > 4.9;
        System.out.println(result);

        if (c == 7) {
            System.out.println("ok, c equals 7");
        } else {
            System.out.println("hm, c not equals 7");
        }
    }

    @Test
    public void testArrays() {
        int[] arrayOfInt = {1,2,3,4,5,6,7,8,9};
        arrayOfInt [5] = 99999;
        String result = Arrays.toString(arrayOfInt);
        System.out.println(result);
    }

    @Test
    public void testArrays1() {
int [] arrayOfIntegers = {100, 200, 333,
        444};
        System.out.println(arrayOfIntegers.length);

    }

    @Test
    public void testDoubleArray() {
        String [][] names;
        names = new String[][]{
                {"Mr. ","Ms. ","Mrs. " },
                {"Johns", "Jackson", "Williams"}
        };
        System.out.println(names [1][1] + names [1][2]);
    }

    @Test
    public void testSummarizing() {
        int result = 1+2;
        System.out.println(result);
        int original_result = result;

        result = result -1;
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;
    }
}



