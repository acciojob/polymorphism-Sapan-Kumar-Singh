package com.driver;

public class Main {

    public static class Product{

        public int product(int x,int y){
            int prod1=x*y;
            return prod1;
        }
        public int product(int x,int y,int z){
            int prod2=x*y*z;
            return  prod2;
        }
        public double product(double x,double y){
            double prod3=x*y;
            return  prod3;
        }
    }

    public void main(String[] args){
        Product p= new Product();
       int a= p.product(1,2);
       int b= p.product(1,2,3);
      double c=p.product(2.3,2.5);
      System.out.println(a+" "+b+" "+c);
    }

}