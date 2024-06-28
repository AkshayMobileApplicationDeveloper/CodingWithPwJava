package TakingInput;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
       try(Scanner scanner=new Scanner(System.in)){
           int rool = scanner.nextInt();
           System.out.println("Our Input is \n"+rool);

       }
    }
}
