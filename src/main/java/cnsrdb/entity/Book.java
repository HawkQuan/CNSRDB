package cnsrdb.entity;

import java.sql.Timestamp;

public class Book {
  private String num;//书号
  private String title;//书名
  private String author;//作者
  private java.sql.Timestamp pubyear;//出版日期，他有关日期的都用sql里的Date类型
  private String location;//出版社

  public Book() {

  }


  public Book(String num, String title, String author, Timestamp pubyear, String location) {
    this.num = num;
    this.title = title;
    this.author = author;
    this.pubyear = pubyear;
    this.location = location;
  }

  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public java.sql.Timestamp getPubyear() {
    return pubyear;
  }

  public void setPubyear(java.sql.Timestamp pubyear) {
    this.pubyear = pubyear;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
