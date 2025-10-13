import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyTankBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyTankBody extends Actor
{
    /**
     * Act - do whatever the EnemyTankBody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public EnemyTankBody()
    {
        GreenfootImage image = getImage();
        image.scale(45, 45);
        setImage(image);
    }
}
