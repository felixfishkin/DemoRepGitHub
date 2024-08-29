import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 17, 500, 5, -6, 0, -200};
        System.out.println(Arrays.toString(array));

        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                    continue;
                } else {
                    int temporary = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temporary;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}