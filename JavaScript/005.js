'use strict'; 

// 2520 is the smallest number that can be divided by each of the numbers
// from 1 to 10 without any remainder.

// What is the smallest number that is evenly divisible by all of the numbers
// from 1 to 20?

function noRemainder(n) {
  let find = false,
    m = n;
  while (find == false) {
    for (let i = 1; i <= n; i++) {
      if (m % i !== 0) {
        find == false;
        break;
      }
      if (i === n) {
        find = true;
        return m;   
      }
    }
    m++;
  }
}

module.exports = noRemainder(20);
