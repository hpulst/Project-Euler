const fs = require("fs");
const answers = require("./answers");

const files = fs.readdirSync(`${__dirname}/../JavaScript`);

for (var i = 1; i <= files.length; i++) {
  describe(`Problem ${i}`, () => {
    let startTime = new Date();

    const solution = require(`../JavaScript/${`00${i}`.slice(-3)}`);
    let endTime = new Date();
    let elapsedTime = endTime - startTime;

    const correctAnswer = answers[`problem${i}`];

    test(`Your answer: ${solution} (${elapsedTime}ms)`, () => {
      expect(solution).toStrictEqual(correctAnswer);
    });
  });
}
