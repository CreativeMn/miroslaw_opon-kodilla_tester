import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Podaj rok: ");
        year = getInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Rok przestępny.");
        } else {
            System.out.println("Rok nieprzestępny.");
        }
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}

