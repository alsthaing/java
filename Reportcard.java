import java.util.Scanner;

/**
 * Write a description of class alstha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reportcard
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("First number?");
        int num1=sc.nextInt();
        
        
        
        
        String result=(num1>40)?"Pass":"Not pass";
        
        
     
        System.out.println(result);
        
        
    }
}