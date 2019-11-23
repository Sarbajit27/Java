import java.util.Scanner;
public class Digitsum{
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        int i,sum=0,num;
        System.out.println("enter a number whose digit's sum you want to make");
        num=input.nextInt();
        for ( i=num;i!=0;i=i/10){
            sum=sum+(i%10);
        }
        System.out.println(sum);
    }
}