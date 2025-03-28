package com.example.sutombis.model;

public class SutomInput {

    public char[] proposedLetters;
    private String proposedWord;

    public String getProposedWord() {
        return proposedWord;
    }

    public void setProposedWord(String userInput) {
        this.proposedWord = userInput;
    }

    public void setProposedLetters(String userInput){
        this.proposedLetters = userInput.toCharArray();
    }

}
