import java.util.ArrayList;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter five integers for list1: ");
        for (int i = 0; i < 5; i++) {
            list1.add(scanner.nextInt());
        }
        System.out.print("Enter five integers for list2: ");
        for (int i = 0; i < 5; i++) {
            list2.add(scanner.nextInt());
        }
        ArrayList<Integer> union = union(list1, list2);
        System.out.println("The combined list is " + union);
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(list1);
        temp.addAll(list2);
        return temp;
    }
}
