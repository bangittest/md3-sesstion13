import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoLinerSeach {
    public static void main(String[] args) {
//        int arr[]={1,4,5,6,4,3,5,6,7,6};
        Scanner scanner=new Scanner(System.in);
//        System.out.println("hay nhap 1 so de tim kiem");
//        int seachNumber= Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==seachNumber){
//                System.out.println("phan tu cua %d can tim o vi tri %d ");
//                return;
//            }
//        }
//        System.out.println("k tim thay phan tu");

        List<Student>students=new ArrayList<>();
        students.add(new Student(1,"truong thi d",true));
        students.add(new Student(2,"nguyen van b",true));
        students.add(new Student(3,"nguyen van c",true));

        boolean isFound=true;
        System.out.println("nhap tu khoa can tim kiem");

        String key=scanner.nextLine();
        for (Student student : students){
            if (student.getName().contains(key)){
                System.out.println(student);
                isFound=false;
            }
        }
        if (isFound) {
            System.out.println("k tim thay");
        }



    }


}
