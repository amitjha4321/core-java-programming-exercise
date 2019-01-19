package collectionpractice;

import java.lang.reflect.Array;
import java.util.*;

public class SetDemp {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        HashSet<String> set = new HashSet<String>();
        set.add("Ram");
        set.add("Shyam");
        set.add("Mohan");
        set.add("Jack");
        set.add("John");
        set.add("Shyam");
        set.add("shyam");
        HashSet<String> set2 = new HashSet<String>(set);
        System.out.println(set2);
        set2.add("hari");
        set2.addAll(set);


        set.add("Ram");
        set.add("Shyam");
        set.add("Mohan");
        set.add("Jack");
        set.add("John");
        set.add("Shyam");
        set.add("shyam");


        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));


        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(arr);

        /*
        public static List<Integer> asList(Integer[] arr){
            List<Integer> list = new ArrayList<>();
            for (int i: arr){
                list.add(i);
            }
            return list;
        }

         */
        b.addAll(Arrays.asList(arr));


       // System.out.println(set);

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()){
            String str = itr.next();

            System.out.print(str + "  ");
        }

        set.remove("Moham");
       // System.out.println(set);

    }
}
