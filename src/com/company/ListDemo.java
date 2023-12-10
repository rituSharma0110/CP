package com.company;

import java.util.Collection;
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        Collection<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(21);
        arrayList.add(22);
        arrayList.add(23);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(11);
        arrayList1.add(13);
        arrayList1.add(16);
        arrayList1.add(161);
        System.out.println(arrayList1);

        arrayList1.remove(3);
        System.out.println(arrayList1);//[1, 11, 13, 161]

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.remove(0);

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        arrayList1.removeAll(list1);
        System.out.println(arrayList1);//[1, 11, 161]--> this action removes the elements which are present in arraulist1


        List<Integer> list2 = list1.subList(0,3);
        System.out.println(list2);//[12, 13, 14] as index 3 is excluded-->[12, 13, 14, 40, 15]
        list2.add(40);
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);// however, we can print this list
        //System.out.println(list2);//--> concurrent modification error when we make structural change in original list
//        which is backed up by sublist , so when we try to proceed any method in sublist it would show
//        concurrent modification exception.

        List<Integer > list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(6);
        System.out.println(list3);

        for (int element: list3){
            if (element== 4){
                list3.remove(Integer.valueOf(element));//--> throws concurrent modification exception for this iterator is used
            }
        }
    }



}
