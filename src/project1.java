import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("tanlang: ");
        System.out.println("1.Qizil, 2.Sariq, 3.yashil.");
        String rang = sc.next();
        switch (rang) {
            case "qizil":
                System.out.print("To'xta");
                break;
            case "sariq":
                System.out.print("tayyor");
                break;
            case "yashil":
                System.out.print("yur");
                break;
            default:
                System.out.print("xato");
                break;
        }
    }
}


