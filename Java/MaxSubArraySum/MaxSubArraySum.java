package MaxSubArraySum;

public class MaxSubArraySum{
    public static int solve(int[] A) {
        int len = A.length;
        int max_so_far = A[0];
        int max_ending_here = A[0] ;

        if(len == 1)
            return A[0];

        for(int i=1; i<len; i++){
            max_ending_here = max(A[i], max_ending_here+A[i]);
            max_so_far = max(max_ending_here, max_so_far);
        }
        return max_so_far;
    }
    public static int max(int a, int b){
        if(a>b)
            return a;
        else
            return b;    
    }

    public static void main(String args[]) {
        int ans = 0;
        int[] arr = { 1, 2, 4, 4, 5, 5, 5, 7, 5 };
        ans = solve(arr);
        System.out.println("Answer ::::  " +ans);
    }    
}
