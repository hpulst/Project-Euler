'use strict';


/* 
Time 00:13:49.805

A Pythagorean triplet is a set of three natural numbers, a < b < c, for
which,
                             a^2 + b^2 = c^2

For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc. 
*/


function calcHero() {
    for (let i = 1; i < 334; i++) {
        for (let j = i; j < 1000; j++) {
            let k = 1000 - i - j;
            if (Math.pow(i, 2) + Math.pow(j, 2) === Math.pow(k, 2)) {
                return i * j * k;
            }
        }
    }
}
module.exports = calcHero(); 