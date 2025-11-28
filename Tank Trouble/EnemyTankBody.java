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
    private int IDnum;
    boolean dead = false;
    
    ////////////////////////////////////////////////////////checks
    
    boolean reached1 = false;
    
    public void act()
    {
        int num = IDnum;
        PlayerShot shot = (PlayerShot) getOneIntersectingObject(PlayerShot.class);
        if (shot != null)
        {
            getWorld().removeObject(shot);
            getWorld().removeObject(this);
            dead = true;
        }
        
        /////////////////////////////////////////////level 1 movement
        
        if (num == 1 && dead == false)
        {
            if(getX() > 100)
            {
                turnTowards(100, 100);
                move(2);
            }
        }
        
        if (num == 2 && dead == false)
        {
            if(reached1 == false)
            {
                turnTowards(500, 500);
                move(2);
                if(getX() == 500 && getY() == 500)
                {
                    reached1 = true;
                }
            }
            else
            {
                turnTowards(100, 500);
                move(2);
            }
        }
    }
    public EnemyTankBody(PlayerTankBody body, int IDnum)
    {
        this.body = body;
        this.IDnum = IDnum;
        GreenfootImage image = getImage();
        image.scale(36, 31);
        setImage(image);
    }
}
