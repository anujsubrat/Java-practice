public class missingnumber {
    public static void main(String[] args) {

        int arr[] = {2,3 , 4, 5};  // N = 5
        int N = 5;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int expected = N * (N + 1) / 2;

        System.out.println("Missing Number: " + (expected - sum));
    }
}
