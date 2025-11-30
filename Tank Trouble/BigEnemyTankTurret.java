import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigEnemyTankTurret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigEnemyTankTurret extends Actor
{
    private BigEnemyTankBody enemyBody;
    private PlayerTankBody body;
    SimpleTimer shotTimer = new SimpleTimer();
    boolean dead = false;
    /**
     * Act - do whatever the BigEnemyTankTurret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (enemyBody != null)
        {
            if (getWorld().getObjects(enemyBody.getClass()).contains(enemyBody))
            {
                setLocation(enemyBody.getX(), enemyBody.getY());
            }
            else
            {
                getWorld().removeObject(this);
                dead = true;
            }
        }
        if (getWorld() != null && (getWorld().getObjects(body.getClass()).contains(body)) && body != null)
        {
            turnTowards(body.getX(), body.getY());
        }
        if (shotTimer.millisElapsed() > 1500 && enemyBody != null)
            {
                getWorld().addObject(new BigEnemyShot(body), getX()-5, getY());
                shotTimer.mark();
            }
    }
    public BigEnemyTankTurret(BigEnemyTankBody enemyBody, PlayerTankBody body)
    {
        this.enemyBody = enemyBody;
        this.body = body;
        GreenfootImage image = getImage();
        image.scale(80, 40);
        setImage(image);
    }
}
