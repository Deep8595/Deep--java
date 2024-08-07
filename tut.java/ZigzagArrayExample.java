import java.util.Arrays;

public class ZigzagArrayExample {
    public static void zigZag(int arr[]) {
        boolean flag = true;
        int temp = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if (flag == true)
                flag = false;
            else
                flag = true;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 5, 1, 7, 6, 8 };
        zigZag(arr);
        System.out.println(Arrays.toString(arr));
    }
}
