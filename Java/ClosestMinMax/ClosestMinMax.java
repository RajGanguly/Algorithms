package ClosestMinMax;

public class ClosestMinMax {
    public static int solve(int[] A) {
        int min_value = Integer.MAX_VALUE;
        int max_value = Integer.MIN_VALUE;
        int answer = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++){
            if(A[i] > max_value)
                max_value = A[i];   
        }

        for(int i=0; i<A.length; i++){
            if(A[i] < min_value)
                min_value = A[i];             
        }

        for(int k=0; k<A.length; k++) {
            if(A[k] == max_value){
                for(int j=k; j<A.length; j++) {
                    if(A[j] == min_value){
                        answer = min(answer, j-k+1);
                    }
                }
            } else if(A[k] == min_value){
                for(int j=k; j<A.length; j++){
                    if(A[j] == max_value)
                        answer = min(answer, j-k+1);
                }
            }
        }
        return answer;
    }

    public static int min(int a, int b){
        if(a<b)
            return a;
        else
            return b;
    }
    public static void main(String args[]) {
        int ans = 0;
        int[] arr = { 5, -2, 3 , 1, 2, 8, 4, -2, 1, 8 };
        ans = solve(arr);
        System.out.println("Answer ::::  " +ans);
    }
    
}
