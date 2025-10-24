import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyShot extends Actor
{
    private PlayerTankBody body;
    boolean hasFacedPlayer = false;
    SimpleTimer destroyTimer = new SimpleTimer();
    public void act()
    {
        move(4);
        if(getX() <= 5 || getX() >= getWorld().getWidth() -5)
        {
            int angle = getRotation();
            setRotation(180 - angle);
        }
        if(getY() <= 5 || getY() >= getWorld().getHeight() -5)
        {
            int angle = getRotation();
            setRotation(-angle);
        }
        if(destroyTimer.millisElapsed() > 2500)
        {
            getWorld().removeObject(this);
        }
        if(hasFacedPlayer == false)
        {
            facePlayer();
            hasFacedPlayer = true;
        }
    }
    public EnemyShot(PlayerTankBody body)
    {
        this.body = body;
        GreenfootImage image = getImage();
        image.scale(75, 75);
        setImage(image);
    }
    public void facePlayer()
    {
        int playerX = body.getX();
        int playerY = body.getY();
        turnTowards(playerX, playerY);
    }
}
