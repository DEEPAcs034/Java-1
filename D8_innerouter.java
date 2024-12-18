/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
class outerclass{
    public void display(){
        System.out.println("hi from outer class");
    }
    class innerclass{
        public void display(){
             System.out.println("hi from inner class");
        }
    }
}

public class D8_innerouter {
    public static void main(String[] args){
        outerclass o1=new outerclass();
        o1.display();
        outerclass.innerclass i1=o1.new innerclass();
        i1.display();
        
    }
}
