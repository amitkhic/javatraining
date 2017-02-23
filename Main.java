public class Main {
    public static void main(String args[]) {
        Employee e = new Employee();
		System.out.println("Implementinh method Overloading using 1 argument, 2 arguments and 3 arguments");
        System.out.println("-------------------------------------------------");
        e.myMethod("Sameer");
        System.out.println("-------------------------------------------------");
        e.myMethod("Ajay", "New York");
        System.out.println("-------------------------------------------------");
        e.myMethod("Vijay", "New Jersey", 80000.00);
        System.out.println("-------------------------------------------------");
    }    
}
