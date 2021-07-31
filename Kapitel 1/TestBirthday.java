import java.util.Scanner;

public class TestBirthday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean isRight = false;

        while (isRight == false) {
            System.out.println("Datum eingeben: ");
            try {
                new Birthday(sc.nextLine());
                System.out.println("Richtig");
                isRight = true;
            } catch (InvalidBirthdayException e) {
                System.out.println("Nochmal versuchen");
            }
        }
        sc.close();
    }
}
