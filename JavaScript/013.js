'use strict';

/* 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000? */



//fills an array with zeroes
var A = Array.apply(null,new Array(100)).map(Number.prototype.valueOf,0);

A[0] = 2;

//100,000,000,000,000 - the largest number any individual cell will hold
var MAX  = 100000000000000; 

var n = 1000; //2^n

for (var i = 0; i < (n-1); i++) {

    //First, the value in each cell is doubled.
    for (var k = 0; k < A.length; k++) {
        A[k] = A[k] * 2;
    }

    //Second, the new value in each cell is compared to MAX.
    //If the value is larger than MAX, the most significant digit
    //  is added to the value of the next cell, and is trimmed from the 
    //  value, thus keeping each cell's value below MAX.
    for (var j = 0; j < A.length; j++) {
        if (A[j] > MAX) {
        A[j+1] += Math.floor( A[j] / MAX );
        A[j] = ( A[j] % MAX );
    }
}

//This converts the resulting number to a string
var outputstringA = "";
for (var x = 0; x < A.length; x++) {
    outputstringA += A[A.length-1-x];
}

//This computes the total value of the digits contained within
// the string
var answerA = 0;
for (var y = 0; y < outputstringA.length; y++) {
    answerA += parseInt(outputstringA[y]);
}

console.log(outputstringA, answerA);
module.exports = sum; 