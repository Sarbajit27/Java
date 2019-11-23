import java.util.Scanner;
public class Function5{
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        int num,largest=1,i,y;
        System.out.println("enter a number whose largest digit you want to find");
        num=input.nextInt();
        for(i=num;i!=0;i=i/10){
            y=i%10;
            if(y>largest){
                largest=y;
            }
        }
        System.out.println (largest);

    }
}