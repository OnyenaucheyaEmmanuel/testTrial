package loopAssignment;

public class TriangleD {
    public static void main(String[] args) {
        int D = 10;
        for(int i = 1; i<=D; i++){
            for(int j=i; j<=D; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
