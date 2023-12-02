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

        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);

        int resA = formula(aa);
        int resB = formula(bb);

        if (resA == resB){
            return aa - bb;
        }else {
            return resA - resB;
        }
    }

    private int formula(int x){
        return (5 * x) * (5 * x) +3;
    }
}
