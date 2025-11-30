import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button1 extends Actor
{
    /**
     * Act - do whatever the Button1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkClick(new Level1());
    }
    public Button1()
    {
        GreenfootImage image = getImage();
        image.scale(45, 80);
        setImage(image);
    }
    public void checkClick(World world)
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(world);
        }
    }
}
