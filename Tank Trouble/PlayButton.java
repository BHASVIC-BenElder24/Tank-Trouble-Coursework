import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayButton extends Actor
{
    private boolean mouseOver = false;
    
    public void act()
    {
        checkClick(new Level1());
    }
    public PlayButton()
    {
        GreenfootImage image = getImage();
        image.scale(145, 145);
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