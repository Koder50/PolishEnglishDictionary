package org.exampleDictionary;

import java.util.HashMap;
import java.util.Scanner;

public class PolishEnglishDictionary {
    private static HashMap<String, String> polishWordsFirst;
    private static HashMap<String, String> englishWordsFirst;
    private static Scanner scanner;
    private String choice;
    private static String polishAnimalName;
    private static String englishAnimalName;
    public static void main(String[] args) {

        PolishEnglishDictionary dictionary = new PolishEnglishDictionary();
    }
    public PolishEnglishDictionary() {
        fillOutPolishDictionaryWords();
        fillOutEnglishDictionaryWords();
        getDictionaryVersion();
        for(int i=0; ;i++) {
            if (isDictionaryPolishEnglish()) {
                scanner = new Scanner(System.in);
                polishAnimalName = getPolishAnimalWord();
                if (polishAnimalName.toLowerCase().equals("end")) {
                    System.out.println("THE END");
                    break;
                }
                translateToEnglishAnimalWordAndReturnIt(polishAnimalName);
            }
            else if (isDictionaryEnglishPolish()) {
                englishAnimalName = getEnglishAnimalWord();
                if(englishAnimalName.toLowerCase().equals("end")) {
                    System.out.println("THE END");
                    break;
                }
                translateToPolishAnimalWordAndReturnIt(englishAnimalName);
            }else if (choice.equals("end")) {
                System.out.println("THE END");
                break;
            } else {
                System.out.println("Invalid choice. Please choose P or E.");
                getDictionaryVersion();
            }
         }

    }

    public static void fillOutPolishDictionaryWords() {
        polishWordsFirst = new HashMap<String, String>();
        polishWordsFirst.put("pies","dog");
        polishWordsFirst.put("kot","cat");
        polishWordsFirst.put("ptak","bird");
        polishWordsFirst.put("krokodyl","crocodile");
        polishWordsFirst.put("koń","horse");
        polishWordsFirst.put("panda","panda");
        polishWordsFirst.put("orzeł","eagle");
        polishWordsFirst.put("lew","lion");
        polishWordsFirst.put("ryba","fish");
        polishWordsFirst.put("małpa","monkey");
    }

    public static void fillOutEnglishDictionaryWords() {
        englishWordsFirst = new HashMap<String, String>();
        englishWordsFirst.put("dog","pies");
        englishWordsFirst.put("cat","kot");
        englishWordsFirst.put("bird","ptak");
        englishWordsFirst.put("crocodile","krokodyl");
        englishWordsFirst.put("horse","koń");
        englishWordsFirst.put("panda","panda");
        englishWordsFirst.put("eagle","orzeł");
        englishWordsFirst.put("lion","lew");
        englishWordsFirst.put("fish","ryba");
        englishWordsFirst.put("monkey","małpa");
    }

    private void getDictionaryVersion() {
        System.out.println("Dictionary Polish-English and English-Polish for animals names.");
        System.out.println("Choose Polish-English (P) or English-Polish (E). For end choose END");
        scanner = new Scanner(System.in);
        choice = scanner.nextLine().toLowerCase();
    }

    private boolean isDictionaryPolishEnglish() {
        return choice.equals("p");
    }

    public static String getPolishAnimalWord() {
        System.out.println("Enter Polish animal name:");
        return scanner.nextLine().toLowerCase();
    }
    public static String translateToEnglishAnimalWordAndReturnIt(String polishAnimalName) {
        String englishAnimalName = polishWordsFirst.get(polishAnimalName);
        if (englishAnimalName != null)
            System.out.println(englishAnimalName);
        else System.out.println("Animal name not found in the dictionary.");
        return englishAnimalName;
    }

    private boolean isDictionaryEnglishPolish() {
        return choice.equals("e");
    }

    private String getEnglishAnimalWord() {
        System.out.println("Enter English animal name:");
        return scanner.nextLine().toLowerCase();
    }

    public static String translateToPolishAnimalWordAndReturnIt(String englishAnimalName) {
        String polishAnimalName = englishWordsFirst.get(englishAnimalName);
        if (polishAnimalName != null)
            System.out.println(polishAnimalName);
        else System.out.println("Animal name not found in the dictionary.");
        return polishAnimalName;
    }

}