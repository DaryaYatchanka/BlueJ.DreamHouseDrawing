
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall2;
    private Square window;
    private Square window2;
    private Square window3;
    private Square window4;
    private Triangle roof;
    private Triangle roof2;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        this.draw();// nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.changeColor("black");
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.moveVertical (100);
        wall2.makeVisible();
        wall2.changeColor ("black");
        wall2.changeSize(200);
        
        
 

        window = new Square();
        window.changeColor("blue");
        window.moveHorizontal(20);
        window.moveVertical(110);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("blue");
        window2.moveHorizontal(120);
        window2.moveVertical(200);
        window2.makeVisible();
       
        window3= new Square();
        window3.changeColor("blue");
        window3.moveHorizontal(20);
        window3.moveVertical(170);
        window3.makeVisible();
        
        
        
        window4 = new Square();
        window4.changeColor("blue");
        window4.moveHorizontal(120);
        window4.moveVertical(130);
        window4.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeSize (60, 160);
        roof2.moveHorizontal(130);
        roof2.moveVertical(75);
        roof2.makeVisible();
        
        

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-50);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
