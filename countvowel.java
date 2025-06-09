import java.util.*;
public class countvowel{

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int vowel=0, consonant=0;
        System.out.println("enter string:");
        String str=in.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel+=1;
            }
            else{
                consonant+=1;
            }
        }
        System.out.println(" vowels\n"+vowel+"consonants"+consonant);
    }
}