package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        int[][] newArr = getArr();
        printArray(newArr);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        boolean result = searchNumber(newArr, target);
        System.out.println("Kết quả tìm kiếm: " + result);
    }

    private static boolean searchNumber(int[][] arr, int target) {
        List<Integer> rowIndices = new ArrayList<>();
        List<Integer> columnIndices = new ArrayList<>();
        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    rowIndices.add(i);
                    columnIndices.add(j);
                    check = true;
                }
            }
        }

        if (check) {
            System.out.println("Các vị trí của số " + target + ":");
            for (int i = 0; i < rowIndices.size(); i++) {
                int row = rowIndices.get(i);
                int column = columnIndices.get(i);
                System.out.println( row +"."+ column +"," );
            }
        }

        return check;
    }

    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("["+arr[i][j] + " "+"]");
            }
            System.out.println();
        }
    }


}