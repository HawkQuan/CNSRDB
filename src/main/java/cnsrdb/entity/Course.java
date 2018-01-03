package cnsrdb.entity;

public class Course {
  private Long id;//自增id，构造函数里不要
  private String coursenum;//课程号
  private String coursename;//课程名
  private String coursetype;//课程类型
  private String studentlevel;//学生水平
  private String coursehours;//课时
  private String lecturer;//教课老师
  private String venue;//上课地点
  private String note;//备注

  public Course(){

  }

  public Course(String coursenum, String coursename, String coursetype, String studentlevel, String coursehours, String lecturer, String venue, String note) {
    this.coursenum = coursenum;
    this.coursename = coursename;
    this.coursetype = coursetype;
    this.studentlevel = studentlevel;
    this.coursehours = coursehours;
    this.lecturer = lecturer;
    this.venue = venue;
    this.note = note;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCoursenum() {
    return coursenum;
  }

  public void setCoursenum(String coursenum) {
    this.coursenum = coursenum;
  }

  public String getCoursename() {
    return coursename;
  }

  public void setCoursename(String coursename) {
    this.coursename = coursename;
  }

  public String getCoursetype() {
    return coursetype;
  }

  public void setCoursetype(String coursetype) {
    this.coursetype = coursetype;
  }

  public String getStudentlevel() {
    return studentlevel;
  }

  public void setStudentlevel(String studentlevel) {
    this.studentlevel = studentlevel;
  }

  public String getCoursehours() {
    return coursehours;
  }

  public void setCoursehours(String coursehours) {
    this.coursehours = coursehours;
  }

  public String getLecturer() {
    return lecturer;
  }

  public void setLecturer(String lecturer) {
    this.lecturer = lecturer;
  }

  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }
}
