import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("file1.txt"));
        ArrayList<String> list = new ArrayList<>();
        int sum = 0;

        while (sc.hasNextLine()) {
            String[] strs = sc.nextLine().split(" ");

//            for(String s : strs) {
//                list.add(s);
//            }
            list.addAll(Arrays.asList(strs));

        }

        for(String s : list) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
        System.out.println(list);
    }
}
