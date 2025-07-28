import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> f=new HashSet<>();
        f.add("hello");
        f.add("hi");
        System.out.println("elements:"+f);
        f.remove("hi");
        System.out.println("elements:"+f);
            
    }
}