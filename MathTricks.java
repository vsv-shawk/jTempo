public class MathTricks {
    /**
     * Return interger of reversed digits
     */
    public static int reverseInteger(int x) {
        int result = 0;
        int pow_of_ten = 1;
        int r;
        while (true) {
            r = x % (pow_of_ten * 10);
            result += r / pow_of_ten;
            if (r == x)
                return result;
            result *= 10;
            pow_of_ten *= 10;
        }
    }
    public static void main (String[] args) {
        int x = 12345;
        System.out.println(reverseInteger(x));
        x = 123456789;
        System.out.println(reverseInteger(x));
    }
}
