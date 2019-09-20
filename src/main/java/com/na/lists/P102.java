package com.na.lists;

import java.util.List;

/**
 * Find the last but one element of a list.
 */
public class P102 {

    public <T> T lastButOne(List<T> list) {

        if (list.size() <2) {
            throw new IllegalArgumentException("list size has to be bigger than or equal to 2");
        }

        if (list.size() == 2) {
            return list.get(0);
        }

        return lastButOne(list.subList(1, list.size()));
    }
}
