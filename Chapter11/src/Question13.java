import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Question13 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 4, 5, 5, 5, 6, 7, 8, 9));
        removeDuplicate(arrayList);
        System.out.println(arrayList);
    }

    public static void removeDuplicate(ArrayList<Integer> arrayList) {
        ArrayList<Integer> temp = new ArrayList<>();
        arrayList.forEach(n -> {
            if (!temp.contains(n)) temp.add(n);
        });
        arrayList.clear();
        arrayList.addAll(temp);
    }
}
