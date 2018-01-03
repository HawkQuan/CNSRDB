package cnsrdb.entity;

public class Student {
  private String sid;//学号
  private String chname;//中文名
  private String enname;//英文名
  private String sex;//性别
  private String type;//类型，本科，硕士，博士
  private String nation;//国籍
  private Long grade;//年级
  private String tutor;//导师
  private String associatetutor;//副导师
  private String enterdate;//入学年份
  private String graduationdate;//毕业年份
  private String birthday;//生日
  private String mobile;//手机号
  private String workunit;//工作单位
  private String note;//备注
  private String picture;//照片

  public Student(){

  }

  public Student(String sid, String chname, String enname, String sex, String type, String nation, Long grade, String tutor, String associatetutor, String enterdate, String graduationdate, String birthday, String mobile, String workunit, String note, String picture) {
    this.sid = sid;
    this.chname = chname;
    this.enname = enname;
    this.sex = sex;
    this.type = type;
    this.nation = nation;
    this.grade = grade;
    this.tutor = tutor;
    this.associatetutor = associatetutor;
    this.enterdate = enterdate;
    this.graduationdate = graduationdate;
    this.birthday = birthday;
    this.mobile = mobile;
    this.workunit = workunit;
    this.note = note;
    this.picture = picture;
  }

  public String getSid() {
    return sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public String getChname() {
    return chname;
  }

  public void setChname(String chname) {
    this.chname = chname;
  }

  public String getEnname() {
    return enname;
  }

  public void setEnname(String enname) {
    this.enname = enname;
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

  public Long getGrade() {
    return grade;
  }

  public void setGrade(Long grade) {
    this.grade = grade;
  }

  public String getTutor() {
    return tutor;
  }

  public void setTutor(String tutor) {
    this.tutor = tutor;
  }

  public String getAssociatetutor() {
    return associatetutor;
  }

  public void setAssociatetutor(String associatetutor) {
    this.associatetutor = associatetutor;
  }

  public String getEnterdate() {
    return enterdate;
  }

  public void setEnterdate(String enterdate) {
    this.enterdate = enterdate;
  }

  public String getGraduationdate() {
    return graduationdate;
  }

  public void setGraduationdate(String graduationdate) {
    this.graduationdate = graduationdate;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getWorkunit() {
    return workunit;
  }

  public void setWorkunit(String workunit) {
    this.workunit = workunit;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }
}
