
package pkg1;


public class A3 {
    class InnerClass{
        void display(){
            System.out.println("hello from innerclass");
        }
    }
    public static void main(String[] args){
        A3 outer=new A3();
        A3.InnerClass inner=outer.new InnerClass();
        inner.display();
   }
}
