import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Testing extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Testing()
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
        BigEnemyTankBody enemyBody1 = new BigEnemyTankBody(body, 1);
        addObject(enemyBody1, 600, 100);
        BigEnemyTankTurret enemyTurret1 = new BigEnemyTankTurret(enemyBody1, body);
        addObject(enemyTurret1, enemyBody1.getX(), enemyBody1.getY());
        
        EnemyTankBody enemyBody2 = new EnemyTankBody(body, 1);
        addObject(enemyBody2, 600, 400);
        EnemyTankTurret enemyTurret2 = new EnemyTankTurret(enemyBody2, body);
        addObject(enemyTurret2, enemyBody2.getX(), enemyBody2.getY());
    }
}
