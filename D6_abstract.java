/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
abstract class shape1{
    abstract double CalculateArea();
    abstract double CalculatePerimeter();
}
class Circle1 extends shape1{
    private double radius;
    public Circle1(double radius){
        this.radius=radius;
    }
    double CalculateArea(){
        return Math.PI*radius*radius;
    }
    double CalculatePerimeter(){
        return 2*Math.PI*radius;
    }
}
public class D6_abstract {
    public static void main(String[] args){
        Circle1 c1=new Circle1(5.0);
        System.out.println(c1.CalculateArea());
        System.out.println(c1.CalculatePerimeter());
    }
}
