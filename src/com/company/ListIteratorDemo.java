package com.company;

import java.util.ArrayList;
import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");
        stringList.add("f");
        stringList.add("abdc");

        System.out.println(stringList);
        ListIterator<String> listIterator = stringList.listIterator();
     /*   while (listIterator.hasNext()){
            if (stringList.contains("c")) {
                System.out.println(listIterator.next());
                System.out.println(listIterator.previous());//--> infinite loop
            }
        }

      */
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex()+ ". " + listIterator.next());
            // remember list is 0 based as array .
        }

        listIterator.previous();
        listIterator.previous();
        listIterator.remove();// to remove f we have to use two previous method

        System.out.println("After removal : " + stringList);
  /*      listIterator.set("a");
        System.out.println("After setting a : " + stringList);//--> illegal state exception as the preceding call before the set should be previous or next.

   */
        listIterator.next();
        listIterator.set("a");//it will set the element where the last cursor was there.
        System.out.println(stringList);
    }
}
// Iterator does not provide set method, we can directly set a value in an arraylist by using for each loop.
