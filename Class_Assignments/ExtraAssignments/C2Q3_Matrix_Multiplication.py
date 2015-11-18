# To understand the value of counting loops, write a program that implements
# matrix multiplication using counting loop constructs. Then write
# the same program using only logical loops—for example, while loops.


# Author: Enes Kemal Ergin
# Assignment: Assignment 1P - Extra 2 
# Class : Programming Languages
# Date : 10/16/15

# Pure Python Implementation
def matmult(a,b):
    zip_b = zip(*b)
    return [[sum(ele_a*ele_b for ele_a, ele_b in zip(row_a, col_b)) 
             for col_b in zip_b] for row_a in a]

x = [[1,2,3],[4,5,6],[7,8,9],[10,11,12]]
y = [[1,2],[1,2],[3,4]]

print matmult(x,y)


# Using numpy Library
import numpy as np 
mx = np.matrix(x)
my = np.matrix(y)
print mx * my