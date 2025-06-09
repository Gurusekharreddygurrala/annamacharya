import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("enter n");
         
        int n=scanner.nextInt();
        
        int []num1=new int[n];
        int []num2=new int[n];
       
        for(int i=0;i<n;i++){
            System.out.print("enter num1 values:");
            num1[i]=scanner.nextInt();
           
        }
         for(int i=0;i<n;i++){
             System.out.println("enter num2 values:");
            num2[i]=scanner.nextInt();
         }

         for(int i=0;i<n;i++){
            System.out.println("num1 values:"+num1[i]);
            System.out.println("num2 values:"+num2[i] );
         }
        }
    }