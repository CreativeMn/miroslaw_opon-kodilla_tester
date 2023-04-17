import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą literę koloru:");
        String firstLetter = scanner.nextLine();

        switch (firstLetter) {
            case "b":
                System.out.println("Biały");
                break;
            case "c":
                System.out.println("Czerwony");
                break;
            case "f":
                System.out.println("Fioletowy");
                break;
            case "p":
                System.out.println("Pomarańczowy");
                break;
            case "r":
                System.out.println("Różowy");
                break;
            case "z":
                System.out.println("Zielony");
                break;
            default: System.out.println("Kolor niedostępny.");
        }
    }
}