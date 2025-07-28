import java.util.*;
public class strac{
    public static void main(String []args){
        String str="guywelcom";
        
       if(str.length()>9){
        System.out.print(str.charAt(0));
        System.out.print(str.length());
        System.out.println(str.charAt(str.length()-1));
       }
       else{
        System.out.println(str);
       }
    }
}