    import java.util.Scanner;
public class SumInput{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("enter a number");
        num1=input.nextInt();
        System.out.println("enter another number");
        num2=input.nextInt();
        sum=num1+num2;
        System.out.println("sum of the above numbers are "+sum);
    }
}