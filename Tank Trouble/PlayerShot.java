import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.MouseInfo;
/**
 * Write a description of class PlayerShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerShot extends Actor
{
    boolean hasFacedMouse = false;
    SimpleTimer destroyTimer = new SimpleTimer();
    public void act()
    {
        move(5);
        if(hasFacedMouse == false)
        {
            faceMouse();
            hasFacedMouse = true;
        }
        if(getX() <= 5 || getX() >= getWorld().getWidth() -5)
        {
            int angle = getRotation();
            setRotation(180 - angle);
        }
        if(getY() <= 5 || getY() >= getWorld().getHeight() -5)
        {
            int angle = getRotation();
            setRotation(-angle);
        }
        if(destroyTimer.millisElapsed() > 3000)
        {
            getWorld().removeObject(this);
        }
    }
    public PlayerShot()
    {
        GreenfootImage image = getImage();
        image.scale(75, 75);
        setImage(image);
        destroyTimer.mark();
    }
    public void faceMouse()
    {
        MouseInfo pointer = Greenfoot.getMouseInfo();
        int mouseX = pointer.getX();
        int mouseY = pointer.getY();
        turnTowards(mouseX, mouseY);
    }
}
