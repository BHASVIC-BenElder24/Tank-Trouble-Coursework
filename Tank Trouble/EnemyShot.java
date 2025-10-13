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
        // Add your action code here.
    }
    public EnemyShot()
    {
        GreenfootImage image = getImage();
        image.scale(75, 75);
        setImage(image);
    }
}
