package com.example.cotton;

public class bookSaveForm {
    private String pictureLink;
    private String major;
    private String bookName;
    private String bookWriter;


    public bookSaveForm(){}
    public bookSaveForm(String pictureLink, String major, String bookName, String bookWriter){
        this.pictureLink = pictureLink;
        this.major = major;
        this.bookName = bookName;
        this.bookWriter = bookWriter;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }
}