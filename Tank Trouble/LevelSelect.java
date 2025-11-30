import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends Actor
{
    /**
     * Act - do whatever the LevelSelect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().addObject(new Button1(), 200, 500);
            getWorld().addObject(new Button2(), 400, 500);
            getWorld().addObject(new Button3(), 600, 500);
            getWorld().removeObject(this);
        }
    }
    public LevelSelect()
    {
        GreenfootImage image = getImage();
        image.scale(160, 90);
        setImage(image);
    }
}
