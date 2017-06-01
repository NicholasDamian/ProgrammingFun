package com.company;

/**
 * Created by nicholashall on 5/31/17.
 */
public class NodeValued<T> extends Node {

    private T data;

    public NodeValued(Node left, Node right, T data) {
        super(left, right);
        this.data = data;
    }


    public void preorderTraversal(NodeValued<Integer> root){
        if(root == null) return;
        System.out.print(root.getData() + " ");
        preorderTraversal((NodeValued<Integer>) root.getLeft());
        preorderTraversal((NodeValued<Integer>) root.getRight());
    }

    public T getData() {
        return data;
    }



}
