package loopAssignment;

public class TriangleA {
    public static void main(String[] args) {
        int A = 10;
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
