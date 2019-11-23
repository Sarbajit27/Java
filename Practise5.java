import java.util.Scanner;
public class Practise5{
    public static int sum (int a,int b){
       int n;
       n=a+b;
       return n;
    }
    public static int square(int n){
        return n*n;
    }
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        int a;
        System.out.println ("enter a number");
        a=input.nextInt();
        int b;
        System.out.println ("enter another number");
        b=input.nextInt();
        int  s;
        s=sum(a,b);
        int t;
        t= square(s);
        System.out.println ("The result of the data entered" +t);


    }
}