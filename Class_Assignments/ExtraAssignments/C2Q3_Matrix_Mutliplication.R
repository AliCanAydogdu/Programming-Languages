# To understand the value of counting loops, write a program that implements
# matrix multiplication using counting loop constructs. Then write
# the same program using only logical loops—for example, while loops.


# Author: Enes Kemal Ergin
# Assignment: Assignment 1P - Extra 2 
# Class : Programming Languages
# Date : 09/08/15


mymatrix <- matrix(1:9,3,3)
# First way to multiply matrices
mymatrix %*% mymatrix

#Second way is using loop
result <- mymatrix
n.mult <- 2
for(i in seq(n.mult)){
  result <- result %*% mymatrix
}
result

# Third way is also using loop but by using lapply(predefined structure)
matlist <- lapply(seq(n.mult+1), function(x){return(mymatrix)})
Reduce("%*%", matlist, accumulate = TRUE)
