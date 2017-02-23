public class Exception {    
    public static void main(String args[]) throws ArithmeticException, ArrayIndexOutOfBoundsException  { 
        int a[] = {1,2};
        try{            
            int denominator = 0;            
            int result = a[1]/denominator;
            if(denominator==0)
                throw new ArithmeticException("A Divisor cannot be zero.");            
            a[2] = 9;            
        }catch(ArithmeticException ae) {
            System.out.println("Error Message : " + ae.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException ai) {
            System.out.println("Exception thrown: " + ai);
        }finally {
            System.out.println("This is Finally block");
        }
    }
}