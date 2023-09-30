package Class26;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();

        names.add("Zainab");
        names.add("Zainab"); // We can add duplicate name
        //-------------------------------------------------------------
        ArrayList<String> studentNames = new <String>ArrayList();
        studentNames.add("Fatima");
        studentNames.add("Taiba");
        studentNames.add("Yousuf");
        studentNames.add("Aswa");
        studentNames.add("Hajira");
        System.out.println(studentNames);
        ArrayList<String> newstudentNames = new <String>ArrayList();
        studentNames.add("Mahmood");
        studentNames.add("ahmad");
        studentNames.add("hamid");
        studentNames.add("asra");
        studentNames.add("sahar");
        studentNames.addAll(2, newstudentNames);
        studentNames.addAll(newstudentNames); // add all the data of first ArrayList to this one

        System.out.println(studentNames);
// apt number
        ArrayList <Integer> aptNumber = new <Integer> ArrayList();
        aptNumber.add(12);
        aptNumber.add(15);

        ArrayList <Boolean> studentsAttandance = new <Boolean> ArrayList();
        studentsAttandance.add(true);
        studentsAttandance.add(false);
        studentsAttandance.add(true);
        studentsAttandance.add(false);
        studentsAttandance.add(true);

    }
}

