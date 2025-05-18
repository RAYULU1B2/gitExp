public class DiagonalStars {

    public static void main(String[] args) {
        int n = 5; // Size of the pattern

        System.out.println("Top-left to Bottom-right Diagonal:");
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print star
            System.out.println("*");
        }

        System.out.println("\nTop-right to Bottom-left Diagonal:");
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print star
            System.out.println("*");
        }
    }
}
