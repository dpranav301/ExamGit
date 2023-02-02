public class linear {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int a = 0;
        int b = arr.length - 1;
        while (a > b) {
            int mid = (a + b) / 2;
            if (arr[mid] == 10) {
                System.out.println("Element is found");
            } else if (arr[mid] > 10) {

                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 5) {
        // System.out.println("Element found");
        // } else {
        // System.out.println("Element not found");
        // }
        // }

    }
}
