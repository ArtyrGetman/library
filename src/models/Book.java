package models;

import utils.ErrorsText;

public class Book {
    String tittle;
  private  String author;
  private String ISBN;

  private boolean isIssued;

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    public void setTittle(String anyString){
      this.tittle = anyString;
  }

  public String getTittle(){
      return this.tittle;
  }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void printBookInfoInConsole(){
        System.out.println( " author is "+getAuthor() + ", \n tittle is "+getTittle() + ",\n indeficator is "+ getISBN());
    }
}
