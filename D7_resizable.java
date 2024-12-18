/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
interface resizable{
    void resizableheight(int height);
    void resizablewidth(int width);
}
class rectangle implements resizable{
    private int height,width;
    public rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    public void resizableheight(int height){
        this.height=height;
    }
    public void resizablewidth(int width){
        this.width=width;
    }
    public void display(){
        System.out.println("height:"+height+"width:"+ width);
    }
}
public class D7_resizable {
    public static void main(String[] args){
        rectangle r1=new rectangle(5,7);
        r1.display();
        r1.resizableheight(10);
        r1.resizablewidth(5);
        r1.display();
    }
}
