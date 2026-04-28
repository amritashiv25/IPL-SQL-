public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
// output : a = 10
//          b = 5

// SWAP NUMBERS WITHOUT USING ADDITIONAL VARIABLE

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        a = a + b;   // 15
        b = a - b;   // 5
        a = a - b;   // 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
