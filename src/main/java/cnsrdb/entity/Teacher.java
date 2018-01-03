package cnsrdb.entity;

import java.sql.Timestamp;

public class Teacher {
  private String id;//自增id
  private String jobnum;//工号，我觉得可以认为唯一了
  private String name;//中文名
  private String firstname;//姓
  private String lastname;//名
  private String sex;//性别
  private String type;//全职和兼职，貌似全都是全职
  private String nation;//国籍
  private String dept;//部门
  private String areacode;//区号
  private String officenum;//座机号
  private String mobile;//手机号
  private java.sql.Timestamp birthday;//生日
  private String qualification;//博导或硕导
  private String title;//教授，副教授、讲师
  private String duty;//实验室主任
  private String email;//邮箱
  private String picture;//照片
  private String socialposition;//社会职务
  private String administrativerank;//行政职务

  public Teacher(){

  }

  public Teacher(String jobnum, String name, String firstname, String lastname, String sex, String type, String nation, String dept, String areacode, String officenum, String mobile, Timestamp birthday, String qualification, String title, String duty, String email, String picture, String socialposition, String administrativerank) {
    this.jobnum = jobnum;
    this.name = name;
    this.firstname = firstname;
    this.lastname = lastname;
    this.sex = sex;
    this.type = type;
    this.nation = nation;
    this.dept = dept;
    this.areacode = areacode;
    this.officenum = officenum;
    this.mobile = mobile;
    this.birthday = birthday;
    this.qualification = qualification;
    this.title = title;
    this.duty = duty;
    this.email = email;
    this.picture = picture;
    this.socialposition = socialposition;
    this.administrativerank = administrativerank;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getJobnum() {
    return jobnum;
  }

  public void setJobnum(String jobnum) {
    this.jobnum = jobnum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public String getAreacode() {
    return areacode;
  }

  public void setAreacode(String areacode) {
    this.areacode = areacode;
  }

  public String getOfficenum() {
    return officenum;
  }

  public void setOfficenum(String officenum) {
    this.officenum = officenum;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public java.sql.Timestamp getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Timestamp birthday) {
    this.birthday = birthday;
  }

  public String getQualification() {
    return qualification;
  }

  public void setQualification(String qualification) {
    this.qualification = qualification;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDuty() {
    return duty;
  }

  public void setDuty(String duty) {
    this.duty = duty;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public String getSocialposition() {
    return socialposition;
  }

  public void setSocialposition(String socialposition) {
    this.socialposition = socialposition;
  }

  public String getAdministrativerank() {
    return administrativerank;
  }

  public void setAdministrativerank(String administrativerank) {
    this.administrativerank = administrativerank;
  }
}
