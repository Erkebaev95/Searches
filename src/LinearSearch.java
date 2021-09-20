public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {16, 2, 5, 0, 9, 6, 7, 10};
        System.out.println(searchLinear(arr, 10));
    }

    public static int searchLinear(int[] array, int elementToFind) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("searching at index: " + i + ", value: " + array[i]);
            if (array[i] == elementToFind) {
                System.out.println("found at index: " + i + ", value: " + array[i]);
                return i;
            }
        }
        System.out.println("not found: " + elementToFind);
        return -1;
    }
}