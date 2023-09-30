package Class26;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans.get(1));
        System.out.println(booleans.get(3)); // to show the index value
        System.out.println(booleans.size()); // to show the size how many arrayList

        for (int i = 0; i <booleans.size(); i++) {
            System.out.println(booleans.get(i)); // to show all the values of the ArrayList
        }

        System.out.println("_____using While Loop ________________\n");
        // The only difference between For loop and While Loop is that with For Loop the code is easier to read
        // than the While Loop to be a bit harder. But we can use both of them if we know the number of iterations

        int i = 0;
        while (i < booleans.size()){
            System.out.println(booleans.get(i));
            i++;
        }
    }
}
