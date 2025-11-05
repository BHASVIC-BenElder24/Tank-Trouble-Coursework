import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playertankbody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTankBody extends Actor
{
    /**
     * Act - do whatever the playertankbody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int tankx = getX();
        int tanky = getY();
        int directionx = 0;
        int directiony = 0;
        
        if (Greenfoot.isKeyDown("w"))
        {
            directiony++;
        }
        if (Greenfoot.isKeyDown("a"))
        {
            directionx--;
        }
        if (Greenfoot.isKeyDown("s"))
        {
            directiony--;
        }
        if (Greenfoot.isKeyDown("d"))
        {
            directionx++;
        }
        
        if (directiony == 1 && (!(directionx == 1 || directionx == -1)))
        {
            setRotation(270);
            move(4);
        }
        if (directiony == 1 && directionx == 1)
        {
            setRotation(315);
            move(4);
        }
        if (directionx == 1 && (!(directiony == 1 || directiony == -1)))
        {
            setRotation(0);
            move(4);
        }
        if (directionx == 1 && directiony == -1)
        {
            setRotation(45);
            move(4);
        }
        if (directiony == -1 && (!(directionx == 1 || directionx == -1)))
        {
            setRotation(90);
            move(4);
        }
        if (directiony == -1 && directionx == -1)
        {
            setRotation(135);
            move(4);
        }
        if (directionx == -1 && (!(directiony == 1 || directiony == -1)))
        {
            setRotation(180);
            move(4);
        }
        if (directionx == -1 && directiony == 1)
        {
            setRotation(225);
            move(4);
        }
    }
    public PlayerTankBody()
    {
        GreenfootImage image = getImage();
        image.scale(45, 45);
        setImage(image);
    }
}