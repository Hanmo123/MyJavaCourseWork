import java.util.ArrayList;
import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        shuffle(arrayList);
        System.out.println(arrayList);
    }

    public static void shuffle(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            int randomIndex = (int) (Math.random() * arrayList.size());
            int temp = arrayList.get(i);
            arrayList.set(i, arrayList.get(randomIndex));
            arrayList.set(randomIndex, temp);
        }
    }
}
