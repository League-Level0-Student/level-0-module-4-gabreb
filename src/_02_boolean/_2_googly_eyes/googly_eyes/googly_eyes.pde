PImage face;
void setup() {
size(800,600);
face = loadImage("face1.jpg");
face.resize(width,height);
}

void draw() {
  image(face,0,0);
  fill(225, 225, 225); 
  ellipse(220, 300, 275, 250);  
  ellipse(580, 300, 275, 250); 
  fill(0,0,0); 
  if (mouseX<124) {
    mouseX=124;
  }
  if (mouseX>287) {
    mouseX=287;
  }
  if (mouseY<225) {
    mouseY=225;
  }
  if(mouseY>375) {
    mouseY=375;
  }
  ellipse(mouseX, mouseY, 80, 80); 
  ellipse(mouseX+360, mouseY , 80, 80); 
  
}
