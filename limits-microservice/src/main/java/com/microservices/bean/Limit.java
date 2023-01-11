package main.java.com.microservices.bean;

public class Limit {
    private int minimum;
    private int maximum;
    public Limit(){

    }
    public Limit(int min, int max){
        this.minimum = min;
        this.maximum = max;
    }
    private int getMinimum(){
        return this.minimum;
    }
    private int getMaximum(){
        return this.maximum;
    }
}
