package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alice Spring");
        linkedList.add("Melbourne");
        linkedList.add("Darwin");
        linkedList.add("Perth");
        linkedList.add("Sydney");
        linkedList.add("Adelaide");
//        System.out.println(linkedList);
//        print(linkedList);

        LinkedList<String> citiesToVisit = new LinkedList<>();
        addInOrder(citiesToVisit,"Alice Spring");
        addInOrder(citiesToVisit,"Melbourne");
        addInOrder(citiesToVisit,"Darwin");
        addInOrder(citiesToVisit,"Perth");
        addInOrder(citiesToVisit,"Sydney");
        addInOrder(citiesToVisit,"Adelaide");
        print(citiesToVisit);
    }

    static void print(LinkedList<String> linkedList){
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.nextIndex()+1 + ". " + listIterator.next() );
        }
    }

    static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(newCity);
            if (comparison==0){
                System.out.println(newCity + " can not be added as already exists!");
                return false;
            }else if (comparison>0){
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            }
        }
        listIterator.add(newCity);
        return true;
    }
}
