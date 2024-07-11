// Find the largest and smallest number in an unsorted array.

public class LargestSmallestNum {
    public static int[] findLargestSmallest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num: arr){
            if(num>largest) largest = num;
            if(num<smallest) smallest = num;
        }
        return new int[]{smallest, largest};
    }

    public static void main(String[] args){
        int[] arr = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int[] result = findLargestSmallest(arr);
        System.out.println("smallest : "+ result[0] + "largest : "+ result[1]);
    }
}
