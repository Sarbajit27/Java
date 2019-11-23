public class Loop{
    public static void main (String[]args){
        // int num =101;
        // boolean is_prime=true;
        //  for(int i=2;i<num;i++){
        //     if (num%i==0){               //loop to find a number wehther it is prime or not
        //         is_prime=false;
        //         break;
        //     }  
        // }
        // if(is_prime==true){
        //     System.out.println("number is prime");
        // }
        // else{
        //     System.out.println("number is not prime");
        // }
        int num=3;
        boolean is_prime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                is_prime=false;break;
            }
        }
        if(is_prime==true){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
 }