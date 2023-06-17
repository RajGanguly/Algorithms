package MaxSubArray;

public class MaxSubArray{
    public static int maxSubarray(int A, int B, int[] C) {
        int prefix_sum_arr[] = new int[A];
        int prefix_sum = 0;
        for(int i=0; i<A; i++){
            prefix_sum_arr[i] = prefix_sum + C[i];
        }
    

        int max_so_far = C[0] > B ? 0: C[0];
        int max_ending_here = C[0] > B ? 0: C[0];

        if(A == 1)
            return C[0] > B ? 0 : C[0];

        for(int i=1; i<A; i++){
            System.out.println("Checking C[i] ====== " +C[i]+ "======= Checking max_ending_here ====="+max_ending_here);
            int temp = max(C[i], max_ending_here+C[i]);
            System.out.println("Checking temp ==========" +temp);
            System.out.println("Checking max_so_far ==========" +max_so_far);
            if(temp <= B){
                max_so_far = max(temp, max_so_far);
                max_ending_here = temp;
            }else{
                max_so_far = C[i] > B ? max_so_far : C[i];
                max_ending_here = C[i] > B ? max_ending_here : C[i];
            }

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
        ans = maxSubarray(9, 14, arr);
        System.out.println("Answer ::::  " +ans);
    }
}
