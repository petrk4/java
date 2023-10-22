package com.company;

public class Main {
    public static void main(String[] args) {
        MyStringBuilder test = new MyStringBuilder("This is test string, used for MyStringBuilder construction.");
        test.append(10).append("1111");


        System.out.println(test);

        test.printList();

    }
}