package Class26;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        // Wrapper Classes:
     /* byte -> Byte
        short -> Short
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        char -> Character
        boolean -> Boolean
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15); // ArrayList maintains insertion order... like: 15 is the first
        numbers.add(20);
        numbers.add(25);
        numbers.add(65);
        numbers.add(55);
        numbers.add(200);
        System.out.println(numbers);



    }
}
