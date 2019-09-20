package com.na.lists;

import java.util.List;

/**
 * Find the number of elements of a list.
 */
public class P104 {

    public <T> long size(List<T> list) {
        return list.stream().count();
    }

    public <T> long size2(List<T> list) {
        return list.stream().mapToInt(x -> 1).sum();

    }


}
