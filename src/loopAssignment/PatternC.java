package loopAssignment;

public class PatternC {
    public static void main(String[] args) {
        int C = 6;
        for (int i = 1; i <= C; i++) {
            int p = 1;
            for (int j = i; j <= C; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }
}


