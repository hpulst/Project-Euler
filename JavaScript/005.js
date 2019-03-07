// 2520 is the smallest number that can be divided by each of the numbers
// from 1 to 10 without any remainder.

// What is the smallest number that is evenly divisible by all of the numbers
// from 1 to 20?

function noRemainder(top) {
  var num = top;
  while (true) {
    var find = true;
    for (var i = top; i > 1; i--) {
      if (num % i !== 0) {
        find = false;
        break;
      }
    }
    if (find === true) {
      return num;
    }
    num += top;
  }
}

module.exports = noRemainder(20);
