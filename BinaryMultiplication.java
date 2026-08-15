import java.util.Scanner;

public class BinaryMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        String first = sc.next();

        System.out.print("Input the second binary number: ");
        String second = sc.next();  
        int n1 = Integer.parseInt(first, 2);
        int n2 = Integer.parseInt(second, 2); 
        int product = n1 * n2; 
        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(product));
    }
}