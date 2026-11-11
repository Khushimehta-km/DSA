import java.util.*;

public class Max1{

    public int FirstOccurence(int[] arr , int totalCol){
        int low = 0;
        int high = totalCol-1;
        int first = totalCol;
        while(low <= high){
            int mid = low + (high-low)/2;
            if (arr[mid] == 1){
                first = mid;
                high = mid - 1;

            }
            else {
                low = mid+1;
            }
        }

        return first;


    }
    public int MaxOne(int[][] mat){
        int maxOne = 0;
        int ans = -1;
     for (int i = 0 ; i < mat.length ; i++){
        int first = FirstOccurence(mat[i] , mat[i].length);
        int count = mat[i].length - first;
        if (count > maxOne){
            maxOne = count;
            ans = i;
        }
     }
     return ans;
        
    }

    public static void main(String[] args){
        int [][] mat = {
            {0 , 0 , 1 , 1},
            {0 , 1 , 1 , 1},
            {0 , 0 , 0 , 1},
            {0 , 0 , 0 , 0}
        };
        Max1 obj = new Max1();

        System.out.println(obj.MaxOne(mat));
    }
}