# To understand the value of recursion in a programming language, write a
# program that implements quicksort, first using recursion and then without
# recursion


 # Author: Enes Kemal Ergin
 # Assignment: Assignment 1P - Extra 1 - Recursive Quick Sort
 # Class : Programming Languages
 # Date : 09/08/15

# I used vectors like lists/arrays here
quicksort <- function(vec) {

  if(length(vec) > 1) {

    pivot <- vec[1]

    low <- quicksort(vec[vec < pivot])
    mid <- vec[vec == pivot]
    high <- quicksort(vec[vec > pivot])

    c(low, mid, high)
  }

  else vec
}

example_vector = c(8,3,2,1,9,4,7,10,5,6)
quicksort(example_vector)
