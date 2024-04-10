package com.nagarro.practicee;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.nagarro.thread.Add;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
    
    @Test
    public void shouldAnswerWithTrue()
    {
        Add add = new Add();
        assertEquals(4, add.add(2, 2));
    }
}
