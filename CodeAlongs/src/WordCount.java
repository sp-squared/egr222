// Colin Morris-Moncada
// November 15th

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        // map of (word,count) pairs
        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();

        Scanner input = new Scanner(new File("mobydick.txt"));
        while (input.hasNext()) {
            String word = input.next();
            if (!wordCounts.containsKey(word)) {
                wordCounts.put(word, 1);
            } else {
                int oldValue = wordCounts.get(word);
                oldValue++;
                wordCounts.put(word, oldValue + 1);
            }
        }


        // print all words that ocur over 500 times
        for (String word: wordCounts.keySet()){
            int count = wordCounts.get(word);
            if (count >= 500){
                System.out.println(word + " occurs " + wordCounts.get(word) + " times");
            }
        }
        //System.out.println("the occurs " + wordCounts.get("the") + " times");
        //System.out.println("Ishmael occurs " + wordCounts.get("Ishmael") + " times");
    }
}
