/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
class MyRunnable implements Runnable{
@Override
public void run(){
try{
Thread.sleep(5);
System.out.println("Threads"+Thread.currentThread().getId()+"running");
}
catch(InterruptedException e){
    e.printStackTrace();
}
}
}
public class D3_runnable {
    public static void main(String[]args){
        MyRunnable run1=new MyRunnable();
        Thread t1=new Thread(run1);
        t1.start();
    }
}
