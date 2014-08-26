int sunY=360;
int carX= -100;
void setup()
{
  size (400,400);
  noStroke();
  
}

void draw()
{ sunY=sunY-1; 
  carX=carX+3;
background (100,sunY,296);
  sun();
  road();
  grass();
  taxi();
  wheels();
  if(sunY>-100)
  {
  	sunY=360;
  }
  if(carX>450) 
  {
  	carX=-100;
  }

 
}

void sun()
{
	
	fill(237,191,98);
	ellipse(200,sunY,150,150);
	
}

void road()
{
	fill(120,118,118);
	rect(-5,250,405,205);
}

void grass()
{
	fill(76,168,67);
	rect(0,300,400,100);

}

void taxi()
{
	fill(156,132,12);
	rect(carX-25,210,120,40);
	rect(carX+15,180,55,50);
	 
}

void wheels()
{
	fill(5,5,5);
	ellipse(carX,250,30,30);
	ellipse(carX+70,250,30,30);
} 


