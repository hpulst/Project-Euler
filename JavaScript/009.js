'use strict';


/* 
A Pythagorean triplet is a set of three natural numbers, a < b < c, for
which,
                             a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc. 
*/


function calculate() {
    for (let a = 1; a < 334; a++) {
        for (let b = a; b < 1000 - a; b++) {
            let c = 1000 - a - b;

            if (Math.pow(a, 2) + Math.pow(b, 2) === Math.pow(c, 2)) {
                return a * b * c;
            }
        }
    }
}

module.exports = calculate();