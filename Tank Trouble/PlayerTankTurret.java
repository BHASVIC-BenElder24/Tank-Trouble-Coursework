import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.MouseInfo;

/**
 * Write a description of class playertankturret here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerTankTurret extends Actor
{
    /**
     * Act - do whatever the playertankturret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private PlayerTankBody body;
    private PlayerTankTurret turret;
    SimpleTimer shotTimer = new SimpleTimer();
    SimpleTimer destroyTimer1 = new SimpleTimer();
    SimpleTimer destroyTimer2 = new SimpleTimer();
    SimpleTimer destroyTimer3 = new SimpleTimer();
    SimpleTimer destroyTimer4 = new SimpleTimer();
    SimpleTimer destroyTimer5 = new SimpleTimer();
    int shotCounter = 0;
    public void act()
    {
        // Cite https://www.mrstewartslessons.com/move_actor_with_mouse.html for tutorial
        MouseInfo pointer = Greenfoot.getMouseInfo();
        if (pointer != null)
        {
            int mouseX = pointer.getX();
            int mouseY = pointer.getY();
            turnTowards(mouseX, mouseY);
        }
        if (body != null)
        {
            setLocation(body.getX(), body.getY());
        }
        if(Greenfoot.mouseClicked(null))
        {
            if (shotCounter <= 5 && shotTimer.millisElapsed() > 250)
            {
                getWorld().addObject(new PlayerShot(), getX()-5, getY());
                shotCounter++;
                shotTimer.mark();
            }
        }
        if(Greenfoot.mouseClicked(null))
        {
            //start timers
            if (shotCounter == 0)
            {
                destroyTimer1.mark();
            }
            if (shotCounter == 1)
            {
                destroyTimer2.mark();
            }
            if (shotCounter == 2)
            {
                destroyTimer3.mark();
            }
            if (shotCounter == 3)
            {
                destroyTimer4.mark();
            }
            if (shotCounter == 4)
            {
                destroyTimer5.mark();
            }
        }
        //reset shot counter
        if(destroyTimer1.millisElapsed() > 4000 && shotCounter >= 1)
        {
            shotCounter--;
        }
        if(destroyTimer2.millisElapsed() > 4000 && shotCounter >= 2)
        {
            shotCounter--;
        }
        if(destroyTimer3.millisElapsed() > 4000 && shotCounter >= 3)
        {
            shotCounter--;
        }
        if(destroyTimer4.millisElapsed() > 4000 && shotCounter >= 4)
        {
            shotCounter--;
        }
        if(destroyTimer5.millisElapsed() > 4000 && shotCounter >= 5)
        {
            shotCounter--;
        }
        //reset timers
        //if(destroyTimer1.millisElapsed() > 3500 && (!(shotCounter >= 1)))
        //{
        //    destroyTimer1.mark();
        //}
        //if(destroyTimer2.millisElapsed() > 3500 && (!(shotCounter >= 2)))
        //{
        //    destroyTimer2.mark();
        //}
        //if(destroyTimer3.millisElapsed() > 3500 && (!(shotCounter >= 3)))
        //{
        //    destroyTimer3.mark();
        //}
        //if(destroyTimer4.millisElapsed() > 3500 && (!(shotCounter >= 4)))
        //{
        //    destroyTimer4.mark();
        //}
        //if(destroyTimer5.millisElapsed() > 3500 && (!(shotCounter >= 5)))
        //{
        //    destroyTimer5.mark();
        //}
    }
    public PlayerTankTurret(PlayerTankBody body)
    {
        this.body = body;
        GreenfootImage image = getImage();
        image.scale(45, 45);
        setImage(image);
    }
}
