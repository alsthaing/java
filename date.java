import java.util.Scanner;

/**
 * Write a description of class alstha here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class date
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days?");
        int days=sc.nextInt();
        int year=days/365;
        days=days-year*365;
        int months=days/30;
        days=days-months*30;
        int day=days;
        System.out.println("year"+year+"\n"+"months"+ months+"\n"+"day"+day);
        
        
    }
}