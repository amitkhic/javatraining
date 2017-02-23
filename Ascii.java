import java.util.Scanner;
public class Ascii {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a valid password.");
        String s = sc.next();
        int upper=0, lower =0, digit =0;
        
        for(int i =0; i< s.length();i++) {
            char c = s.charAt(i);
            if(c>=48 && c<=57)
                digit++;
            else if(c>=65 && c<=90)
                upper++;
            else if(c>=97 && c<=122)
                lower++; 
        }
        if(upper>0 && lower>0 && digit>0)
            System.out.println("Correct Password!");
        else {
			System.out.println("Incorrect password.");
            if(upper<1)
                 System.out.println("Uppercase[A-Z] character is missing. Enter atleast one uppercase character. ");
            if(lower<1)
                System.out.println("Lowercase[a-z] character is missing. Enter atleast one lowercase character. ");
            if(digit<1)
                System.out.println("Number[0-9] is missing. Enter atleast one digit. ");
            
        }
    }
}
