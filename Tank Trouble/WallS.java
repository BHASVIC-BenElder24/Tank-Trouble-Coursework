import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallS extends Actor
{
    /**
     * Act - do whatever the WallS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        PlayerShot shot = (PlayerShot) getOneIntersectingObject(PlayerShot.class);
        if (shot != null)
        {
             int angle = shot.getRotation();
             shot.setRotation(-angle);
        }
        
        EnemyShot eShot = (EnemyShot) getOneIntersectingObject(EnemyShot.class);
        if (eShot != null)
        {
            int angle = eShot.getRotation();
             eShot.setRotation(-angle);
        }
    }
    public WallS()
    {
        GreenfootImage image = getImage();
        image.scale(100, 15);
        setImage(image);
    }
}
