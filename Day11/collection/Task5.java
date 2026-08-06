package Day11.collection;

import java.util.*;

public class Task5 {
    public static void main(String args[]) {
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Pradeep");
        employees.add("Rahul");
        employees.add("Amit");

        Collections.sort(employees);

        System.out.println(employees);

        // reverse is used to reverse the order of the elements in the list

        Collections.reverse(employees);
        System.out.println(employees);

        /// shuffle is used to randomly arrange the element
        /// 
        Collections.shuffle(employees);
        System.out.println(employees);

        Collections.max(employees);
        System.out.println(employees);
        Collections.min(employees);
        System.out.println(employees);
    }
}
