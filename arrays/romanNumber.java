public class romanNumber {

    private static int number = 42;

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
        // ... continue filling until 3499
    }

    public static void main(String[] args) {
        String[] romans = new String[3499];
        populate(romans);

        if (number < 1 || number > 3499) {
            System.out.println("number out of range");
        } else {
            System.out.println(romans[number - 1]);
        }
    }
}

