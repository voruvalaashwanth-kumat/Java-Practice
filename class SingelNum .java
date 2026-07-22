class SingelNum {
    public static void main(String args[]) {
        int arr[] = {20, 10, 10, 40, 40, 20, 10, 3};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;  
                }
            }

            if (count == 1) { 
                System.out.println("Unique Element: " + arr[i]);
                break;
            }
        }
    }
}
