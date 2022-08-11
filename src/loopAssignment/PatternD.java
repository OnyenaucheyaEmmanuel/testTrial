package loopAssignment;

public class PatternD {
    public static void main(String[] args) {
        int D = 6;
        for (int i = 1; i <= D; i++) {
            int p = 6;
            for (int j=i; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j<=D; j++) {
                System.out.print(p-- + " ");
            }
            System.out.println();
        }
    }
}
