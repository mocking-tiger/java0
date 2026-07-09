import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.println("아무키나 누른 후 엔터:");
            userInput = s.nextLine();

            if (userInput.matches(".*[0-9].*")) {
                System.out.println("숫자는 안됩니다");
            } else {
                break;
            }
        }

        System.out.println("사용자 입력값:" + userInput);
    }
}
