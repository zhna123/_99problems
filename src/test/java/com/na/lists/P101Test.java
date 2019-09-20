package com.na.lists;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P101Test {

    P101 p;

    @Before
    public void before() {
        p = new P101();
    }

    @Test
    public void testLastElement() {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        Assert.assertEquals("5", p.lastElement(list));
        Assert.assertEquals("5", p.lastElement_1(list));
    }
}
