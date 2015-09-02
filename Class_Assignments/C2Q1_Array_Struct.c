/* To understand the value of records in a programming language,
 * write a small program in a C-based language that uses
 * an array of structs that store student information, including name,
 * age, GPA as a float, and grade level as a string
 * (e.g., “freshmen,” etc.).
 */

/* Author: Enes Kemal Ergin
 * Assignment: Assignment 1P
 * Programming Languages
 */

 #include <stdio.h>
 #include <string.h>

 struct studentInfo{
   char name[20];
   int age;
   float gpa;
   char gradeLevel[20];

 }

int main (){
  // Allows us to create array of 2 using studentInfo structure.
  struct studentInfo number[1];
  int i ;
  // get the info from user
  for(i=0;i<3;i++){
    printf("\nEnter the student name            : ");
    gets(number[i].name);
    printf("\nEnter the student age             : ");
    scanf("%d",number[i].age);
    printf("\nEnter the student GPA             : ");
    scanf("%f",number[i].gpa);
    printf("\nEnter the student grade level     : ");
    gets(number[i].gradeLevel);
  }
  printf("\n--------- Details of Student ------------ ");

  for(i=0;i<3;i++){
    printf("\nStudent name    : %s",number[i].name);
    printf("\nStudent age     : %d",number[i].age);
    printf("\nStudent GPA     : %f",number[i].gpa);
    printf("\nStudent Grade   : %s",number[i].gradeLevel);
  }

  return 0

}
