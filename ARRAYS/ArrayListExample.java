import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample{

    public static void main(String[] args){
    ArrayList <Integer> list = new ArrayList<Integer>();
    
    //add elements

    list.add(0);
    list.add(6);
    list.add(9);
    list.add(7);
    System.out.println(list);

    //get elements

    System.out.println(list.get(2));
    System.out.println(list);

    //add elements in between

    list.add(1 , 5);
    System.out.println(list);

    //update element

    list.set(2 , 10);
    System.out.println(list);

    //delete element

    list.remove(3);
    System.out.println(list);

    //list size

    int size = list.size();
    System.out.println(size);

    //iteration

    for(int i = 0 ; i < list.size() ; i++){
        System.out.println(list.get(i));
    }

    //sort

    Collections.sort(list);
    System.out.println(list);


    
    


}
}