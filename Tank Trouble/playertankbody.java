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
        if (Greenfoot.isKeyDown("a"))
        {
            turnTowards(tankx-2, tanky);
            move(2);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turnTowards(tankx+2, tanky);
            move(2);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            turnTowards(tankx, tanky+2);
            move(2);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            turnTowards(tankx, tanky-2);
            move(2);
        }
    }
    public PlayerTankBody()
    {
        GreenfootImage image = getImage();
        image.scale(45, 45);
        setImage(image);
    }
}