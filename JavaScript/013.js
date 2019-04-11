'use strict';

// Time 01:18:44.363

let limit = 2000000; 
let  p = 2;
let primeNumbers = [];
let sum = 0;


function calsHero(){
    while(p < Math.floor(Math.sqrt(limit))){
        for(let i = 2; i < limit; i+= p){
            primeNumbers[i] = false;
        }

        for(let j = p; j < limit; j++){
            if(primeNumbers[j] === undefined){
                p = j; 
                break;
            }
        }
    }

    for(k = 2; k < limit; k++){
        if(primeNumbers[k] === undefined){
            sum+= k;
        }
    }
}

module.exports = calsHero();