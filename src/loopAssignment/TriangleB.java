package loopAssignment;

public class TriangleB {

    public static void main(String[] args) {
        int B = 10;
        int i;
        for (i = 1; i <= B; i++){
            for (int j = i; j <= B; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
