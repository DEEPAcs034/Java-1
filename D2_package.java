/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
import pkg1.MyPackage;
class MyPackage1{
    public void display(){
        System.out.println("this is a messgae from the pkg examprac");
    }
}
public class D2_package {
    public static void main(String[] args){
        MyPackage1 obj1= new MyPackage1();
        obj1.display();
        MyPackage obj2=new MyPackage();
        obj2.display();
    }
}
