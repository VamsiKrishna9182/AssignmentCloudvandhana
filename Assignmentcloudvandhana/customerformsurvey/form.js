var fnameError = document.getElementById('firstname-error');
var lnameError = document.getElementById('lastname-error');
var dobError = document.getElementById('dob-error');
var designationError = document.getElementById('designation-error');
var emailError = document.getElementById('email-error');
var phoneError = document.getElementById('phone-error');
var submitError = document.getElementById('submit-error');

function validateFName() {
    var name = document.getElementById('fname').value;
    if (name.length == 0) {
        // fnameError.innerHTML ='First name is required';
        return false;
    }
    return true;
}
function validateLName() {
    var name = document.getElementById('lname').value;
    if (name.length == 0) {
        // lnameError.innerHTML ='Last name is required';
        return false;
    }
    return true;
}
function validateDesignation() {
    var designation = document.getElementById('email').value;
    if (designation.length == 0) {
        //  designationError.innerHTML ='designation is required';
        return false;
    }
    return true;
}
function validateEmail() {
    var email = document.getElementById('email').value;
    if (email.length == 0) {
        // emailError.innerHTML ='email is required';
        return false;
    }
    return true;
}
function validatePhone() {
    var phone = document.getElementById('phone').value;
    if (phone.length == 0) {
        //  phoneError.innerHTML ='Phone number is required';
        return false;
    }
    if (phone.length !== 10) {
        // phoneError.innerHTML ='Phone number should be 10 digits';
        return false;
    }
    return true;
}


function submitForm() {
    if (!validateDesignation() || !validateEmail() || !validateFName() || !validateLName() || !validatePhone()) {
        alert("Please fill the all details")
        document.contact - form.reset();
    }
    else {
        document.contact - form.submit();
    }

}
function submitForm1() {

    document.contact - form.reset();
}






