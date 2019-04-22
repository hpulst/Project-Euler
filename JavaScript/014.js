'use strict';

// Time 42m29s80

function collatzNum(n) {
    if (n % 2 == 0) {
        return n / 2;
    }
    else {
        return (n * 3) + 1;
    }
}

function collatzSequence(n) {
    let counter = 1;
    while (n != 1) {
        n = collatzNum(n);
        counter++;
    }
    return counter;
}

function longestChain(n) {
    let max = 0;
    let max_index;

    for (let i = 1; i < n; i++) {
        let sequence = collatzSequence(i);
        if (sequence > max) {
            max = sequence;
            max_index = i;
        }
    }
    return max_index;
}


module.exports = longestChain(1000000);