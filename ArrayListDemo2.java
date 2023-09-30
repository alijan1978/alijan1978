package Class26;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('b');
        characters.add('d');
        characters.add('E');
        characters.add('F');
        characters.add('g');

        for(Character c  : characters){
            System.out.print(c+" ");
        }


    }
}
