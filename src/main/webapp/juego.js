/**
 * 
 */


setTimeout(function() {
    location.href="juego.html";
}, 1000*15);

const c=document.querySelector(".p1");
const c2=document.querySelector(".p2");
const c3=document.querySelector(".p3");
const c4=document.querySelector(".p4");
console.log(c);

function cb1() {
    document.querySelector(".rb1").checked=true;
    c2.classList.remove("pselec");
    c3.classList.remove("pselec");
    c4.classList.remove("pselec");
    c.classList.add("pselec");
}

function cb2() {
    document.querySelector(".rb2").checked=true;
    c3.classList.remove("pselec");
    c4.classList.remove("pselec");
    c.classList.remove("pselec");
    c2.classList.add("pselec");
}
function cb3() {
    document.querySelector(".rb3").checked=true;
    c2.classList.remove("pselec");
    c.classList.remove("pselec");
    c4.classList.remove("pselec");
    c3.classList.add("pselec");
}
function cb4() {
    document.querySelector(".rb4").checked=true;
    c2.classList.remove("pselec");
    c3.classList.remove("pselec");
    c.classList.remove("pselec");
    c4.classList.add("pselec");
}


c.addEventListener("click", cb1);
c2.addEventListener("click", cb2);
c3.addEventListener("click", cb3);
c4.addEventListener("click", cb4);