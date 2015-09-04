/*
 Supportive class for C2Q1_Array_Struct.java code.
*/
class array{
  private String name, gradeLevel;
  private int age;
  private float gpa;

  public array(String name, int age, float gpa, String gradeLevel){
    this.name = name;
    this.age = age;
    this.gpa = gpa;
    this.gradeLevel = gradeLevel;
  }

  public String getName(){return name;}
  public int getAge(){return age;}
  public float getGpa(){return gpa;}
  public String getGradeLevel(){return gradeLevel;}

  public void setName(String name){this.name = name;}
  public void setAge(int age){this.age = age;}
  public void setGpa(float gpa){this.gpa = gpa;}
  public void setGradeLevel(){this.gradeLevel = gradeLevel;}
}
