package agh.po.lab3;

import org.junit.Assert;

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
    }
    @org.junit.Test
    public void noTriplets() {
        Assert.assertTrue(cd.noTriples(new int[]{1, 1, 2, 2, 1}));
        Assert.assertFalse(cd.noTriples(new int[]{1, 1, 1, 2, 2}));
    }
    @org.junit.Test
    public void sum13() {
        Assert.assertEquals(6, cd.sum13(new int[]{1, 2, 3}));
        Assert.assertEquals(4, cd.sum13(new int[]{1, 2, 13, 2, 1, 13}));
        Assert.assertEquals(0, cd.sum13(new int[]{13, 1, 13}));
    }
}