package cnsrdb.entity;

import java.sql.Timestamp;

public class Patent {
  private Long id;
  private String num;
  private String applicant;
  private String inventionname;
  private String author;
  private String state;
  private java.sql.Timestamp applydate;
  private java.sql.Timestamp opendate;

  public Patent(){

  }

  public Patent(String num, String applicant, String inventionname, String author, String state, Timestamp applydate, Timestamp opendate) {
    this.num = num;
    this.applicant = applicant;
    this.inventionname = inventionname;
    this.author = author;
    this.state = state;
    this.applydate = applydate;
    this.opendate = opendate;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
  }

  public String getApplicant() {
    return applicant;
  }

  public void setApplicant(String applicant) {
    this.applicant = applicant;
  }

  public String getInventionname() {
    return inventionname;
  }

  public void setInventionname(String inventionname) {
    this.inventionname = inventionname;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public java.sql.Timestamp getApplydate() {
    return applydate;
  }

  public void setApplydate(java.sql.Timestamp applydate) {
    this.applydate = applydate;
  }

  public java.sql.Timestamp getOpendate() {
    return opendate;
  }

  public void setOpendate(java.sql.Timestamp opendate) {
    this.opendate = opendate;
  }
}
