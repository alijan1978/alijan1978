package Class26;

import javax.swing.*;

public class BoxingDemo {
    public static void main(String[] args) {

        // Boxing -> convert primitive data type to Wrapper class with upper case
        // UnBoxing -> convert the Wrapper to normal primitive data type

        int number = 15; // This number instance variable is stored inside method with Primitive data type
        printData(number); // we created method of static... no need to create object
        // This conversion of primitive to Wrapper or Boxing is just for Wrapper class

        Integer num = 10; // autoboxing from primitive int to Integer Wrapper type
        int num1 = num; // auto-unboxing from Wrapper type to primitive int type
    }

    public static void printData(Integer number){
        System.out.println(number);
    }

}
