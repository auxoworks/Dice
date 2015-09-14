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

public class Dice extends PApplet {


int size=50;
Die Rex;
int dotSize=10;
int num=0;
public void setup()
{
	size(400,420);
	noLoop();
}
public void draw()
{	background(255,255,255);
	stroke(20);
	fill(0);

	for (int y=0;y<=350;y+=50){
		for(int x=0;x<=400;x+=50){
	
		Rex= new Die (x,y);	
		Rex.show();
		Rex.roll();

		}
	}
	textSize(20);
	text("total is: "+num,270,416);


}
public void mousePressed()
{
	num=0;
	redraw();

}
class Die //models one single dice cube
{
	int dot;
	int myX, myY;
	//variable declarations here
	Die(int x, int y)  //constructor 
	{
		myX=x;
		myY=y;//variable initializations here
	}
	public void roll()
	{
	fill(0,0,0);

	dot = (int)(Math.random()*6)+1;
	num=num+dot;

	if (dot==1)
	{
		ellipse(myX+25,myY+25,dotSize,dotSize);
	}
	if (dot==2)
	{
		ellipse(myX+12,myY+12,dotSize,dotSize);
		ellipse(myX+38,myY+38,dotSize,dotSize);
	}
	if (dot==3)
	{
		ellipse(myX+25,myY+25,dotSize,dotSize);
		ellipse(myX+12,myY+12,dotSize,dotSize);
		ellipse(myX+38,myY+38,dotSize,dotSize);	
	}
	if (dot==4)
	{
	ellipse(myX+12,myY+12,dotSize,dotSize);
	ellipse(myX+38,myY+38,dotSize,dotSize);
	ellipse(myX+12,myY+38,dotSize,dotSize);
	ellipse(myX+38,myY+12,dotSize,dotSize);
	}
	if (dot==5)
	{
	ellipse(myX+12,myY+12,dotSize,dotSize);
	ellipse(myX+38,myY+38,dotSize,dotSize);
	ellipse(myX+12,myY+38,dotSize,dotSize);
	ellipse(myX+38,myY+12,dotSize,dotSize);
	ellipse(myX+25,myY+25,dotSize,dotSize);
	}
	if (dot==6){
	ellipse(myX+12,myY+12,dotSize,dotSize);
	ellipse(myX+38,myY+38,dotSize,dotSize);
	ellipse(myX+12,myY+38,dotSize,dotSize);
	ellipse(myX+38,myY+12,dotSize,dotSize);
	ellipse(myX+12,myY+25,dotSize,dotSize);
	ellipse(myX+38,myY+25,dotSize,dotSize);
	}
	
}

		//your code here
	public void show()
	{
		fill(num,num,num);
		rect(myX,myY,size,size);

	
		
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
