/* To understand the value of records in a programming language,
 * write a small program in a C-based language that uses
 * an array of structs that store student information, including name,
 * age, GPA as a float, and grade level as a string
 * (e.g., “freshmen,” etc.).
 */

/* Author: Enes Kemal Ergin
 * Assignment: Assignment 1P
 * Class : Programming Languages
 * Date : 09/06/15
 */

 #include <iostream>

 using namespace std;

 struct Student {
   string name;
   int age;
   float gpa;
   string gradeLevel;
 };

 int main (int argc, char* argv[])
 {
   Student students[2] = {{"Enes", 21, 3.89, "Senior"},
                          {"Kemal", 24, 3.49, "Freshman"}};

  

 }
