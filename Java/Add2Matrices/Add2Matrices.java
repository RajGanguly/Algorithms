package Add2Matrices;

public class Add2Matrices {
    public static int[][] solve(int[][] A, int[][] B) {
        int sum[][] = new int[A.length][A[0].length];

        for(int i=0; i<A.length; i++){
            for(int j=0; j<B[0].length;j++){
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        int ans[][] = new int[3][4];
        int A[][] = { { 1, 2 }, { 3, 4 }, {5, 5}, {5, 7} };
        int B[][] = { {1, 2}, {4, 4}, {5, 5}, {5, 7} };
        ans = solve(A, B);
        System.out.println("Answer ::::  " +ans);
    }
}
