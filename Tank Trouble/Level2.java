import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayerTankBody body = new PlayerTankBody();
        addObject(body, 100, 300);
        PlayerTankTurret turret = new PlayerTankTurret(body);
        addObject(turret, body.getX(), body.getY());
        ////////////////////////////////////////////////////////enemies
        EnemyTankBody enemyBody1 = new EnemyTankBody(body, 1);
        addObject(enemyBody1, 600, 100);
        EnemyTankTurret enemyTurret1 = new EnemyTankTurret(enemyBody1, body);
        addObject(enemyTurret1, enemyBody1.getX(), enemyBody1.getY());
        
        EnemyTankBody enemyBody2 = new EnemyTankBody(body, 2);
        addObject(enemyBody2, 600, 300);
        EnemyTankTurret enemyTurret2 = new EnemyTankTurret(enemyBody2, body);
        addObject(enemyTurret2, enemyBody2.getX(), enemyBody2.getY());
        
        EnemyTankBody enemyBody3 = new EnemyTankBody(body, 3);
        addObject(enemyBody3, 600, 500);
        EnemyTankTurret enemyTurret3 = new EnemyTankTurret(enemyBody3, body);
        addObject(enemyTurret3, enemyBody3.getX(), enemyBody3.getY());
        ////////////////////////////////////////////////////////counter
        Counter2 counter2 = new Counter2(enemyBody1, enemyBody2, enemyBody3);
        addObject(counter2, 0,0);
        ////////////////////////////////////////////////////////walls
        addObject(new WallN(), 300, 150);
        
        addObject(new WallS(), 300, 435);
        
        for (int x = 0; x < 3; x++)
        {
            addObject(new WallE(), 342, 193 + 100 * x);
        }
        
        for (int x = 0; x < 3; x++)
        {
            addObject(new WallW(), 257, 193 + 100 * x);
        }
        ////////////////////////////////////////////////////////nodes
    }
}
