"use strict";

// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475


const number = 600851475143;

function largestPrimeFactorOf(number){
    var factor = 2;

    while(factor <= number){
        if(number % factor == 0){
            number /= factor;
        } else {
            factor++;
        }
    }
    return factor;

}


module.exports = largestPrimeFactorOf(number);
