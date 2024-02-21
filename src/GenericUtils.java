public class GenericUtils {
    /**
     * Reverses the elements of the given array in place.
     * @param array The array to be reversed. It can be of any type.
     * @param <T> The type of the elements in the array.
     */
    public static <T> void reverse(T[] array){
        int right = array.length - 1;
        int left = 0;
        while (left < right) {
            T element = array[left];
            array[left] = array[right];
            array[right] = element;
            left++;
            right--;
        }
    }
    /**
     * Calculates the sum of all elements in the given array.
     * @param array The array of numbers to be summed.
     * @return the sum of all the elements
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0.0;
        for(T elem : array){
            sum += elem.doubleValue();
        }
        return sum;
    }
}

