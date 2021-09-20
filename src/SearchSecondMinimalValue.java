public class SearchSecondMinimalValue {
    public static void main(String[] args) {
        int [] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < firstMin) {
                secondMin = firstMin;
                firstMin = array[i];
            }
            else if (array[i] < secondMin && array[i] != firstMin) {
                secondMin = array[i];
            }
        }

        if (secondMin != Integer.MAX_VALUE) {
            System.out.println("Second lowest value in an array: " + secondMin);
        } else {
            System.out.println("There isn't second value by minimal");
        }

        System.out.println("Minimal value in array: " + firstMin);
    }
}