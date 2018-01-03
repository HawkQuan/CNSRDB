package cnsrdb.entity;

import java.sql.Timestamp;

public class Paperinfo {
  private Long id;//自增id
  private String title;//论文题目
  private String author;//作者
  private Long grade;//年级
  private String tid;//学号
  private String type;//类型，应该是分为科研，教学
  private String occasname;//会议名称
  private java.sql.Timestamp occastime;//会议时间
  private String pubyear;//发表年份

  public Paperinfo(){

  }

  /**
   * 目前数据只有这三项，所以写一个构造函数，方便做数据操作
   * @param title
   * @param grade
   * @param tid
   */
  public Paperinfo(String title,Long grade, String tid) {
    this.title = title;
    this.grade = grade;
    this.tid = tid;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public Long getGrade() {
    return grade;
  }

  public void setGrade(Long grade) {
    this.grade = grade;
  }

  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getOccasname() {
    return occasname;
  }

  public void setOccasname(String occasname) {
    this.occasname = occasname;
  }

  public java.sql.Timestamp getOccastime() {
    return occastime;
  }

  public void setOccastime(java.sql.Timestamp occastime) {
    this.occastime = occastime;
  }

  public String getPubyear() {
    return pubyear;
  }

  public void setPubyear(String pubyear) {
    this.pubyear = pubyear;
  }
}
