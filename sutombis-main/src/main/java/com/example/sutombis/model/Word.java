package com.example.sutombis.model;

public class Word {
    private long id;
    private String name;
    private String categorie;
    private String blurredWord;
    private String spacedWord;

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

  public void setBlurredWord(String wordToBlur){
    this.blurredWord = wordToBlur;
  }

  public String getSoaceWord() {
    return spacedWord;
  }

  public void setSpacedWord(String wordToSpace){
    this.spacedWord = wordToSpace;
  }

  public String spaceWord(String wordToSpace){
    if (wordToSpace == null)
      return "";
    String spaced_hidden_word = wordToSpace.replace("", " ").trim();
    return spaced_hidden_word;
  }

  public String blurWord(String wordToBlur){
    
    int length = wordToBlur.length();
    String hidden_daily_word = String.format("%-" + length + "s", wordToBlur.charAt(0)).replace(' ', '_');
    setBlurredWord(hidden_daily_word);
    spaceWord(this.blurredWord);
    return this.spacedWord;
  }

}
