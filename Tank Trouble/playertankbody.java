import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playertankbody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTankBody extends Actor
{
    /**
     * Act - do whatever the playertankbody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int moveSpeed = 3;
    boolean dead = false;
    public void act()
    {
        int directionx = 0;
        int directiony = 0;
        checkForWall();
        
        EnemyShot eShot = (EnemyShot) getOneIntersectingObject(EnemyShot.class);
        if (eShot != null)
        {
            getWorld().removeObject(eShot);
            getWorld().removeObject(this);
            boolean dead = true;
            reset(new Level1());
        }
        
        if (Greenfoot.isKeyDown("w"))
        {
            directiony++;
        }
        if (Greenfoot.isKeyDown("a"))
        {
            directionx--;
        }
        if (Greenfoot.isKeyDown("s"))
        {
            directiony--;
        }
        if (Greenfoot.isKeyDown("d"))
        {
            directionx++;
        }
        
        if (directiony == 1 && (!(directionx == 1 || directionx == -1)))
        {
            setRotation(270);
            move(moveSpeed);
        }
        if (directiony == 1 && directionx == 1)
        {
            setRotation(315);
            move(moveSpeed);
        }
        if (directionx == 1 && (!(directiony == 1 || directiony == -1)))
        {
            setRotation(0);
            move(moveSpeed);
        }
        if (directionx == 1 && directiony == -1)
        {
            setRotation(45);
            move(moveSpeed);
        }
        if (directiony == -1 && (!(directionx == 1 || directionx == -1)))
        {
            setRotation(90);
            move(moveSpeed);
        }
        if (directiony == -1 && directionx == -1)
        {
            setRotation(135);
            move(moveSpeed);
        }
        if (directionx == -1 && (!(directiony == 1 || directiony == -1)))
        {
            setRotation(180);
            move(moveSpeed);
        }
        if (directionx == -1 && directiony == 1)
        {
            setRotation(225);
            move(moveSpeed);
        }
    }
    public PlayerTankBody()
    {
        GreenfootImage image = getImage();
        image.scale(46, 41);
        setImage(image);
    }
    public void checkForWall()
    {
        WallE wallE = (WallE) getOneIntersectingObject(WallE.class);
        if (wallE != null)
        {
             if(Greenfoot.isKeyDown("a"))
             {
                 setLocation(getX()+moveSpeed,getY());
             }
        }
        WallN wallN = (WallN) getOneIntersectingObject(WallN.class);
        if (wallN != null)
        {
             if(Greenfoot.isKeyDown("s"))
             {
                 setLocation(getX(),getY()-moveSpeed);
             }
        }
        WallW wallW = (WallW) getOneIntersectingObject(WallW.class);
        if (wallW != null)
        {
             if(Greenfoot.isKeyDown("d"))
             {
                 setLocation(getX()-moveSpeed,getY());
             }
        }
        WallS wallS = (WallS) getOneIntersectingObject(WallS.class);
        if (wallS != null)
        {
             if(Greenfoot.isKeyDown("w"))
             {
                 setLocation(getX(),getY()+moveSpeed);
             }
        }
    }
    
    public void reset(World world)
    {
        Greenfoot.setWorld(world);
    }
}