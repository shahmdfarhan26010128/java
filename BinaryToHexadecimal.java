import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal value: " + hex);
    }
}
