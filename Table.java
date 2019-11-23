import java.util.Scanner;
public class Table{
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        int num,i;
        System.out.println("enter a number");
        num=input.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}