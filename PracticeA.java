import java.util.Scanner;
public class PracticeA{
    public static void main (String[]args){
        int i,x,r;
        Scanner input=new Scanner (System.in);
        System.out.println("enter a number");
        x=input.nextInt();
        
    for(i=x;i!=0;i=i/10){
        r=i%10;
        System.out.println(r);
    }
    }
}