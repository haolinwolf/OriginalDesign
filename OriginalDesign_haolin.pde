
int carX= -100;
void setup()
{
  size (400,400);
  noStroke();
  
}

void draw()
{ 
  carX=carX+3;
  background (100,350,296);
 
  road();
  grass();
  taxi();
  wheels();

  if(carX>450) 
  {
  	carX=-100;
  }

 
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


