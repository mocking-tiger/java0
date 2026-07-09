import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args){
        int[] numbers = new int[6];
        Random random = new Random();

        for(int i = 0; i < numbers.length; i++){
            int newNumber = random.nextInt(45)+1;
            boolean isOk = true;

            for(int j = 0; j < i; j++){
                if(numbers[j] == newNumber){
                    isOk = false;
                    break;
                }
            }

            if(isOk){
                numbers[i] = newNumber;
            }else{
                i--;
            }
        }
        System.out.println(Arrays.toString(Arrays.stream(numbers).sorted().toArray()));
    }
}
