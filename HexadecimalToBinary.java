import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hexadecimal Number : ");
        String hex = sc.next();
        int decimal = Integer.parseInt(hex, 16);
        String binary = Integer.toBinaryString(decimal); 
        System.out.println("Equivalent Binary Number is: " + binary);
    }
}