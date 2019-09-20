package com.na.lists;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class P104Test {

    @Test
    public void testNumberOfElement() {
        P104 p = new P104();
        List<String> list = Arrays.asList("1", "3", "5", "10");
        Assert.assertEquals(list.size(), p.size(list));
    }

    @Test
    public void testNumberOfElement2() {
        P104 p = new P104();
        List<String> list = Arrays.asList("1", "3", "5", "10");
        Assert.assertEquals(list.size(), p.size2(list));
    }
}
