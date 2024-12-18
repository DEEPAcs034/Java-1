/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examprac;
class employee1{
    private int id;
    private String name;
    private double salary;
    public employee1(int id , String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void raisesalary(double percent){
        double increment=salary*(percent/100);
        salary=increment+salary;
        System.out.println("the new salary"+salary);
    }
    public void employeedetails(){
         System.out.println("employee id:"+id);
         System.out.println("employeee name"+ name);
         System.out.println("employee salary"+salary);
            
}
}
public class D11_employee {
  public static void main(String[] args){
      employee1 ep =new employee1(1 ,"ganesh",500);
      ep.employeedetails();
      ep.raisesalary(20);
      ep.employeedetails();
  }
}
