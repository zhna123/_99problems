package com.na.lists;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P102Test {

    P102 p102;

    @Before
    public void setup() {
        p102 = new P102();
    }

    @Test
    public void testLastButOne() {
        List<String> list = Arrays.asList("1", "2", "4", "5", "7");
        String actual = p102.lastButOne(list);
        Assert.assertEquals(list.get(list.size() - 2), actual);
    }
}
