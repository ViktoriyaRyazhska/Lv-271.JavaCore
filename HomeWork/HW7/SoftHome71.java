import java.util.*;

public class SoftHome71a {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<Integer>(Arrays.asList(new Integer[]{0, 2, 4, 5, 6, 8, 10}));
        Set<Integer> set2 = new TreeSet<Integer>(Arrays.asList(new Integer[]{5, 6, 7, 8, 9, 10}));
        union(set1,set2);
        intersect(set1,set2);
    }

        public static void union(Set set1, Set set2){
            Set<Integer> set3 = new TreeSet<Integer>(set1);
            set3.addAll(set2);
            System.out.println(set3);
        }

        public static void intersect (Set set1, Set set2){
            Set<Integer> set4 = new TreeSet<Integer>(set1);
            set4.retainAll(set2);
            System.out.println(set4);

        }

}

