package com.example.sutombis.model;

import java.util.Set;

public class Word {

    private long id;
    private String name;
    private String categorie;
    private Set<Character> foundLetters;
    private String wordToFind;
    private String proposedWord;
    private String blurredWord;
    private String spacedWord;

    public String spaceWord(String wordToSpace) {
        // Add a space between each char
        String spaced_hidden_word = wordToSpace.replace("", " ").trim();
        setSpacedWord(spaced_hidden_word);
        return spaced_hidden_word;
    }

    public String blurWord() {
        // Hide unown letters -> Replace letters not in foundLetters by _ 
        if (this.proposedWord == null) {
            // Init condition
            this.foundLetters = Set.of(wordToFind.charAt(0));
            return wordToFind.charAt(0) + " _".repeat(wordToFind.length() - 1);
        }
        String propWord = this.proposedWord;
        for (int i = 0; i < propWord.length(); i++) {
            char currentChar = propWord.charAt(i);
            if (!this.foundLetters.contains(currentChar)) {
                propWord = propWord.replace(currentChar, '_');
            }
        }
        setBlurredWord(propWord);
        return propWord;
    }

    public String hidWord() {
        // Hide unown letters + space letters
        String blurred = blurWord();
        String hidden = spaceWord(blurred);
        return hidden;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.wordToFind = name;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getBlurredWord() {
        return blurredWord;
    }

    public void setBlurredWord(String wordToBlur) {
        this.blurredWord = wordToBlur;
    }

    public String getSpacedWord() {
        return spacedWord;
    }

    public void setSpacedWord(String wordToSpace) {
        this.spacedWord = wordToSpace;
    }

    public String getProposedWord() {
        return proposedWord;
    }

    public void setProposedWord(String proposedWord) {
        this.proposedWord = proposedWord;
    }

    public String getWordToFind() {
        return wordToFind;
    }

    public void setWordToFind(String wordToFind) {
        this.wordToFind = wordToFind;
    }

    public Set<Character> getFoundLetters() {
        return foundLetters;
    }

    public void setFoundLetters(Set<Character> foundLetters) {
        this.foundLetters = foundLetters;
    }

}
