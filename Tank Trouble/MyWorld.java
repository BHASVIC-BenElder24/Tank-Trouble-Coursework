import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
        addObject(body, 100, 100);
        PlayerTankTurret turret = new PlayerTankTurret(body);
        addObject(turret, body.getX(), body.getY());
        ////////////////////////////////////////////////////////enemies
        EnemyTankBody enemyBody1 = new EnemyTankBody(body);
        addObject(enemyBody1, 300, 200);
        EnemyTankTurret enemyTurret1 = new EnemyTankTurret(enemyBody1, body);
        addObject(enemyTurret1, enemyBody1.getX(), enemyBody1.getY());
        
        EnemyTankBody enemyBody2 = new EnemyTankBody(body);
        addObject(enemyBody2, 400, 200);
        EnemyTankTurret enemyTurret2 = new EnemyTankTurret(enemyBody2, body);
        addObject(enemyTurret2, enemyBody2.getX(), enemyBody2.getY());
        
        EnemyTankBody enemyBody3 = new EnemyTankBody(body);
        addObject(enemyBody3, 500, 200);
        EnemyTankTurret enemyTurret3 = new EnemyTankTurret(enemyBody3, body);
        addObject(enemyTurret3, enemyBody3.getX(), enemyBody3.getY());
    }
}
