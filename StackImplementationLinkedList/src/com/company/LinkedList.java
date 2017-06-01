package com.company;

public class LinkedList<T> {

    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<T> first = null;

    public void addFirst(T data){
        Node<T> node = new Node(data);
        node.next = first;
        first = node;
    }

    public T removeFirst() {
        Node<T> oldFirst = first;
        first = first.next;
        return oldFirst.data;
    }




    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node current = first;
        while (current != null) {
            builder.append(current).append(" ");
            current = current.next;
        }
        return builder.toString();
    }

    public boolean isEmpty() {
        return first == null;
    }

//    public T removeLast(){
//
//
//    }

}
