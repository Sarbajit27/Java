import java.util.Scanner;
public class Function3{
    public static  int evenodd (int n){
        if (n%2==0){
            return 0;
        }
        else{return 1;}
    }
    public static void main (String[]args){
        Scanner input=new Scanner (System.in);
        int num;
        System.out.println ("enter a number");
        num=input.nextInt();
        System.out.println (evenodd (num))
;
    }
}