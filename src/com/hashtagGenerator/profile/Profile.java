package com.hashtagGenerator.profile;
import com.hashtagGenerator.words.Words;

public class Profile {

    private String defaultWords;
    private String randomWords;

    static Words words = new Words();

    public Profile(){}

    public String getDefaultWords() {
        defaultWords = words.getDefaultWords();

        return this.defaultWords;
    }

    public String getRandomWords() {
        this.randomWords = words.getRandomWords();

        return this.randomWords;
    }
}
