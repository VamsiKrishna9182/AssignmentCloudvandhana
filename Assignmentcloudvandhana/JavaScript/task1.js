
const prompt= require('prompt-sync')();
function test(s) {
    let newString = "";
    for (let i = s.length - 1; i >= 0; i--) {
        newString += s[i];
    }
    return newString;
}
const s = prompt('Enter a string: ');

const result = test(s);
console.log(result);