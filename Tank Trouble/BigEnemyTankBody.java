import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigEnemyTankBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigEnemyTankBody extends Actor
{
    private PlayerTankBody body;
    private int IDnum;
    boolean dead = false;
    int level;
    
    ////////////////////////////////////////////////////////movement points
    ////////////////////////////eg: reached1 means the tank has reached point 1
    
    boolean reached1 = false;
    boolean reached2 = false;
    boolean reached3 = false;
    boolean reached4 = false;
    boolean reached5 = false;
    boolean reached6 = false;
    boolean reached7 = false;
    boolean reached8 = false;
    boolean reached9 = false;
    boolean reached10 = false;
    boolean reached11 = false;
    boolean reached12 = false;

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
        
        /////////////////////////////////////////////level 2 movement
        
        if(level == 2 && dead == false)
        {
            if(reached1 == false)
            {
                turnTowards(400, 300);
                move(2);
            }
            
            if(getX() == 500 && getY() == 300)
            {
                reached1 = true;
            }
        }
    }
    public BigEnemyTankBody(PlayerTankBody body, int IDnum)
    {
        this.body = body;
        this.IDnum = IDnum;
        GreenfootImage image = getImage();
        image.scale(46, 41);
        setImage(image);
    }
}
