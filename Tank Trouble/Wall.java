import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        PlayerShot shot = (PlayerShot) getOneIntersectingObject(PlayerShot.class);
        if (shot != null)
        {
             int angle = shot.getRotation();
             if (angle > 180 && angle < 360)
             {
                 shot.setRotation(180 - angle);
             }
             if (angle < 180 && angle > 0)
             {
                 shot.setRotation(-angle);
             }
        }
    }
    public Wall()
    {
        GreenfootImage image = getImage();
        image.scale(100, 50);
        setImage(image);
    }
}
