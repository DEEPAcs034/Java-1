/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
class Mythread extends Thread{
    public Mythread(String name){
        super(name);
       
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("thread"+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println("interupt occured");
            }
        }
    }
}

public class D4_Thread {
    public static void main(String[] args){
        Mythread t1=new Mythread("chlid thread");
        t1.start();
    }
            
}
