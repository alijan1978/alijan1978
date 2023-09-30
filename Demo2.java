package Class26;

public class Demo2 {
    public static void main(String[] args) {

        String name ="Tahseen jan";

        String [] names ={"Wajia jan", "Zainab jan", "Tahseen jan", "Ali jan"};
   // Create a method which can search a name from this array, return true if "Sadeea jan" is present in this array

        System.out.println(contains(name,names));
    }

    public static boolean contains(String nameToBeSearched, String[]names){

        for(String name : names){
            if(nameToBeSearched.equals(name)){
                return true;
            }
        }
        return false;
    }


}
