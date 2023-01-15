public class PickFromBothSides {
    public static int solve(int[] A, int B) {
        int len = A.length;
        int prefixSumArr[] = new int[len];

        prefixSumArr[0] = A[0];
        for(int i=1; i< len; i++) {
            prefixSumArr[i] = prefixSumArr[i-1] + A[i];
            // System.out.println("Prefix sum at index :::: " +i + " ------ " +prefixSumArr[i]);
        }
        int start = 0;
        int sum = Integer.MIN_VALUE;
        int end = len-B-1;
        int total_sum = prefixSumArr[len-1];
        int ans_max = 0;
        // System.out.println("1st sum :::: " +sum);
        if(B == len){
            int totalPrefixSum = 0;
            for(int i=0; i<len; i++) {
                totalPrefixSum += A[i];
            }
            return totalPrefixSum;
        }
        while(end < len){
            // System.out.println("Prefix sum at index end :::: " +end + " ------ " + prefixSumArr[end] + "----start-----"+start+"::::::::"+prefixSumArr[start]);
            if(start == 0){
                ans_max = total_sum - prefixSumArr[end];
            } else {
                ans_max = total_sum - (prefixSumArr[end] - prefixSumArr[start-1]);
            }

            if(ans_max > sum)
                sum = ans_max;

            start++;
            end++;
        }
        return sum;
    }

    public static void main(String args[]) {
        int ans = 0;
        int[] arr = { 5, -2, 3 , 1, 2 };
        ans = solve(arr, 3);
        System.out.println("Answer ::::  " +ans);
    }
}
