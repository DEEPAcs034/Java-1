/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
import java.util.Scanner;
class stack{
    int top;
    int s[]=new int[3];
    int len=s.length;
    stack(){
         top=-1;
    }
    void push(int item){
        if(len-1==top){
            System.out.println("the stack overflow");
        }
        else{
            top=top+1;
            s[top]=item;
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("the stack underflow");
        }
        else{
            int item=s[top];
            System.out.println(item+"is removed from the stack");
            top=top-1;
        }
    }
    void display(){
        if(top==-1){
            System.out.println("the stack underflow");
        }
        else{
            for(int i=top;i>=0;i--){
            System.out.println(s[i]);
            }
        }
    }
}
        

public class D10_stack {
    public static void main(String[] args){
        int ch;
        int item;
        stack stk=new stack();
        Scanner sc1=new Scanner(System.in);
        while(true){
            System.out.println("1.push,2.pop,3.display,4.exit,enter ur choice");
            ch=sc1.nextInt();
         switch(ch){
             case 1:System.out.println("enter the item");
                    item=sc1.nextInt();
                    stk.push(item);
                    break;
             case 2:stk.pop();
             break;
             case 3: stk.display();
             break;
             case 4: System.exit(0);
             break;
             default : System.out.println("invalid choice");
         }
        }
    }
}
