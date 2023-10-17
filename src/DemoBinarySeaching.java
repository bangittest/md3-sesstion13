import java.util.Scanner;

public class DemoBinarySeaching {
    public static void main(String[] args) {
        int[] arr ={1,2,4,6,8,9,10};
        while (true){
            System.out.println("Hãy nhập 1 số cần tìm kiếm :");
            Scanner scanner=new Scanner(System.in);
            int seachNumber=scanner.nextInt();
            int low = 0;
            int hight = arr.length - 1;
            boolean found = false;

            while (low <= hight) {
                int mid = (low + hight) / 2;

                if (arr[mid] == seachNumber) {
                    System.out.printf("Phần tử %d được tìm thấy tại vị trí %d.\n", seachNumber, mid);
                    found = true;
                    break;
                } else if (seachNumber < arr[mid]) {
                    hight = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            if (!found) {
                System.out.printf("Phần tử %d không được tìm thấy trong mảng.\n", seachNumber);
            }
        }
    }
}
