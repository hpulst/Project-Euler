'use strict';

//Time 01:01:37.098

/* It is based on coprime numbers properties. The triangle number is equal to 
n*(n+1)/2 where n and n+1 are coprimes => n and (n+1)/2 
are coprimes or n/2 and n+1 are coprimes ( it depends if n is even or odd ).  */


function getTriangle(n) {
    const THRESHOLD_DIVISORS = 500;
    let numberOfDivisors = 0;
    let firstCoprime, secondCoprime;
    while (true) {
        if (n % 2 == 0) {
            firstCoprime = getNumberOfDivisors(n / 2);
            secondCoprime = getNumberOfDivisors(n + 1);
            
        } else {
            firstCoprime = getNumberOfDivisors(n);
            secondCoprime = getNumberOfDivisors((n + 1) / 2);
        }
        numberOfDivisors = firstCoprime * secondCoprime;
        if (numberOfDivisors > THRESHOLD_DIVISORS) {
            return n * (n + 1) / 2;
        }
        n++;
    }
}

function getNumberOfDivisors(nr) {
    let divisors = 0;
    let sqrt = Math.sqrt(nr);
    for (let i = 1; i <= sqrt; i++) {
        if (nr % i == 0) {
            divisors += 2;           // E.g.: (2, n/2), (3, n/3)
        }
    }
    if (sqrt * sqrt == nr) {        // it was counted twice
        divisors--;
    }
    return divisors;
}

module.exports = getTriangle(1);