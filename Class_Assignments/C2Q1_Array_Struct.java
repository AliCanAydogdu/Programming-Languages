/* To understand the value of records in a programming language,
 * write a small program in a C-based language that uses
 * an array of structs that store student information, including name,
 * age, GPA as a float, and grade level as a string
 * (e.g., “freshmen,” etc.).
 */

/* Author: Enes Kemal Ergin
 * Assignment: Assignment 1P
 * Class : Programming Languages
 * Date : 09/02/15
 */

import java.util.Scanner;

public class array_struct{

  public static void main(String[] args) {
    // Variables to use
    String name, grade;
    int age;
    float gpa;

    // Creates a new array object
    array[] student = new array[2];

    // Creates the objects in array
    student[0] = new student("Enes", 21, 3.68, "Senior");
    student[1] = new student("Kemal", 35, 1.8, "Freshman");

    // Some printing from the Arrays
    String name1 = student[0].getName()
    System.out.println("What is the age of 1st student: " + name1)




  }
}
