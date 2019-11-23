import java .util.Scanner;
public class Digitsum2{
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        int i,sum=0,num;
        System.out.println ("enter a number whose digit's sum you want to print");
        num=input.nextInt();
        i=num;
          
            while(i!=0){

          
            sum=sum+(i%10);
            i=i/10;
         
        }
        System.out.println(sum);

    }
}