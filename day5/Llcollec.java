import java.util.LinkedList;
import java.util.List;

public class Llcollec {
    public static void main(String[] args){
        List<String> L=new LinkedList<String>();
        L.add("ABC");
        L.add("DEF");
        L.add("GHI");
        System.out.println(L);
        L.remove("GHI");
        System.out.println(L);
        L.add("MK");
        System.out.println(L);
    }
}

