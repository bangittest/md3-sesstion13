package bai4;

import java.util.Scanner;

public class BT4 {

//        public static void main(String[] args) {
//            int[] numbers = {5, 12, 9, 3, 7, 15, 21, 8, 6};
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Nhập giá trị cần tìm: ");
//            int target = scanner.nextInt();
//
//            boolean found = false;
//            for (int i = 0; i < numbers.length; i++) {
//                if (numbers[i] == target) {
//                    System.out.println("Giá trị " + target + " được tìm thấy tại vị trí " + i);
//                    found = true;
//                    break;
//                }
//            }
//
//            if (!found) {
//                System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
//            }
//        }


    public static void main(String[] args) {
        int[] numbers = {5, 12, 9, 3, 7, 15, 21, 8, 6};
        Scanner scanner=new Scanner(System.in);
        System.out.println("tim so phan tu trong mang");
        int choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==choice){
                System.out.println("tim thay phan tu " +choice +"o vi tri thu " +i);
                return;
            }
        }
        System.out.println("k tim thay gia tri");
    }

}
