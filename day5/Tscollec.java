
import java.util.Set;
import java.util.TreeSet;

public class Tscollec {
        public static void main(String[] args)
        {
            Set<String> L=new TreeSet<String>();
            L.add("MANAS");
            L.add("NIT");
            L.add("192210293");
            System.out.println(L);
            L.remove("NIT");
            System.out.println(L);
    }
}
