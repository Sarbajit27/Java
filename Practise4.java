import java.util.Scanner;
public class Practise4{
    public static int Sumnat(int n){
       int sum=0,i;
       for (i=1;i<=n;i++){
           sum=sum+i;
           
       }
       return sum;
    }
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        int n;
        System.out.println ("enter a number");
        n=input.nextInt();
        int n2=Sumnat(n);
        System.out.println ("the sum of natural numbers upto "+n+"is"+n2);


    }
}