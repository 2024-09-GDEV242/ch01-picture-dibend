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
    private Square base;
    private Square window;
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
        base = new Square();
        window = new Square();
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
            base.moveVertical(-100);
            window.changeColor("blue");
            base.changeSize(1000);
            base.changeColor("gray");
            spaceship.moveVertical(20);
            spaceship.changeColor("red");
            alien1.changeColor("green");
            alien2.changeColor("green");
            alien3.changeColor("green");
            base.makeVisible();
            spaceship.makeVisible();
            alien1.makeVisible();
            alien2.makeVisible();
            alien3.makeVisible();
            person.makeVisible();
            window.makeVisible();
            alien1.slowMoveHorizontal(30);
            alien2.slowMoveHorizontal(40);
            alien3.slowMoveHorizontal(50);
    
    
            moon.changeColor("yellow");
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
        base.changeColor("black");
        alien1.changeColor("gray");
        alien2.changeColor("gray");
        alien3.changeColor("gray");
        window.changeColor("gray");
        moon.changeColor("gray");
        spaceship.changeColor("gray");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        base.changeColor("gray");
        window.changeColor("blue");
        alien1.changeColor("green");
        alien2.changeColor("green");
        alien3.changeColor("green");
        moon.changeColor("yellow");
        spaceship.changeColor("red");
    }
}
