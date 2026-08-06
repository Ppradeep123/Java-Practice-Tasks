package Day11.collection;
import java.util.*;

public class Task1 {
    public static void main(String args[]){
        ArrayList<String> names=new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("pradip");

        System.out.println("names of student: "+ names);

        // names.get() method is used to get the element at a specific index in the ArrayList. The index starts from 0, so names.get(0) will return the first element in the list, which is "John".
        System.out.println(names.get(0));
System.out.println(names.contains("pradip"));
System.out.println(names.set(1,"ashish"));
 System.out.println("names of student: "+ names);
 System.out.println(names.size());
 System.out.println(names.isEmpty());

        // methods gets,set ,remove, size, clear, contains, isEmpty, indexOf, lastIndexOf, toArray, sort, reverse, shuffle, subList, clone, ensureCapacity, trimToSize, replaceAll, removeIf, retainAll, removeAll
    }
}
