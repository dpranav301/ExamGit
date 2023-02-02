import java.util.Scanner;

public class menu {
    static int choice;
    static boolean flag;

    public static void main(String[] args) {
        System.out.println("Menu Driven program");
        System.out.println("Enter Your Choice");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        do {
            switch (choice) {
                case 1:
                    System.out.println("Hello You Select Choice 1");
                    break;
                case 2:
                    System.out.println("Hello You Select Choice 2");
                    break;
                default:
                    System.out.println("Sorry");
            }
            System.out.println("Do Want to Continue yes the write true else write false");
            flag = sc.nextBoolean();
        } while (flag);
    }
}
