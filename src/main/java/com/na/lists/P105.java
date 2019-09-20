package com.na.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Reverse a list
 */
public class P105 {

    public <T>List<T> reverse(List<T> list) {
        Collections.reverse(list);
        return list;
    }

    public <T>List<T> reverse2(List<T> list) {
        if (list.size() <= 1) {
            return list;
        }

        List<T> l = new ArrayList<>();
        l.add(list.get(list.size() - 1));
        l.addAll(reverse2(list.subList(0, list.size() - 1)));

        return l;
    }

    public <T> List<T> reverse3(List<T> list) {
        return IntStream.iterate(list.size() - 1, x -> x - 1).limit(list.size()).mapToObj(list::get).collect(toList());
    }
}
