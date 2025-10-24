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
    SimpleTimer shotTimer = new SimpleTimer();
    boolean dead = false;
    /**
     * Act - do whatever the EnemyTankTurret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        PlayerShot shot = (PlayerShot) getOneIntersectingObject(PlayerShot.class);
        if (shot != null)
        {
            getWorld().removeObject(shot);
            getWorld().removeObject(enemyBody);
            getWorld().removeObject(this);
            dead = true;
        }
        if (enemyBody != null && dead == false)
        {
            setLocation(enemyBody.getX(), enemyBody.getY());
        }
        if (body != null && dead == false)
        {
            turnTowards(body.getX(), body.getY());
        }
        if (shotTimer.millisElapsed() > 1000)
            {
                getWorld().addObject(new EnemyShot(body), getX()-5, getY());
                shotTimer.mark();
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
