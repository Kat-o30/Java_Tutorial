// Find the missing number in a given array of 1 to n.

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n){
        int totalSum = (n*(n+1)) / 2;
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return totalSum - sum;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        System.out.println("Missing number : " + findMissingNumber(arr, n));
    }
}
