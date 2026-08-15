import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a octal number : ");
        String octal = sc.next();
        int decimal = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Equivalent hexadecimal number: " + hex);
    }
}