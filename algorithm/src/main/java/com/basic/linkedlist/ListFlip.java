package com.basic.linkedlist;

/*
 *@author hanyunzhuo
 *@date 2020/5/28 17:50
 */
public class ListFlip {

    public static void main(String[] args) {

        Node first = new Node("1");
        Node second = new Node("2");
        Node three = new Node("3");
        Node four = new Node("4");
        Node five = new Node("5");

        first.setNext(second).setNext(three).setNext(four).setNext(five);

        System.out.println(first);

        Node flip = flip(first);

        System.out.println(flip);

    }

    private static Node flip(Node node) {
        //链表翻转
        Node blank = new Node("");
        blank.next = node;

        return flipImpl(blank,node,node.next);
    }

    private static  Node flipImpl(Node blank,Node first,Node second){
        first.next = second.next;
        second.next = blank.next;
        blank.next = second;

        if(first.next != null){
            return flipImpl(blank,first,first.next);
        }else{
            return blank.next;
        }

    }

    //单向列表
    static class Node {

        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public Node setNext(Node next) {
            this.next = next;
            return next;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            getString(this, stringBuilder);
            return stringBuilder.toString();
        }

        private void getString(Node node, StringBuilder sb) {
            sb.append(node.getValue());
            if (node.next != null) {
                getString(node.getNext(), sb);
            }
        }
    }
}
