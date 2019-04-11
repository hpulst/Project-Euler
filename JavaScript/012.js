'use strict';

/* 
Time 01:01:37.098
*/

let sum = 1, t = 1, count = 0; 
while (count<=500) {
  count = 0;
  for (let j = 1; j<=Math.sqrt(sum); j++) {
    if(sum % j === 0) {
      count += 2;
    }
  }
  t++;
  sum += t;
}

module.exports = sum - t;