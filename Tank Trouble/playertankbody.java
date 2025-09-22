import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playertankbody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playertankbody extends Actor
{
    /**
     * Act - do whatever the playertankbody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turnTowards(playertankbody.getX()-1, playertankbody.getY());
        }
    }
    public playertankbody()
    {
        GreenfootImage image = getImage();
        image.scale(45, 45);
        setImage(image);
    }
}
