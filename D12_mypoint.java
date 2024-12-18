/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
class mypoint{
    int x;
    int y;
    public mypoint(){
    this.x=0;
    this.y=0;
}
    public mypoint(int x1,int y1){
    this.x=x1;
    this.y=y1;
}
    public void setXY(int x1,int y1){
        this.x=x1;
        this.y=y1;
    }
    public int[] getXY(){
        int[] coordinates={x,y};
        return coordinates;
    }
    public double distance(int x1,int y1){
        int xdiff=this.x-x1;
        int ydiff=this.y-y1;
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
    public double distance(mypoint another){
        int xdiff=this.x-another.x;
        int ydiff=this.y-another.y;
        return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
}

public class D12_mypoint {
    public static void main(String[] args){
        mypoint p1= new mypoint();
        mypoint p2= new mypoint(3,4);
        p1.setXY(1,2);
        int[] coordinates=p1.getXY();
        System.out.println(p1.distance(5,6));
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());
        System.out.println(p1);
        
        
    }
}
