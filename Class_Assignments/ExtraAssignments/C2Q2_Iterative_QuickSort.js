/*
* To understand the value of recursion in a programming language, write a
* program that implements quicksort, first using recursion and then without
* recursion
*/
/*
* Author: Enes Kemal Ergin
* Assignment: Assignment 1P - Extra 1 - iterative Quick Sort
* Class : Programming Languages
* Date : 09/08/15
*/

var a = [8,4,6,2,1,9,5,5,4,3,4,3];

function quicksort(arr)
{
    var stack = [arr];
    var sorted = [];

    while (stack.length) {

        var temp = stack.pop(), tl = temp.length;

        if (tl == 1) {
            sorted.push(temp[0]);
            continue;
        }
        var pivot = temp[0];
        var left = [], right = [];

        for (var i = 1; i < tl; i++) {
            if (temp[i] < pivot) {
                left.push(temp[i]);
            } else {
                right.push(temp[i]);
            }
        }

        left.push(pivot);

        if (right.length)
            stack.push(right);
        if (left.length)
            stack.push(left);

    }

    console.log(sorted);
}
quicksort(a);
