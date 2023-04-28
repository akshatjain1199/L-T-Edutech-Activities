//fill your code
const firstname=document.getElementById("firstname")
const lastname=document.getElementById("lastname")
const but=document.querySelector("#register").classList
function myfun(){
    firstname.value=firstname.value.charAt(0).toUpperCase()+firstname.value.slice(1).toLowerCase()
}
firstname.onblur=function() {myfun()}
lastname.onblur=function() {myfuncL()}

function myfuncL(){
    lastname.value=lastname.value.charAt(0).toUpperCase()+lastname.value.slice(1).toLowerCase()
}

function nun(){
    but.add("mycol")
}
