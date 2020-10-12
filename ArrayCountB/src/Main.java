import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == 'b' || chars[i] == 'B'){
                count++;
            }
        }
        System.out.println("count char b " +count);
    }
}
