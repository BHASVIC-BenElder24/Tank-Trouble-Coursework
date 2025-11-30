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
                        reached1 = false;
                        turnTowards(65, 50);
                        move(2);
                        if(getX() == 64 && getY() == 50 || getX() == 65 && getY() == 50)
                        {
                            reached2 = true;
                        }
                    }
                    else if(reached3 == false && reached2 == true)
                    {
                        reached1 = false;
                        turnTowards(65, 270);
                        move(2);
                        if(getX() == 65 && getY() == 270)
                        {
                            reached3 = true;
                        }
                    }
                }
                if(body.getX() > 175)
                {
                    if(reached1 == false && reached2 == false)
                    {
                        turnTowards(300, 50);
                        move(2);
                        if(getX() == 301 && getY() == 50 || getX() == 300 && getY() == 50)
                        {
                            reached1 = true;
                        }
                    }
                    else if(reached3 == false && reached2 == true)
                    {
                        turnTowards(65, 50);
                        move(2);
                        if(getX() == 65 && getY() == 50)
                        {
                            reached2 = false;
                        }
                    }
                    else if(reached3 == true && reached2 == true)
                    {
                        reached3 = false;
                        turnTowards(65, 50);
                        move(2);
                        if(getX() == 65 && getY() == 50)
                        {
                            reached2 = false;
                        }
                    }
                }
            }
            
            if (num == 2 && dead == false)
            {
                if(body.getX() > 625)
                {
                    if(reached2 == false && reached3 == false)
                    {
                        reached1 = false;
                        turnTowards(735, 50);
                        move(2);
                        if(getX() == 736 && getY() == 50 || getX() == 735 && getY() == 50)
                        {
                            reached2 = true;
                        }
                    }
                    else if(reached3 == false && reached2 == true)
                    {
                        reached1 = false;
                        turnTowards(735, 270);
                        move(2);
                        if(getX() == 735 && getY() == 270)
                        {
                            reached3 = true;
                        }
                    }
                }
                if(body.getX() < 625)
                {
                    if(reached1 == false && reached2 == false)
                    {
                        turnTowards(500, 50);
                        move(2);
                        if(getX() == 499 && getY() == 50 || getX() == 500 && getY() == 50)
                        {
                            reached1 = true;
                        }
                    }
                    else if(reached3 == false && reached2 == true)
                    {
                        turnTowards(735, 50);
                        move(2);
                        if(getX() == 735 && getY() == 50)
                        {
                            reached2 = false;
                        }
                    }
                    else if(reached3 == true && reached2 == true)
                    {
                        reached3 = false;
                        turnTowards(735, 50);
                        move(2);
                        if(getX() == 735 && getY() == 50)
                        {
                            reached2 = false;
                        }
                    }
                }
            }
            
            if (num == 3 && dead == false)
            {
                if(body.getX() < 175)
                {
                    if(reached2 == false && reached3 == false)
                    {
                        reached1 = false;
                        turnTowards(65, 550);
                        move(2);
                        if(getX() == 64 && getY() == 550 || getX() == 65 && getY() == 550)
                        {
                            reached2 = true;
                        }
                    }
                    else if(reached3 == false && reached2 == true)
                    {
                        reached1 = false;
                        turnTowards(65, 330);
                        move(2);
                        if(getX() == 65 && getY() == 330)
                        {
                            reached3 = true;
                        }
                    }
                }
                if(body.getX() > 175)
                {
                    if(reached1 == false && reached2 == false)
                    {
                        turnTowards(300, 550);
                        move(2);
                        if(getX() == 301 && getY() == 550 || getX() == 300 && getY() == 550)
                        {
                            reached1 = true;
                        }
                    }
                    else if(reached3 == false && reached2 == true)
                    {
                        turnTowards(65, 550);
                        move(2);
                        if(getX() == 65 && getY() == 550)
                        {
                            reached2 = false;
                        }
                    }
                    else if(reached3 == true && reached2 == true)
                    {
                        reached3 = false;
                        turnTowards(65, 550);
                        move(2);
                        if(getX() == 65 && getY() == 550)
                        {
                            reached2 = false;
                        }
                    }
                }
            }
            
            if (num == 4 && dead == false)
            {
                if(body.getX() > 625)
                {
                    if(reached2 == false && reached3 == false)
                    {
                        reached1 = false;
                        turnTowards(735, 550);
                        move(2);
                        if(getX() == 736 && getY() == 550 || getX() == 735 && getY() == 550)
                        {
                            reached2 = true;
                        }
                    }
                    else if(reached3 == false && reached2 == true)
                    {
                        reached1 = false;
                        turnTowards(735, 330);
                        move(2);
                        if(getX() == 735 && getY() == 330)
                        {
                            reached3 = true;
                        }
                    }
                }
                if(body.getX() < 625)
                {
                    if(reached1 == false && reached2 == false)
                    {
                        turnTowards(500, 550);
                        move(2);
                        if(getX() == 499 && getY() == 550 || getX() == 500 && getY() == 550)
                        {
                            reached1 = true;
                        }
                    }
                    else if(reached3 == false && reached2 == true)
                    {
                        turnTowards(735, 550);
                        move(2);
                        if(getX() == 735 && getY() == 550)
                        {
                            reached2 = false;
                        }
                    }
                    else if(reached3 == true && reached2 == true)
                    {
                        reached3 = false;
                        turnTowards(735, 550);
                        move(2);
                        if(getX() == 735 && getY() == 550)
                        {
                            reached2 = false;
                        }
                    }
                }
            }
        }
        
        /////////////////////////////////////////////level 3 movement
        
        else if(level == 3)
        {
            if (num == 1 && dead == false)
            {
                if(reached1 == false)
                {
                    turnTowards(50, 550);
                    move(2);
                }
                if(getX() == 50 && getY() == 550)
                {
                    reached1 = true;
                }
            }
            
            if (num == 2 && dead == false)
            {
                if(reached1 == false)
                {
                    turnTowards(450, 50);
                    move(2);
                }
                if(getX() == 449 && getY() == 50)
                {
                    reached1 = true;
                }
            }
            
            if (num == 3 && dead == false)
            {
                if(reached1 == false)
                {
                    turnTowards(725, 50);
                    move(2);
                }
                if(getX() == 725 && getY() == 49)
                {
                    reached1 = true;
                }
            }
            
            if (num == 4 && dead == false)
            {
                if(reached1 == false)
                {
                    turnTowards(350, 550);
                    move(2);
                }
                if(getX() == 349 && getY() == 550)
                {
                    reached1 = true;
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
