import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicateCharacters {
    public static void findDuplicateCharacters(String str) {
        
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

     
        char[] characters = str.toCharArray();

       
        for (char ch : characters) {
           
            if (charFrequencyMap.containsKey(ch)) {
                charFrequencyMap.put(ch, charFrequencyMap.get(ch) + 1);
            } else {
               
                charFrequencyMap.put(ch, 1);
            }
        }

        
        System.out.println("Duplicate characters in the string '" + str + "':");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

       
        findDuplicateCharacters(inputString);

        scanner.close();
    }
}