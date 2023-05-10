package ss3_method.bai_tap;

public class CountTimesInString {
    public static void main(String[] args) {
        String str="Ngo Dinh Quan";
        char a='n';
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a){
                count++;
            }
        }
        System.out.println(count);
    }
}
