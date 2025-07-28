import java.util.LinkedList;
public class linkedl{
    public static void main(String []args){
        LinkedList<String> li=new LinkedList<>();
        li.add("apple");
        li.addFirst("hi");
        li.addLast("bye");
        System.out.println(li);
        System.out.println(li.size());
        li.removeFirst();
        System.out.println(li.contains("hello"));


    }
}