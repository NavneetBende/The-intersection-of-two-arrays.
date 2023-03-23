import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        
        for (int i : array1) {
            set1.add(i);
        }
        
        for (int i : array2) {
            set2.add(i);
        }
        
        set1.retainAll(set2);
        
        System.out.println("Intersection of array1 and array2: " + set1);
    }
}

