package JavaStrings;
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class MostFrequentCharacter {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String input=scanner.nextLine();
//        HashMap<Character, Integer> frequencyMap=new HashMap<>();
//        for(char ch:input.toCharArray()){
//            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
//        }
//        char mostFrequent=' ';
//        int maxFrequency=0;
//        for(char ch: frequencyMap.keySet()){
//            if(frequencyMap.get(ch)>maxFrequency){
//                mostFrequent=ch;
//                maxFrequency=frequencyMap.get(ch);
//            }
//        }
//        System.out.println("Most Frequent Character: "+mostFrequent);
//        scanner.close();
//    }
//}

import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int[] frequencyArray = new int[128]; // Array to store frequencies of ASCII characters

        // Count the frequency of each character
        for (char ch : input.toCharArray()) {
            frequencyArray[ch]++;
        }

        // Find the most frequent character
        char mostFrequent = ' ';
        int maxFrequency = 0;

        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > maxFrequency) {
                mostFrequent = (char) i; // Convert index to character
                maxFrequency = frequencyArray[i];
            }
        }

        System.out.println("Most Frequent Character: " + mostFrequent);
        scanner.close();
    }
}
