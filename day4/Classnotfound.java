public class Classnotfound {
        public static void main(String[] args) {
            try {
                Class.forName("rohini");
            } catch (ClassNotFoundException e) {
                System.out.println("there is an exception"+e);
            }
        }
}
