import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int sunY=360;
int carX= -100;
public void setup()
{
  size (400,400);
  noStroke();
  
}

public void draw()
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

public void sun()
{
	
	fill(237,191,98);
	ellipse(200,sunY,150,150);
	
}

public void road()
{
	fill(120,118,118);
	rect(-5,250,405,205);
}

public void grass()
{
	fill(76,168,67);
	rect(0,300,400,100);

}

public void taxi()
{
	fill(156,132,12);
	rect(carX-25,210,120,40);
	rect(carX+15,180,55,50);
	 
}

public void wheels()
{
	fill(5,5,5);
	ellipse(carX,250,30,30);
	ellipse(carX+70,250,30,30);
} 



int carX= -100;
public void setup()
{
  size (400,400);
  noStroke();
  
}

public void draw()
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


public void road()
{
	fill(120,118,118);
	rect(-5,250,405,205);
}

public void grass()
{
	fill(76,168,67);
	rect(0,300,400,100);

}

public void taxi()
{
	fill(156,132,12);
	rect(carX-25,210,120,40);
	rect(carX+15,180,55,50);
	 
}

public void wheels()
{
	fill(5,5,5);
	ellipse(carX,250,30,30);
	ellipse(carX+70,250,30,30);
} 


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
