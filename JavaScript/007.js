"use strict";

/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
that the 6th prime is 13.

What is the 10001st prime number? 
Total: 8 min
*/

function isPrim(n){
    let b = true;
    let j = 2; 
    while(j<=Math.sqrt(n)) {
            if(n%j == 0) {
                b = false; 
                break; 
            }
            j++; 
    }
    return b; 
}

function countPrim(n){
    let count = 0,
    m = 1; 
    
    while(count < n){
        m++;
        if(isPrim(m)) count++;
    }
    return m;
}

module.exports = countPrim(10001) ; 