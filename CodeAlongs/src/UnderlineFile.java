// Colin Morris-Moncada
// Uses Scanner input to read a text file and output its contents

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnderlineFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("paper.txt"));
        expandFile(input);
    }

    // Takes scanner input of paper.txt and prints its contents in addition to dashed lines under the headers
    public static void expandFile(Scanner input){
        while(input.hasNextLine()) {
            String text = input.nextLine();
            if (text.length()>0 && text.charAt(0)=='.'){
                System.out.println(text.substring(1));
                for(int i = 1;i<=text.length() -1;i++){
                    System.out.print("-");
                }
                System.out.println();
            }else{
                System.out.println(text);

            }
        }
    }
}
