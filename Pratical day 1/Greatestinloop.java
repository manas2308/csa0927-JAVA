public class Greatestinloop {
    public static void main(String[] args) {
        int[] loop1 = {10, 20, 30};
        int[] loop2 = {15, 25, 35};
        int maxLoop1 = Integer.MIN_VALUE;
        int maxLoop2 = Integer.MIN_VALUE;
        for (int num : loop1) {
            if (num > maxLoop1) {
                maxLoop1 = num;
            }
        }
        for (int num : loop2) {
            if (num > maxLoop2) {
                maxLoop2 = num;
            }
         System.out.println(+num);
        }
    }
}