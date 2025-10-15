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
    public void act()
    {
        int shotCounter = 0;
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
        if(Greenfoot.isKeyDown("space"))
        {
            if (shotCounter == 0)
            {
                getWorld().addObject(new PlayerShot(), getX()-5, getY());
            }
        }
    }
    public PlayerTankTurret(PlayerTankBody body)
    {
        this.body = body;
        GreenfootImage image = getImage();
        image.scale(45, 45);
        setImage(image);
    }
}
