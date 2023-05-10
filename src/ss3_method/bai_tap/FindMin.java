package ss3_method.bai_tap;

public class FindMin {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 2}, {4, 5, 6}, {7, 8, 9}};
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
