package com.basic;

public class VariableExample {
    int a=10;    // instance variable
    static int b=20;   //static variable
    public void add()
    {
        int c=30;        //local variable
        int addition=a+b+c;
        System.out.println("Addition ::" +addition);
    }
    public void multiply()
    {
        int d=30;        //local variable
        int mult=a*b*d;
        System.out.println("Multiplication ::" +mult);
    }

    public static void main(String[] args) {
        VariableExample vx=new VariableExample();
        vx.add();
        vx.multiply();
    }
}
