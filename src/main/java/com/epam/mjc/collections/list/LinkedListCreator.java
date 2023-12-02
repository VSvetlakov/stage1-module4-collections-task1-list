package com.epam.mjc.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        Iterator<Integer> iterator = sourceList.iterator();

        while(iterator.hasNext()) {
            Integer element = iterator.next();

            if(isOdd(element)){
                linkedList.addFirst(element);
            }else {
                linkedList.add(element);
            }
        }

        return linkedList;
    }

    private boolean isOdd(Integer a){
        return (a % 2 != 0);
    }
}
