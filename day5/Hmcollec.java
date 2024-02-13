import java.util.HashMap;

public class Hmcollec {
    public static void main(String[] args){
        HashMap<String,Integer> L=new HashMap<String,Integer>();
        L.put("Manas",23);
        L.put("Kukku",8);
        L.put("Deepu",21);
        System.out.println("size of map:"+L.size());
        System.out.println(L);
        L.remove("Deepu",21);
        System.out.println(L);
    }
}
