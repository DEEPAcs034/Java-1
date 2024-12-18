
package examprac;
class DivByZeroException extends Exception{
    public DivByZeroException(String message){
        super(message);
    }
}

public class D1_exception {
    public static void main(String[] args){
        int a=10;
        int b=0;
        int result;
        try{
            if(b==0){
                throw new DivByZeroException("division by zero is not possible");
             }
            result=a/b;
        }
        catch(DivByZeroException e1){
            System.out.println(e1.getMessage());
        }
        catch(ArithmeticException e2){
            System.out.println(e2.getMessage());
        }
        finally{
             System.out.println("finally block excecuted");
        }
    }
}
