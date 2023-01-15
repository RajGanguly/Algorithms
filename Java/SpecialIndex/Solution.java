public class Solution {
    public static int solve(int[] A) {
        int len = A.length;
        int oddArr[] = new int[len];
        int evenArr[] = new int[len];
        int sumEven = 0;
        int sumOdd = 0;
        oddArr[0] = 0;
        evenArr[0] = A[0];
        for(int i=1; i< len; i++){

            if(i%2 == 0){
                evenArr[i] = A[i] + evenArr[i-1];
                oddArr[i] = oddArr[i-1];
            } else {
                evenArr[i] = evenArr[i-1];
                oddArr[i] = A[i] + oddArr[i-1];
            }
        }

        int evenSum = 0;
        int oddSum = 0;
        int count = 0;

        for(int i=0; i<len; i++) {
            if(i == 0) {
                evenSum = 0 + (oddArr[len - 1] - oddArr[i]);
                oddSum = 0 + (evenArr[len - 1] - evenArr[i]);
            } else {
                evenSum = evenArr[i-1] + (oddArr[len - 1] - oddArr[i]);
                oddSum = oddArr[i-1] + (evenArr[len - 1] - evenArr[i]);
            }


            if(evenSum == oddSum){
                count ++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int ans = 0;
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        ans = solve(arr);
        System.out.println("Answer ::::" +ans);
    }
}
