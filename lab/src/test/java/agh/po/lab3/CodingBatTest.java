package agh.po.lab3;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, String> map1 =new HashMap<String, String>();
        map1.put("a","aaa");
        map1.put("b","aaa");
        map1.put("c","bbb");
        Map<String, String> map12 = Map.of("c","bbb");
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("c","bbb");
        Map<String, String> map22 = Map.of("c","bbb");

        Assert.assertEquals(map, cd.mapAB2(map));
        Assert.assertEquals(map12, cd.mapAB2(map1));
        Assert.assertEquals(map22 , cd.mapAB2(map2));
    }

    @org.junit.Test
    public void wordCount() {
        String[] x = {"a","a","b","c"};
        Map<String, Integer> map = Map.of("a", 2, "b", 1,"c",1);
        String[] y = {"a","a","a","a","a"};
        Map<String, Integer> map2 = Map.of("a",5);
        String[] z = {"b","c","b","c","b","c","b"};
        Map<String, Integer> map3 = Map.of("b",4,"c",3);
        Assert.assertEquals(map, cd.wordCount(x));
        Assert.assertEquals(map2, cd.wordCount(y));
        Assert.assertEquals(map3, cd.wordCount(z));
    }

}