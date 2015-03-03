package edu.bennington.cs;

public class Main {
    public static void main(String[] args) {

        System.out.println("i = " + Test.i);

        System.out.println("Printing values of 2 objects of Test Class:");

        Test t1 = new Test();
        Test t2 = new Test();

        System.out.println("Test object 1 = " + t1.i);
        System.out.println("Test object 2 = " + t2.i);

        System.out.println("Changing the value i of first object to 20.");

        t1.i = 20;

        System.out.println("Test object 1 = " + t1.i);
        System.out.println("Test object 2 = " + t2.i);

    }
}