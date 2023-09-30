package Class26;

public class Demo1 {
    public static void main(String[] args) {

        String name = "Khadija jan";
        String name1 = "Sadeea jan";
        String name2 = "Abdullah jan";

        String [] names ={"Wajia jan", "Zainab jan", "Tahseen jan", "Ali jan"};
        displayNames(names);
        display2(name, name1, name2);
    }
    public static void displayNames(String []names){
        // We write the code here (enhanced for loop) to print all names from the Array
        for(String n : names){
            System.out.println(n);
        }
    }
    public static void display2(String name, String name1, String name2){
        System.out.println("---------------Which approach is better -----------");
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }
}
