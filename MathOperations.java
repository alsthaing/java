import java.util.Scanner;

/**
 * Write a description of class alstha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("First number?");
        int num1=sc.nextInt();
        System.out.println("Second number?");
        int num2=sc.nextInt();
        
        int sum=num1+num2;
        float sub=(float)num1-num2;
        int mul=num1*num2;
        double divide=(double)num1/num2;
        
        int mod=num1%num2;
        
        String greater=(num1>num2)? num1+"is greater":num2+"is greater";
        boolean is_equal=(num1==num2)?true:false;
        
        System.out.println("Sum"+sum+"\n"+"Subtract"+sub+"\n"+"Multiply"+mul+"\n"+"Divide"+divide+"\n"+"mod"+mod+"\n");
        System.out.println(greater+"\n"+is_equal);
        
        
    }
}