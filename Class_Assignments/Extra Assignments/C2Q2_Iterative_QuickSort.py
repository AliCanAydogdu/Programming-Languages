# To understand the value of recursion in a programming language, write a
# program that implements quicksort, first using recursion and then without
# recursion
#

# Author: Enes Kemal Ergin
# Assignment: Assignment 1P - Extra 1 - iterative Quick Sort
# Class : Programming Languages
# Date : 09/08/15
#

example_list = [8,4,6,2,1,9,5,5,4,3,4,3]

def quicksort(list):
    list_ =  list
    empty = []

    while(len(list_)):
        temp = list_.pop()
        temp_length = len(temp)
        if temp_length == 1:
            empty.append(temp[0])

        pivot = temp[0]
        left_hand = []
        right_hand = []

        for i in range(temp_length):
            if temp[i] < pivot:
                left_hand.append(temp[i])
            else:
                right_hand.append(temp[i])

        left_hand.append(pivot)
        if len(right_hand):
            stack.append(right_hand)
        if len(left_hand):
            stack.append(left_hand)

    return empty

quicksort(example_list)
