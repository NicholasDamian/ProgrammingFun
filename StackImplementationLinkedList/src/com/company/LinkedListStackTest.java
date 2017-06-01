package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by nicholashall on 5/30/17.
 */
public class LinkedListStackTest {
    LinkedListStack<Integer> testList = new LinkedListStack<>();


    @Before
    public void setup(){
    }
    @Test
    public void testPushAndPop() {
        testList.push(9);
        testList.push(4);
        testList.push(4);
        testList.push(1);
        testList.pop();
        System.out.print(testList.toString());

    }


}