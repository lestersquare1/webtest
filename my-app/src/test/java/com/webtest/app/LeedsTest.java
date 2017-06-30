package com.webtest;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

/**
 * Created by User on 30/06/2017.
 */
public class LeedsTest extends TestCase {
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testGetCapitalCityOf() throws Exception {

        String well = "New Zealand";
        Leeds test = new Leeds();

        String result1 = test.getCapitalCityOf(well);
        Assert.assertEquals("Wellington", result1);

        String canb = "Australia";
        Leeds test2 = new Leeds();

        String result2 = test.getCapitalCityOf(canb);
        Assert.assertEquals("Not Found", result2);

    }

}