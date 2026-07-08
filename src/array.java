public class array {
        public static void main(String[] args) {

            int[] arr = {5, 2, 6, 7, 4, 8, 3, 10, 9};

            System.out.println("Oldin:");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            for (int i = 0; i < arr.length - 1; i++) {

                for (int j = 0; j < arr.length - 1 - i; j++) {

                    if (arr[j] > arr[j + 1]) {

                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                    }

                }

            }

            System.out.println("\n\nKeyin:");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        }
    }

