import java.util.Scanner;
public class BinarySearch{
    public int bsearch(int [] arr ,int low , int high  , int target){
         while (low <= high) {

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        else if (target > arr[mid]) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }

    return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int low = 0;
        int high = n-1;
        

        BinarySearch obj = new BinarySearch();
        int ans = obj.bsearch(arr , low , high ,  target);
        System.out.println(ans);
        
    
    }
}