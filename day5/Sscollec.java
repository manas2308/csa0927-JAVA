import java.util.SortedSet;
import java.util.TreeSet;

public class Sscollec {
    public static void main(String[] args){
        SortedSet<String> L=new TreeSet<String>();
        L.add("Manas");
        L.add("loves");
        L.add("Cricket");
        L.add("and studies");
        System.out.println(L);
        L.remove("and studies");
        System.out.println(L);
    }
}
