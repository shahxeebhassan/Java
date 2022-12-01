package com.Shahzaib.Inheritence;

class Box{
    int len;
    int wid;
    int height;
    Box(int len,int wid,int height){
        System.out.println("First Class Constructor");
        // super();
        this.len=len;
        this.wid=wid;
        this.height=height;
    }
}
class BoxWeight extends Box {
    int weight;
    BoxWeight(int len,int wid,int height,int weight){
        super(len,wid,height);
        System.out.println("Second Class Constructor");
        this.weight=weight;
        System.out.println(this.weight);
    }
}
class BoxColor extends BoxWeight{
    String color;
    BoxColor(int len,int wid,int height,int weight,String color){
        super(len,wid,height,weight);
        System.out.println("Third Class Constructor");
        this.color=color;
        System.out.println(this.color);
    }
}
/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        BoxWeight boxWeight=new BoxColor(10,20,30,40,"Pink");//cannot reference child class object with parent class constructor
        // Box box=new BoxWeight(10, 20, 30, 40);
    }
}
