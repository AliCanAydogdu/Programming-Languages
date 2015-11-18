
# To understand the value of recursion in a programming language, write a
# program that implements quicksort, first using recursion and then without
# recursion


 # Author: Enes Kemal Ergin
 # Assignment: Assignment 1P - Extra 1 - Recursive Quick Sort
 # Class : Programming Languages
 # Date : 09/01/15


def quicksort(a, low, high):
    if low < high:
        pivot_location = partition(a, low, high)
        quicksort(a, low, pivot_location-1)
        quicksort(a, pivot_location+1, high)

def partition(a, low, high):
    pivot = a[low]
    left_hand = low
    for i in range(low+1, high):
        if a[i] < pivot:
            left_hand = left_hand + 1
            a[i] , a[left_hand] = a[left_hand], a[i]
    a[low], a[left_hand] = a[left_hand], a[low]
