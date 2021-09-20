import java.util.Arrays;

public class SearchMinValue {
    public static void main(String[] args) {
        int[] arrays = {64, 45, 12, 55, 74, 92, 105, 22, 33};
        System.out.println(Arrays.toString(arrays));

        int minValue = arrays[0];
        int minIndex = 0;

        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] < minValue) {
                minValue = arrays[i];
                minIndex = i;
            }
        }
        System.out.println("Minimal value: " + minValue);
        System.out.println("Minimal index: " + minIndex);
    }
}