    import java.util.Scanner;
public class Triangle{
public static void main (String[]args){
Scanner input=new Scanner(System.in);
double area,base,height;
System.out.println("enter the base of the triangle");
height=input.nextDouble();
System.out.println("enter the height of the triangle");
base=input.nextDouble();
area=0.5*base*height;
System.out.println("the area of the triangle is "+area);
}
}