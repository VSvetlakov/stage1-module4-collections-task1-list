package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {

        sourceList.sort(new ListComparator());
    }
}



class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int result = getResult(a) - getResult(b);
        if (result == 0){
            return a.compareTo(b);
        }else {
            return result;
        }
    }

    private int getResult(String x){
        int num = Integer.parseInt(x);
        return 5 * num * num +3;
    }
}
