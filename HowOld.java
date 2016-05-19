import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HowOld {

    public static void main (String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("How old are you?");
            int age = Integer.valueOf(br.readLine().trim());
            System.out.println("You are " + age + " years old!");
        } catch (Exception e) {
            // e.printStackTrace();
        } finally {
            System.out.println("Bye.");
        }
    }
}
