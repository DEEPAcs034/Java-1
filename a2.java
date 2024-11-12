
package pkg1;

class factorial{
    int fact(int n){
        int result;
        if(n==1)
           return 1;
        else
        result=fact(n-1)*n;
        return result;
    }
}
public class a2 {
    public static void main(String args[]){
        factorial f=new factorial();
        System.out.println(f.fact(3));
    }
}
