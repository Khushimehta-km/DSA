class Update{
    public static void main(String[] args){
        int [] arr = {5 ,10 , 15 , 20 , 25};
        int size = 5;
        int pos = 3;
        int value = 100;

        arr[pos] = value;

        for (int i = 0 ; i < size ; i++ ){
        System.out.print(arr[i] + ",");
        }
    }
}