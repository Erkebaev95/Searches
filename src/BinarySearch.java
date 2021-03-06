public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(searchBinary(new int[] {-1, 0, 3, 5, 7, 9, 15, 16, 25}, 16));
    }

    public static int searchBinary(int[] array, int elementToFind) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            System.out.println("startIndex: " + startIndex + ", endIndex: " + endIndex + ", middleIndex: " + middleIndex);

            if (array[middleIndex] == elementToFind) {
                System.out.println("found " + elementToFind + " at " + middleIndex);
                return middleIndex;
            }
            if (array[middleIndex] > elementToFind) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}