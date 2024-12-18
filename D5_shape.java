/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
class Shape{
    public void draw(){
        System.out.println("drawing shape");
    }
    public void erase(){
       System.out.println("erasing a shape");
    }
}
class Circle extends Shape{
     public void draw(){
        System.out.println("drawing circle");
    }
    public void erase(){
       System.out.println("erasing a circle");
    }
}   
class Triangle extends Shape{
     public void draw(){
        System.out.println("drawing Triangle ");
    }
    public void erase(){
       System.out.println("erasing a Triangle ");
    }
}         
class Square extends Shape{
     public void draw(){
        System.out.println("drawing Square");
    }
    public void erase(){
       System.out.println("erasing a Square");
    }
}         

public class D5_shape {
    public static void main(String[] args){
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(); 
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        for(int i=0;i<shapes.length;i++){
            shapes[i].draw();
            shapes[i].erase();
        }
    }
}
