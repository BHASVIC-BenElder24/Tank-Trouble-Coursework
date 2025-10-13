import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerShot extends Actor
{
    private PlayerTankTurret turret;
    PlayerShot shot1 = new PlayerShot();
    PlayerShot shot2 = new PlayerShot();
    PlayerShot shot3 = new PlayerShot();
    PlayerShot shot4 = new PlayerShot();
    PlayerShot shot5 = new PlayerShot();
    int shotCounter = 0;
    /**
     * Act - do whatever the PlayerShot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            if (shotCounter == 0)
            {
                
            }
        }
        move(10);
    }
    public PlayerShot(PlayerTankTurret turret)
    {
        this.turret = turret;
        GreenfootImage image = getImage();
        image.scale(75, 75);
        setImage(image);
    }
}
