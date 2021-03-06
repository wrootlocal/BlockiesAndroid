package com.luminiasoft.ethereum.blockiesandroid.blockiesandroid;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Testing the BlockiesData class
 */
@RunWith(MockitoJUnitRunner.class)
public class BlockiesTest {
    private final String SEED = "0xe5bdF34F4cCC483e4ca530CC7Cf2Bb18fEbE92b3";

    @Test
    public void createImageData() throws Exception {
        BlockiesData blockiesData = new BlockiesData(SEED, BlockiesData.DEFAULT_SIZE);
        int[] data = blockiesData.getImageData();
        int[] expected = new int[]{0,0,0,2,2,0,0,0,0,0,2,0,0,2,0,0,0,2,1,2,2,1,2,0,0,0,1,1,1,1,0,0,2,2,2,0,0,2,2,2,1,1,1,2,2,1,1,1,1,0,1,0,0,1,0,1,0,1,1,1,1,1,1,0};
        Assert.assertArrayEquals("Checking expected image data",expected, data);
    }
}