import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class anagram {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your words separated by spaces");
        String words = "";
        try {
            words = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> anagramList = new ArrayList<String>();
        String[] wordsArray = words.split(" ");
        for (int i = 0; i < wordsArray.length; i++) {
            for (int k = i + 1; k < wordsArray.length; k++) {
                char tempArray1[] = wordsArray[i].toCharArray();
                char tempArray2[] = wordsArray[k].toCharArray();
                Arrays.sort(tempArray1);
                Arrays.sort(tempArray2);
                if (Arrays.equals(tempArray1, tempArray2)) {
                    anagramList.add(wordsArray[k]);
                }
            }
        }
        System.out.println(anagramList);
    }
}
