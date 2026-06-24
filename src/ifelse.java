import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("vazningizni kiriting");
        int vazn = sc.nextInt();

        if (vazn < 18.5) {
            System.out.print("ozgin");
        } else if (vazn > 18.5 && vazn < 25) {
            System.out.print("normal");
        } else if (vazn > 25 && vazn < 30) {
            System.out.print("ortiqcha vazn");
        } else {
            System.out.print("semiz");
        }
    }
}