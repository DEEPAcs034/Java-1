/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
import java.util.Scanner;
public class D9_matrixaddition {
    public static void main(String[] Args){
        int[][] matrix1=new int[2][2];
        int[][] matrix2=new int[2][2];
        int[][] matrix3=new int[2][2];
        System.out.println("next the size of the matrix");
        Scanner sc1=new Scanner(System.in);
        int n=sc1.nextInt();
        System.out.println("enter the elements of first matrix");
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                matrix1[j][i]=sc1.nextInt();
                
            }
        }
         System.out.println("enter the elements of second matrix");
         for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                matrix2[j][i]=sc1.nextInt();
                
            }
        }
          for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                matrix3[j][i]=matrix1[j][i]+matrix2[j][i];
                
            }
        }
           for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                System.out.println(matrix3[j][i]);
                
            }
        }
    }
    
}
