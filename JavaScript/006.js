'use strict';

/* 
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten
natural numbers and the square of the sum is 3025 - 385 = 2640.

Find the difference between the sum of the squares of the first one
hundred natural numbers and the square of the sum. 
*/

function squareSum(n) {
    var i, s = 1,
        e = Math.log(n) / Math.LN10;
    // special case: n is a power of 10
    if (e - (e << 0) === 0) {
        s = n * (n >> 1) + (n >> 1);
    }
    else {
        for (i = 2; i <= n; i += 1) {
            s += i;
        }
    }
    return s * s;

}

function sumSquare(n) {
    let i, sum = 0;
    for (i = 1; i <= n; i++) {
        sum += i * i;
    }
    return sum;
}

module.exports = squareSum(100) - sumSquare(100); 