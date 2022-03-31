console.log("hello world")
let par;
function setup()
{
  //createCanvas(400,400);
  //background(0);
  //rect(width/2 - 25,height/2 - 25, 50,50);
  let inp = createInput(' ');
  inp.position(100 ,10);
  inp.size(200);
  inp.input(() => {})
  par = createP('hello world');
  par.position(100, 60);
  par.size(200);
  par.style('font size', '50px');
  par.style('font color', 255);
  let but = createButton('Submit');
  but.position(50, 35);
  but.size(100);
  let x = par.textContent;
  but.mousePressed(() => {
      par.remove();
      par.createP(inp.value());
      par.position(100, 60);
      par.size(200);
      par.style('font size', '50px');
      inp.value(' ')
  })
}
