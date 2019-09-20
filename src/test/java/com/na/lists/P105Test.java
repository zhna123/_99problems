package com.na.lists;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class P105Test {

    @Test
    public void testReverse() {
        List<String> original = Arrays.asList("1", "2", "3", "4", "5");
        List<String> expected = Arrays.asList("5", "4", "3", "2", "1");
        P105 p = new P105();
        List<String> result = p.reverse(original);
        Assert.assertTrue(result.equals(expected));
    }

    @Test
    public void testReverse2() {
        List<String> original = Arrays.asList("1", "2", "3", "4", "5");
        List<String> expected = Arrays.asList("5", "4", "3", "2", "1");
        P105 p = new P105();
        List<String> result = p.reverse2(original);
        Assert.assertTrue(result.equals(expected));
    }

    @Test
    public void testReverse3() {
        List<String> original = Arrays.asList("1", "2", "3", "4", "5");
        List<String> expected = Arrays.asList("5", "4", "3", "2", "1");
        P105 p = new P105();
        List<String> result = p.reverse3(original);
        Assert.assertTrue(result.equals(expected));
    }
}
