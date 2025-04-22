const themetoggle=document.getElementById('theme-toggle');
const html=document.documentElement;

themetoggle.addEventListener('click',()=>{
    const currentTheme=html.getAttribute('data-theme');
    const newtheme=currentTheme==='dark'?'light':'dark';
    html.setAttribute('data-theme',newtheme);
    themetoggle.classList.toggle('fa-sun');
    themetoggle.classList.toggle('fa-moon');
   
    
})
var typed = new Typed('#element', {
    strings: ['ADITYA','A YOUTUBER','CODER'],
    typeSpeed: 50,
    backSpeed: 50,
    loop:true
  });