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
    public void act()
    {
        move(6);
        if(hasFacedMouse == false)
        {
            faceMouse();
            hasFacedMouse = true;
        }
    }
    public PlayerShot()
    {
        GreenfootImage image = getImage();
        image.scale(75, 75);
        setImage(image);
    }
    public void faceMouse()
    {
        MouseInfo pointer = Greenfoot.getMouseInfo();
        int mouseX = pointer.getX();
        int mouseY = pointer.getY();
        turnTowards(mouseX, mouseY);
    }
}
