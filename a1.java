
package pkg1;
class OverloadDemo {
  void test () {
   System.out.println("No parameters"); 
 }

void test(int  a) {
 System.out.println("a: " + a);
}

void test (String a, String b) {
 System.out.println("a and b: "+a+" " + b); 
}

}

public class a1 {
    public static void main(String args[]) {
  OverloadDemo ob = new OverloadDemo();
 ob.test();
 ob.test(10);
 ob.test("hello","world ");
}
}

