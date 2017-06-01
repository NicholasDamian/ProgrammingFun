package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nicholashall on 5/31/17.
 */
public class NodeValuedTest {
    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void testing_preorderTraversal(){
        NodeValued<Integer> node12 = new NodeValued<>(null,null,12);
        NodeValued<Integer> node8 = new NodeValued<>(null,null,8);
        NodeValued<Integer> node6 = new NodeValued<>(null,null,6);
        NodeValued<Integer> node4 = new NodeValued<>(null,null,4);
        NodeValued<Integer> node10 = new NodeValued<>(node8,node12,10);
        NodeValued<Integer> node5 = new NodeValued<>(node4,node6,5);
        NodeValued<Integer> root = new NodeValued<>(node5,node10,7);

        root.preorderTraversal(root);

    }

}