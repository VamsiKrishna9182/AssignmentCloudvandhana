
function clearScreen() {
    var d=document.getElementById("result")
    d.value = "";
}
 
function display(value) {
    var c=document.getElementById("result")
    c.value += value;
}
 

function calculate() {
    var p = document.getElementById("result").value;
    var q = eval(p);
    document.getElementById("result").value = q;
}