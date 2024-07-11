import java.util.ArrayList;
import java.util.List;

public class MultipleMissingNumbers {
    public static List<Integer> findMissingNumbers(int [] arr, int n){
        boolean[] present = new boolean[n+1];
        for(int num: arr){
            if(num<=n){
                present[num] = true;
            }
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(!present[i]){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }

    public static void main(String [] args) {
        int[] arr = {1, 2, 4, 5, 6, 8};
        int n = 8;
        List<Integer> missingNumbers = findMissingNumbers(arr, n);
        System.out.println("Missing numbers : "+ missingNumbers);
    }
}
