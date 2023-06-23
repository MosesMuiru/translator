package com.example.translator;

public class WordModal {

    private String englishWord;
    private String kiswahiliWord;
    private int image;

    public WordModal(String englishWord, String kiswahiliWord, int image) {
        this.englishWord = englishWord;
        this.kiswahiliWord = kiswahiliWord;
        this.image = image;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getKiswahiliWord() {
        return kiswahiliWord;
    }

    public void setKiswahiliWord(String kiswahiliWord) {
        this.kiswahiliWord = kiswahiliWord;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
