public class SwapVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping process
        int temp = a; // Save value of 'a' in temp
        a = b;        // Assign value of 'b' to 'a'
        b = temp;     // Assign saved 'temp' value to 'b'

        System.out.println("After Swap:  a = " + a + ", b = " + b);
    }
}
    

