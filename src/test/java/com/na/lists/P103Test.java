package com.na.lists;

import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class P103Test {

    @Test
    public void testKthElement() {
        P103 p = new P103();
        List<String> list = Arrays.asList("1","3","2","8","12");
        Assert.assertEquals("12", p.kthElement(list, 5));
    }

    @Test
    public void testKthElement2() {
        P103 p = new P103();
        List<String> list = Arrays.asList("1","3","2","8","12");
        Assert.assertEquals("8", p.kthElement2(list, 4));
    }
}
