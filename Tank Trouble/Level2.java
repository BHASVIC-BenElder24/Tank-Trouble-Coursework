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
        addObject(body, 400, 300);
        PlayerTankTurret turret = new PlayerTankTurret(body);
        addObject(turret, body.getX(), body.getY());
        ////////////////////////////////////////////////////////enemies
        EnemyTankBody enemyBody1 = new EnemyTankBody(body, 1);
        addObject(enemyBody1, 300, 50);
        EnemyTankTurret enemyTurret1 = new EnemyTankTurret(enemyBody1, body);
        addObject(enemyTurret1, enemyBody1.getX(), enemyBody1.getY());
        
        EnemyTankBody enemyBody2 = new EnemyTankBody(body, 2);
        addObject(enemyBody2, 500, 50);
        EnemyTankTurret enemyTurret2 = new EnemyTankTurret(enemyBody2, body);
        addObject(enemyTurret2, enemyBody2.getX(), enemyBody2.getY());
        
        EnemyTankBody enemyBody3 = new EnemyTankBody(body, 3);
        addObject(enemyBody3, 300, 550);
        EnemyTankTurret enemyTurret3 = new EnemyTankTurret(enemyBody3, body);
        addObject(enemyTurret3, enemyBody3.getX(), enemyBody3.getY());
        
        EnemyTankBody enemyBody4 = new EnemyTankBody(body, 4);
        addObject(enemyBody4, 500, 550);
        EnemyTankTurret enemyTurret4 = new EnemyTankTurret(enemyBody4, body);
        addObject(enemyTurret4, enemyBody4.getX(), enemyBody4.getY());
        ////////////////////////////////////////////////////////counter
        Counter2 counter2 = new Counter2(enemyBody1, enemyBody2, enemyBody3, enemyBody4);
        addObject(counter2, 0,0);
        ////////////////////////////////////////////////////////walls
        
        addObject(new WallN(100,15), 175, 100);
        
        addObject(new WallS(100,15), 175, 225);
        
        addObject(new WallE(15,140), 217, 163);
        
        addObject(new WallW(15,140), 132, 163);
        
        ////////////////////////////////////////////////////////////////////
        
        addObject(new WallN(100,15), 175, 375);
        
        addObject(new WallS(100,15), 175, 500);
        
        addObject(new WallE(15,140), 668, 163);
        
        addObject(new WallW(15,140), 582, 163);
        
        ////////////////////////////////////////////////////////////////////
        
        addObject(new WallN(100,15), 625, 100);
        
        addObject(new WallS(100,15), 625, 225);
        
        addObject(new WallE(15,140), 217, 438);
        
        addObject(new WallW(15,140), 132, 438);
        
        addObject(new WallE(15,140), 668, 163);
        
        addObject(new WallW(15,140), 582, 163);
        
        ////////////////////////////////////////////////////////////////////
        
        addObject(new WallN(100,15), 625, 375);
        
        addObject(new WallS(100,15), 625, 500);
        
        addObject(new WallE(15,140), 668, 438);
        
        addObject(new WallW(15,140), 582, 438);
        
        ////////////////////////////////////////////////////////nodes
    }
}
