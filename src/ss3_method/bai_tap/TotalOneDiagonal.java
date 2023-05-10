package ss3_method.bai_tap;

public class TotalOneDiagonal {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 4}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i][i];
        }
        System.out.println(sum);
    }
}
