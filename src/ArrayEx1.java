import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args){
        String[] arr = null;
        Scanner s = new Scanner(System.in);
        String input;

        while(true){
            System.out.println("문장을 입력하세요: ");
            input = s.nextLine();
            System.out.println("input: " + input);
            arr = input.split(" ");
            break;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("length: " + arr.length);
    }
}
