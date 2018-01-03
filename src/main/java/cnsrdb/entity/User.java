package cnsrdb.entity;

public class User {
  private String username;
  private String password;
  private Long credit;//信用
  private String tid;//教师号码，应该就是工号了
  private String sid;//学号

  public User(){

  }

  public User(String username, String password, Long credit, String tid, String sid) {
    this.username = username;
    this.password = password;
    this.credit = credit;
    this.tid = tid;
    this.sid = sid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Long getCredit() {
    return credit;
  }

  public void setCredit(Long credit) {
    this.credit = credit;
  }

  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }
}
