package agh.po.lab3;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cd = new CodingBat();
    @org.junit.Test
    public void doubleX() {
        Assert.assertTrue(cd.doubleX("axxbb"));
        Assert.assertFalse(cd.doubleX("axaxax"));
        Assert.assertTrue(cd.doubleX("xxxxx"));
    }

    @org.junit.Test
    public void array123() {
        Assert.assertTrue(cd.array123(new int[]{1, 1, 2, 3, 1}));
        Assert.assertFalse(cd.array123(new int[]{1, 1, 2, 4, 1}));
        Assert.assertFalse(cd.array123(new int[]{1, 2, 1, 3, 1, 2, 1}));
    }
    @org.junit.Test
    public void noTriplets() {
        Assert.assertTrue(cd.noTriples(new int[]{1, 1, 2, 2, 1}));
        Assert.assertFalse(cd.noTriples(new int[]{1, 1, 1, 2, 2}));
        Assert.assertTrue(cd.noTriples(new int[]{1, 2, 1, 2, 3, 3, 1}));
    }
    @org.junit.Test
    public void sum13() {
        Assert.assertEquals(6, cd.sum13(new int[]{1, 2, 3}));
        Assert.assertEquals(4, cd.sum13(new int[]{1, 2, 13, 2, 1, 13}));
        Assert.assertEquals(0, cd.sum13(new int[]{13, 1, 13}));
    }
    @org.junit.Test
    public void mapAB2() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c", "bbb");
        Assert.assertEquals(map, cd.mapAB2(map));
    }
    @org.junit.Test
    public void wordCount() {
        String[] x = {"a","a","b","c"};
        Map<String, Integer> map = Map.of("a", 2, "b", 1,"c",1);
        Assert.assertEquals(map,cd.wordCount(x));
    }

}