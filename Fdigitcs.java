
import java .util .Scanner;
    public class Fdigitcs{
        public static void main (String[]args){
            Scanner input=new Scanner (System.in);
            int i,sum=0,num,count=0;
            System.out.println ("enter a number");
            num=input.nextInt();
            for(i=num;i!=0;i=i/10){
                sum=sum+(i%10);
                count++;
                
            }
            System.out.println(sum);
            System.out.println (count);
        }
    }
