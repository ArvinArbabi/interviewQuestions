import java.util.Scanner;

public class romanNumber {

    public static void populate(String[] a) {
        a[0] = "I";
        a[1] = "II";
        a[2] = "III";
        a[3] = "IV";
        a[4] = "V";
        a[5] = "VI";
        a[6] = "VII";
        a[7] = "VIII";
        a[8] = "IX";
        a[9] = "X";
        // … continue up to 3499
    }

    public static void main(String[] args) {
        String[] romans = new String[3499];
        populate(romans);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1–3499): ");
        int n = sc.nextInt();

        if (n < 1 || n > 3499) {
            System.out.println("Out of range!");
        } else {
            System.out.println("Roman numeral: " + romans[n - 1]);
        }
    }
}
