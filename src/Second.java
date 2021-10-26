import java.util.Arrays;

public class Second {
    public static int[] fillArray() {
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j += 3) {
            array[i] = j;
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray()));
    }
}
