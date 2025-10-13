import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyTankTurret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyTankTurret extends Actor
{
    private EnemyTankBody enemyBody;
    private PlayerTankBody body;
    /**
     * Act - do whatever the EnemyTankTurret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (enemyBody != null)
        {
            setLocation(enemyBody.getX(), enemyBody.getY());
        }
        if (body != null)
        {
            turnTowards(body.getX(), body.getY());
        }
    }
    public EnemyTankTurret(EnemyTankBody enemyBody, PlayerTankBody body)
    {
        this.enemyBody = enemyBody;
        this.body = body;
        GreenfootImage image = getImage();
        image.scale(45, 45);
        setImage(image);
    }
}
