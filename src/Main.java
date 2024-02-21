public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        GenericUtils.reverse(intArray);

        System.out.println("\nReversed array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }

        Number[] numberArray = {1, 2.5, 3, 4.5};
        double sum = GenericUtils.sum(numberArray);
        System.out.println("\nSum of numberArray: " + sum);
    }
}
