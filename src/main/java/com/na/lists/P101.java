package com.na.lists;

import java.util.List;

/**
 * Find the last element of a list.
 */
public class P101 {

    public <T> T lastElement(List<T> list) {
        return list.get(list.size() - 1);
    }

    public <T> T lastElement_1(List<T> list) {
        return list.stream().reduce((first, second) -> second).orElse(null);
    }
}

