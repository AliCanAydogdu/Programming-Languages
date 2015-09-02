/* To understand the value of counting loops, write a program that implements
 * matrix multiplication using counting loop constructs. Then write
 * the same program using only logical loops—for example, while loops.
 */

 /* Author: Enes Kemal Ergin
  * Assignment: Assignment 1P - Extra 2
  * Class : Programming Languages
  * Date : 09/02/15
  */

#include <stdio.h>

int main(int argc, char const *argv[]) {
  // Defining variables to represent number of columns rows, iteration number...
  int a,b,c,d,e,f,g, sum = 0;

  // Defining matrices with max number of row and colums.
  int first_matrix[5][5], second_matrix[5][5], product[5][5];


  /* First Matrix */
  printf("For first matrix: \n");
  printf("Enter the number of rows and columns respectively:\t");
  scanf("%d%d\n", &a, &b); // gets number of columns and rows

  printf("Enter the elements of the matrix: \n");
  // Using nested for loop can reach every element in matrix and add elements
  for(c = 0; c < a; c++){ // Loops through rows
    for(d = 0; d < b; d++){ // Loops through columns
      scanf("%d", &first_matrix[c][d]);
    }
  }

  /* Second Matrix*/
  printf("For second matrix: \n");
  printf("Enter the number of rows and columns respectively:\t");
  scanf("%d%d\n", &e, &f); //gets the number of column of rows for second matrix

  printf("Enter the elements of the matrix: \n");
  // Using nested for loop
  for(c = 0; c < e; c++){
    for(d = 0; d < f; d++){
      scanf("%d", &second_matrix[c][d]);
    }
  }

  // Checks if multiplication is possible
  if(b == e){
    for(c = 0; c < a; c++){
      for(d = 0; d < f; d++){
        for(g = 0; g < e; g++){
          sum = sum + first_matrix[c][g] * second_matrix[g][d];
        }
        product[c][d] = sum;
        sum = 0;
      }
    }
  }

  // Prints the product matrix
  printf("Here is the product matrix:\n");
  for(c = 0; c < a; c++){
    for(d = 0; d < f; s++){
      printf("%d\t", product[c][d]);
    }
    printf("\n");
  }
  return 0;
}
