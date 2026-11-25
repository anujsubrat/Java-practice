public class nonrepeating {
    public static void main(String[] args) {

            int[] arr = {4, 5, 1, 2, 0, 4};

            for (int i = 0; i < arr.length; i++) {
                boolean isUnique = true;

                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] == arr[j]) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    System.out.println("First Non-Repeating Element: " + arr[i]);
                    return;
                }
            }

            System.out.println("No Non-Repeating Element Found");
        }
}
