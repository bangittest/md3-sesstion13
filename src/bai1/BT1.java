package bai1;

public class BT1 {

    public static void main(String[] args) {
        int[]newArr=getArr();
        System.out.println(findMax(newArr));
    }

    public static int findMax(int[] arr) {
        int max=1;
        for(int i=1; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    private static int[] getArr(){
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
