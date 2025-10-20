import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyShot extends Actor
{
    /**
     * Act - do whatever the EnemyShot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(6);
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
    }
    public EnemyShot()
    {
        GreenfootImage image = getImage();
        image.scale(75, 75);
        setImage(image);
    }
}
