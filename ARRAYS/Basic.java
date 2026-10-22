import java.util.*;
public class Basic{

    public static void main(String[] args){
    //     int[] marks = new int[3];
    //     marks[0] = 98;
    //     marks[1] = 89;
    //     marks[2] = 90;

    //     System.out.println(marks[0]);
    //     System.out.println(marks[1]);
    //     System.out.println(marks[2]);
    //
    /*user input*/
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int[] marks = new int[n];
    // for (int i = 0 ; i < n ; i++){
    //     marks[i] = sc.nextInt();
    // }
    // for (int i = 0 ; i < n ; i++){
    //     System.out.println(marks[i]);
    // }

    /*linear search
    Take an array as input from the user. Search for a given number x and print the index
    at which it occurs */

    Scanner sc = new Scanner(System.in);
    System.out.println("array size n : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("array elements for size " + n + ":");
    for(int i = 0 ; i < arr.length ; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("x : ");
    int x = sc.nextInt();
    for (int i = 0 ; i < arr.length ; i++){
        if (arr[i] == x)
        System.out.println("x found at index:" + i);
    }


    }

}