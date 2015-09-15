
int size=50;
Die Rex;
int dotSiz=10;
int num=0;
void setup()
{
	size(400,420);
	noLoop();
}
void draw()
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
void mousePressed()
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
	void roll()
	{
	fill(0,0,0);

	dot = (int)(Math.random()*6)+1;
	num=num+dot;

	if (dot==1)
	{
		ellipse(myX+25,myY+25,dotSiz,dotSiz);
	}
	if (dot==2)
	{
		ellipse(myX+12,myY+12,dotSiz,dotSiz);
		ellipse(myX+38,myY+38,dotSiz,dotSiz);
	}
	if (dot==3)
	{
		ellipse(myX+25,myY+25,dotSiz,dotSiz);
		ellipse(myX+12,myY+12,dotSiz,dotSiz);
		ellipse(myX+38,myY+38,dotSiz,dotSiz);	
	}
	if (dot==4)
	{
	ellipse(myX+12,myY+12,dotSiz,dotSiz);
	ellipse(myX+38,myY+38,dotSiz,dotSiz);
	ellipse(myX+12,myY+38,dotSiz,dotSiz);
	ellipse(myX+38,myY+12,dotSiz,dotSiz);
	}
	if (dot==5)
	{
	ellipse(myX+12,myY+12,dotSiz,dotSiz);
	ellipse(myX+38,myY+38,dotSiz,dotSiz);
	ellipse(myX+12,myY+38,dotSiz,dotSiz);
	ellipse(myX+38,myY+12,dotSiz,dotSiz);
	ellipse(myX+25,myY+25,dotSiz,dotSiz);
	}
	if (dot==6){
	ellipse(myX+12,myY+12,dotSiz,dotSiz);
	ellipse(myX+38,myY+38,dotSiz,dotSiz);
	ellipse(myX+12,myY+38,dotSiz,dotSiz);
	ellipse(myX+38,myY+12,dotSiz,dotSiz);
	ellipse(myX+12,myY+25,dotSiz,dotSiz);
	ellipse(myX+38,myY+25,dotSiz,dotSiz);
	}
	
}

		//your code here
	void show()
	{
		fill(num,num,num);
		rect(myX,myY,size,size);

	
		
	}
}
