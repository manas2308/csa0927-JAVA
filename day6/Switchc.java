import java.util.Scanner;

public class Switchc {
    public static void main(String[] args){
        Scanner mk=new Scanner(System.in);
        System.out.println("enter a number from 1-10:");
        int M=mk.nextInt();
        switch(M){
            case 1:
                System.out.println("good morning");
                break;
            case 2:
                System.out.println("Good afternoon");
                break;
            case 3:
                System.out.println("good evening");
                break;
            case 4:
                System.out.println("good night");
                break;
            case 5:
                System.out.println("have you ate anything");
                break;
            case 6:
                System.out.println("just get off");
                break;
            case 7:
                System.out.println("get out");
                break;
            case 8:
                System.out.println("you are suspended");
                break;
            case 9:
                System.out.println("i am pubg player");
                break;
            case 10:
                System.out.println("i am single");
                break;
            default:
                System.out.println("enter valid number between 1 to 10");
        }
    }
}
