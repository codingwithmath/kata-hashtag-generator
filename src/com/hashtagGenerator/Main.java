package com.hashtagGenerator;
import com.hashtagGenerator.profile.Profile;

public class Main {

    public static void main(String[] args) {
	    Profile profile = new Profile();

        String defaultWords = profile.getDefaultWords();
        String randomWords = profile.getRandomWords();

        String[] arrayOfRandomWords = transformStringIntoArrayOfStrings(randomWords, ",");
        String[] arrayOfDefaultWords = transformStringIntoArrayOfStrings(defaultWords, ",");

        String newArrayOfRandomWords = String.join(" ", addHashToWord(arrayOfRandomWords)) ;
        String newArrayOfDefaultWords = String.join(" ", addHashToWord(arrayOfDefaultWords));


        System.out.println("Hash tags: "+newArrayOfDefaultWords);
        System.out.println("Hash tags: "+newArrayOfRandomWords);


    }

    static String[] addHashToWord(String[] words) {
        for(int index = 0; index < words.length; index++) {
            words[index] = "#"+words[index];
        }

        return words;
    }

    static String[] transformStringIntoArrayOfStrings(String words, String separator) {
        String[] arrayOfStrings = words.split(separator);

        return arrayOfStrings;
    }


}
