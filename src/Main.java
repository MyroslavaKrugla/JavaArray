public class Main {
    /*
    определить второе минимальное значение массива
     */

    public static void main(String[] args) {
        int arr []= {-5, 7, 12,0,-3};
        for (int i = 0; i < arr.length; i++){
            int min = arr[i];
            int min_i = i;
            for (int j = i +1; j < arr.length; j++){
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println("Второй минимальный элемент массива: " + arr[1]);
    }
}
