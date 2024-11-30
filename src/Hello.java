import java.util.Scanner;

public class Hello {
    public static void helloUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");
        String name = scanner.nextLine();
        String answer;
        do {
            System.out.println("Enter username");
            answer = scanner.nextLine();
            if (answer.equals(name)) {
                System.out.println("Hello " + name + "!");
            }
        } while (!answer.equals("stop"));
    }
}
