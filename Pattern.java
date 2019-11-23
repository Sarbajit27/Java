import java.util.Scanner;
public class Pattern{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
int row,i,j;
System.out.println("how many lines of pattern do you want");
row=input.nextInt();
for(i=1;i<=row;i++){
    for(j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}