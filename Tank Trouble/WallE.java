import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallE extends Actor
{
    /**
     * Act - do whatever the WallE wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        PlayerShot shot = (PlayerShot) getOneIntersectingObject(PlayerShot.class);
        if (shot != null)
        {
             int angle = shot.getRotation();
             shot.setRotation(180 - angle);
        }
    }
    public WallE()
    {
        GreenfootImage image = getImage();
        image.scale(35, 100);
        setImage(image);
    }
}