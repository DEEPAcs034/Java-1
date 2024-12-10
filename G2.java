
package pkg1;
class DivByZeroException extends Exception{
    public DivByZeroException(String message){
        super(message);
    }
}

public class G2 {
    public static void main(String[] args){
        System.out.println("Exception");
        int nr=10;
        int dr=0;
        int result;
        try{
            result=nr/dr;
            if(dr==0){
                throw new DivByZeroException("division by zero are not allowed");
            }
            
        }
        catch(DivByZeroException e1){
            System.out.println("printing in first catch block");
         System.out.println(e1.getMessage());    
        }
        catch(ArithmeticException e2){
            System.out.println("printing in second catch block");
             System.out.println(e2.getMessage());
        }
        finally{
             System.out.println("Finally block executed");
            
        }
    }
  
}
    

