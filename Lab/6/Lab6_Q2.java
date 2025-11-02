//Lab 6: Question 2
import java.util.ArrayList;
import java.util.Collections;
public class Lab6_Q2 {
    public static void main(String[] args) {

        //i. Creating new arraylist;
        ArrayList<Integer> list = new ArrayList<>();

        //ii. Adding 10 elements into it
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        //iii. Printing all elemets
        System.out.println("iii. Experiment 2 List: \n" + list);

        //iv. Removing 3rd Element from list
        System.out.println("\niv. Removed 3rd Element: " + list.remove(2) + "\nNew List: " + list);

        //v.Update 4th element 
        System.out.println("\nv. Updating 4th Element: " + list.set(3, 500) + "\nUpdated List: " + list);

        //vi.Sorting list
        System.out.println("\nvi. Existing List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        //vii.Copying list
        System.out.println("\nvii. Existing List: " + list);
        ArrayList<Integer> list2 = new ArrayList<>(list);
        System.out.println("Copied List: " + list2);

        //viii.Reversing new list 
        System.out.println("\nviii. Existing List: " + list2);
        Collections.reverse(list2);
        System.out.println("Reversed List: " + list2);

        //ix. Merging both list 
        System.out.println("\nviii. Existing List: " + list + " and " + list2);
        list.addAll(list2);
        System.out.println("Merged List: " + list);

    }
}
