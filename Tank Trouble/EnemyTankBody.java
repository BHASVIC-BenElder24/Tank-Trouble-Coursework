import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyTankBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyTankBody extends Actor
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
        
        /////////////////////////////////////////////level 1 movement
        
        if(level == 1)
        {
            if (num == 1 && dead == false)
            {
                if(getX() > 100 && body.getX() < 300)
                {
                    turnTowards(100, 100);
                    move(2);
                }
                else if(getX() < 600)
                {
                    turnTowards(600, 100);
                    move(2);
                }
            }
            
            if (num == 2 && dead == false)
            {
                if(reached1 == false && body.getX() < 300)
                {
                    turnTowards(500, 500);
                    move(2);
                    if(getX() == 500 && getY() == 500)
                    {
                        reached1 = true;
                    }
                }
                else if(reached2 == false && body.getX() < 300)
                {
                    turnTowards(100, 500);
                    move(2);
                    if(getX() == 100 && getY() == 500)
                    {
                        reached2 = true;
                    }
                }
                else if(reached2 == false  && body.getX() > 300)
                {
                    turnTowards(600, 500);
                    move(2);
                }
                else if(reached2 == true  && body.getX() > 300)
                {
                    turnTowards(600, 500);
                    move(2);
                    reached2 = false;
                }
            }
            
            if (num == 3 && dead == false)
            {
                if(reached3 == false && body.getX() < 300)
                {
                    turnTowards(100, 500);
                    move(2);
                    if(getX() == 100 && getY() == 500)
                    {
                        reached3 = true;
                    }
                }
                else if(reached4 == false && body.getX() < 300)
                {
                    turnTowards(100, 300);
                    move(2);
                    if(getX() == 100 && getY() == 300)
                    {
                        reached4 = true;
                    }
                }
                else if(reached3 == false && body.getX() > 300)
                {
                    turnTowards(500, 500);
                    move(2);
                }
                else if(reached3 == true && body.getX() > 300)
                {
                    turnTowards(100, 500);
                    move(2);
                    if(getX() == 100 && getY() == 500)
                    {
                        reached3 = false;
                    }
                }
                else if(reached4 == true && body.getX() > 300)
                {
                    reached4 = false;
                    turnTowards(100, 500);
                    move(2);
                    if(getX() == 100 && getY() == 500)
                    {
                        reached3 = false;
                    }
                }
            }
        }
        
        /////////////////////////////////////////////level 2 movement
        
        else if(level == 2)
        {
            if (num == 1 && dead == false)
            {
                if(body.getX() < 175)
                {
                    if(reached2 == false && reached3 == false)
                    {
                        turnTowards(65, 50);
                        move(2);
                        if(getX() == 65 && getY() == 50)
                        {
                            reached2 = true;
                        }
                    }
                    else if(reached3 == false && reached2 == true)
                    {
                        turnTowards(65, 270);
                        move(2);
                        if(getX() == 65 && getY() == 270)
                        {
                            reached3 = true;
                        }
                    }
                }
            }
        }
    }
    public EnemyTankBody(PlayerTankBody body, int IDnum)
    {
        this.body = body;
        this.IDnum = IDnum;
        GreenfootImage image = getImage();
        image.scale(46, 41);
        setImage(image);
    }
}
