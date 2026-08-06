package Day11.collection;
import java.util.*;
public class Task2 {
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();
        set.add("java");
        set.add("python");
        set.add("java");
        System.out.println(set);
    }
}
//Duplicate removed automatically in hashset 