package loopAssignment;

public class PatternA {
    public static void main(String[] args) {
        int A = 6;
        for (int i = 1; i <= A; i++) {
            char p ='1';
            for (int j = 1; j<=i; j++){
                System.out.print((char)p++ +" ");
            }
            System.out.println();
        }
    }
}