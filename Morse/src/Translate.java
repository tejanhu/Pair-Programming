import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Translate {

    //table
    HashMap<String, String> hm = new HashMap<String, String>();

/*
    Filling up Hash Map with keys and values
 */

    public void fillMap(){
        hm.put(".-", "A");
        hm.put("-...", "B");
        hm.put("-.-.", "C");
        hm.put("-..", "D");
        hm.put(".", "E");
        hm.put("..-.", "F");
        hm.put("--.", "G");
        hm.put("....", "H");
        hm.put("..", "I");
        hm.put(".---", "J");
        hm.put("-.-", "K");
        hm.put(".-..", "L");
        hm.put("--", "M");
        hm.put("-.", "N");
        hm.put("---", "O");
        hm.put(".--.", "P");
        hm.put("--.-", "Q");
        hm.put(".-.", "R");
        hm.put("...", "S");
        hm.put("-", "T");
        hm.put("..-", "U");
        hm.put("...-", "V");
        hm.put(".--", "W");
        hm.put("-..-", "X");
        hm.put("-.--", "Y");
        hm.put("--..", "Z");
        hm.put(".-.-.-", ".");
        hm.put("--..--", ",");
        hm.put("---...", ":");
        hm.put("..--..", "?");
        hm.put(".----.", "'");
        hm.put("-....-", "-");

    }

/*
    Reversing keys and values in original Hash Map
 */


    public HashMap<String, String> reversedMap(HashMap<String, String> myHashMap){
        HashMap<String, String> reversedHashMap = new HashMap<String, String>();

        for (String i : myHashMap.keySet()) {
            reversedHashMap.put(myHashMap.get(i), i);
        }
        return reversedHashMap;
    }



    public void morseToString(String morseStr){
        String[] wordArray = morseStr.split("/");
        String returnString = "";
        for(int i =0; i<wordArray.length; i++) {
            wordArray[i] = wordToMorse(wordArray[i]);
        }
        returnString = String.join(" ", wordArray);

        System.out.println(returnString);

    }

    public String wordToMorse(String morseWord){
        String[] letterArray = morseWord.split(" ");
        String returnString = "";
        for(int i = 0; i<letterArray.length; i++){
            if(hm.get(letterArray[i]) == null ){
                //System.out.println(letterArray[i]);
                letterArray[i] = "";
            }else{
                letterArray[i] = hm.get(letterArray[i]);

            }
        }
        returnString = String.join("", letterArray);
        return returnString;
    }

    public void stringToMorse(String morseStr){
        morseStr = morseStr.toUpperCase();
        String[] wordArray = morseStr.split(" ");
        String returnString = "";
        for(int i =0; i<wordArray.length; i++) {
            wordArray[i] = morseToWord(wordArray[i]);
        }
        returnString = String.join("/", wordArray);

        System.out.println(returnString);
        printMorse(returnString);
    }

    public String morseToWord(String morseWord){
        String[] letterArray = morseWord.split("");

        String returnString = "";
        HashMap<String, String> reversedHM = reversedMap(hm);

        for(int i = 0; i<letterArray.length; i++){
            if(reversedHM.get(letterArray[i]) == null ){
                letterArray[i] = "";
            }else{
                letterArray[i] = reversedHM.get(letterArray[i]);

            }
        }
        returnString = String.join(" ", letterArray);
        return returnString;
    }


/*
    Printing Morse code
 */

    public void printMorse(String str){
        char c;
        try{
            for(int i= 0; i<str.length(); i++){
                c = str.charAt(i);
                if(c == '.') {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.print("dot" );
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.print("\r");
                    System.out.print(" " );
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print("\r");
                }
                if(c == '-'){
                    Toolkit.getDefaultToolkit().beep();
                    System.out.print("dash" );
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.print("\r");
                    System.out.print(" " );
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print("\r");
                }
                if(c == '/'){
                    System.out.print("/" );
                    TimeUnit.MILLISECONDS.sleep(500);
                    System.out.print("\r");
                    System.out.print(" " );
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print("\r");
                }
                if(c == ' '){

                    System.out.print("\r");
                    System.out.print(" " );
                    TimeUnit.MILLISECONDS.sleep(800);
                    System.out.print("\r");
                }
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }

    }
}
