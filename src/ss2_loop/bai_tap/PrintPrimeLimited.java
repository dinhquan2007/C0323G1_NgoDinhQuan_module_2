package ss2_loop.bai_tap;
public class PrintPrimeLimited {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)){
                System.out.println(i+",");
            }
        }
    }
    //kiểm tra theo hàm kiểu boolean
    public static  boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i==0) {
              return false;
            }
        }
        return true;
    }
}
