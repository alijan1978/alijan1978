package Class26;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Wajia jan");
        names.add("Khadija jan");
        names.add("Sadeea jan");
        names.add("Abdullah jan");
        names.add("Zainab jan");
        names.add("Tahseen jan");
// Manipulation/changing is slow in ArrayList... Ex: if we remove Abdullah jan in index 3 ,
// since its stored in ArrayList, it checks all the indexes before that to find our desired index until it finds it..
// That's why, it makes it slower in process

        System.out.println(names.contains("Ali"));
        System.out.println(names);
        names.remove("Abdullah jan"); // Remove Abdullah jan by name text
        System.out.println(names);
        names.remove(4); // Remove Tahseen jan by index
        System.out.println(names);
        names.add("Tahseen jan");
        System.out.println(names); // again we added Tahseen jan

        names.set(4,"Abdullah"); // Replaced Abdullah with Tahseen jan in index 4
        System.out.println(names);
        System.out.println(names.indexOf("Sadeea jan")); // print the index of Sadeea jan


    }
}
