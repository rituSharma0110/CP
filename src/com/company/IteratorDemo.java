package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);

       /* for (int element : list){
            System.out.println(element);

            if (element == 14){
                list.remove(Integer.valueOf(14));//--> exception when reached after 14
            }
        }*/

        // ways to overcome concurrent modification exception
//        1. Using traditional for loop
        for (int i=0;i< list.size();i++){
            if (list.contains(14)){
                list.remove(Integer.valueOf(14));
            }
        }
        System.out.println(list);

        // 2. Using iterator
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int element = iterator.next();
            if (element== 15){
                iterator.remove();
            }
        }
        System.out.println("After using iterator : " + list);

        List<Integer> list1 = new ArrayList<>();
        Iterator<Integer> iterator1 = list1.iterator();

        list1.add(1);
        list1.add(19);
        list1.add(18);
        list1.add(17);
        list1.add(15);
        list1.add(12);

        while (iterator1.hasNext()){
            int element =iterator1.next();
            System.out.println(element);// --> concurrent modification exception asA java.util.ListIterator allows you to
            // modify a list during iteration, but not between creating it and using it.
        }
//        instead of this always add elements in the list and then create list iterator

    }
}
