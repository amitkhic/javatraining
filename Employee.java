public class Employee {
    
    public void myMethod(String name) { 
       System.out.println("Name    : " + name);
   }
   public void myMethod(String name, String city) {       
       System.out.println("Name    : " + name);
       System.out.println("Address : " + city);
   }
   public void myMethod(String name, String city, double salary) {       
       System.out.println("Name    : " + name);
       System.out.println("Address : " + city);
       System.out.println("Salary  : $" + salary);   
   }
}
