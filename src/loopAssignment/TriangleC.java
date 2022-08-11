package loopAssignment;

public class TriangleC {

    public static void main(String[] args) {
        int C = 10;
        for(int i = 1; i<=C; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j = i; j<=C; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
