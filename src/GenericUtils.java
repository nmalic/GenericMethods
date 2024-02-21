public class GenericUtils {
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
    public static <T extends Number> double sum(T[] array) {
        double summary = 0.0;
        for(T elem : array){
            summary += elem.doubleValue();
        }
        return summary;
    }
}

