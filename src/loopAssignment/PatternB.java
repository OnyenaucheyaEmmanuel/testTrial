package loopAssignment;

public class PatternB {
    public static void main(String[] args) {
        int B = 6;
        for (int i = 1; i <= B; i++) {
            char p='1';
            for (int j = i; j<=B; j++) {
                System.out.print((char) p++ + " ");
            }
            System.out.println();
        }
    }
}

