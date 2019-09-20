package com.na.lists;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find the K'th element of a list.
 */
public class P103 {


    public <T> T kthElement(List<T> list, int k) {
        if (k == 1) {
            return list.get(0);
        }
        return kthElement(list.subList(1, list.size()), k - 1);
    }

    // use stream
    public <T> T kthElement2(List<T> list, int k) {
        return list.stream().limit(k).collect(Collectors.toList()).get(k-1);
    }
}
