import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyTankBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyTankBody extends Actor
{
    private EnemyTankBody enemyBody;
    private PlayerTankBody body;
    /**
     * Act - do whatever the EnemyTankBody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        PlayerShot shot = (PlayerShot) getOneIntersectingObject(PlayerShot.class);
        if (shot != null)
        {
            getWorld().removeObject(shot);
            getWorld().removeObject(this);
        }
        if (body != null)
        {
            turnTowards(body.getX()+90, body.getY()-90);
            move(1);
        }
    }
    public EnemyTankBody(PlayerTankBody body)
    {
        this.body = body;
        GreenfootImage image = getImage();
        image.scale(36, 31);
        setImage(image);
    }
}
