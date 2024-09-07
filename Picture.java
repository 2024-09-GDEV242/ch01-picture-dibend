/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square landscape;
    private Square sky;
    private Triangle spaceship;
    private Circle moon;
    private Person person;
    private Person alien1;
    private Person alien2;
    private Person alien3;
    private boolean drawn;
    
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        landscape = new Square();
        sky = new Square();
        spaceship = new Triangle();
        moon = new Circle();
        person = new Person();
        alien1 = new Person();
        alien2 = new Person();
        alien3 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            landscape.moveVertical(-600);
            sky.changeColor("black");
            landscape.changeSize(1000);
            spaceship.moveVertical(20);
            spaceship.changeColor("gray");
            alien1.changeColor("green");
            alien2.changeColor("green");
            alien3.changeColor("green");
            landscape.makeVisible();
            spaceship.makeVisible();
            alien1.makeVisible();
            alien2.makeVisible();
            alien3.makeVisible();
            person.makeVisible();
            alien1.slowMoveHorizontal(30);
            alien2.slowMoveHorizontal(40);
            alien3.slowMoveHorizontal(50);
    
    
            moon.changeColor("yellow");
            moon.moveHorizontal(100);
            moon.moveVertical(-40);
            moon.changeSize(80);
            moon.makeVisible();
            moon.slowMoveVertical(-30);
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        alien1.changeColor("gray");
        alien2.changeColor("gray");
        alien3.changeColor("gray");
        landscape.changeColor("black");
        sky.changeColor("white");
        moon.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        alien1.changeColor("green");
        alien2.changeColor("green");
        alien3.changeColor("green");
        sky.changeColor("black");
        moon.changeColor("yellow");
        spaceship.changeColor("gray");
    }
}
