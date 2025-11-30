import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level3()
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
        addObject(enemyBody1, 50, 120);
        EnemyTankTurret enemyTurret1 = new EnemyTankTurret(enemyBody1, body);
        addObject(enemyTurret1, enemyBody1.getX(), enemyBody1.getY());
        
        EnemyTankBody enemyBody2 = new EnemyTankBody(body, 2);
        addObject(enemyBody2, 175, 50);
        EnemyTankTurret enemyTurret2 = new EnemyTankTurret(enemyBody2, body);
        addObject(enemyTurret2, enemyBody2.getX(), enemyBody2.getY());
        
        EnemyTankBody enemyBody3 = new EnemyTankBody(body, 3);
        addObject(enemyBody3, 740, 475);
        EnemyTankTurret enemyTurret3 = new EnemyTankTurret(enemyBody3, body);
        addObject(enemyTurret3, enemyBody3.getX(), enemyBody3.getY());
        
        EnemyTankBody enemyBody4 = new EnemyTankBody(body, 4);
        addObject(enemyBody4, 615, 550);
        EnemyTankTurret enemyTurret4 = new EnemyTankTurret(enemyBody4, body);
        addObject(enemyTurret4, enemyBody4.getX(), enemyBody4.getY());
        
        BigEnemyTankBody enemyBody5 = new BigEnemyTankBody(body, 1);
        addObject(enemyBody5, 575, 50);
        BigEnemyTankTurret enemyTurret5 = new BigEnemyTankTurret(enemyBody5, body);
        addObject(enemyTurret5, enemyBody5.getX(), enemyBody5.getY());
        
        BigEnemyTankBody enemyBody6 = new BigEnemyTankBody(body, 2);
        addObject(enemyBody6, 225, 550);
        BigEnemyTankTurret enemyTurret6 = new BigEnemyTankTurret(enemyBody6, body);
        addObject(enemyTurret6, enemyBody6.getX(), enemyBody6.getY());
        
        ////////////////////////////////////////////////////////counter
        Counter3 counter3 = new Counter3(enemyBody1, enemyBody2, enemyBody3, enemyBody4, enemyBody5, enemyBody6);
        addObject(counter3, 0,0);
        ////////////////////////////////////////////////////////walls
        
        addObject(new WallN(383,15), 316, 100);
        
        addObject(new WallS(383,15), 316, 150);
        
        addObject(new WallE(15,65), 500, 125);
        
        ////////////////////////////////////////////////////////////////////
        
        addObject(new WallN(383,15), 484, 450);
        
        addObject(new WallS(383,15), 484, 500);
        
        addObject(new WallW(15,65), 300, 475);
        
        ////////////////////////////////////////////////////////////////////
        
        addObject(new WallS(45,15), 147, 500);
        
        addObject(new WallE(15,365), 162, 325);
        
        addObject(new WallW(15,415), 132, 300);
        
        ////////////////////////////////////////////////////////////////////
        
        addObject(new WallN(45,15), 653, 100);
        
        addObject(new WallE(15,415), 668, 300);
        
        addObject(new WallW(15,365), 638, 275);
        
        ///////////////////////////////////////////////////////////////////
        
        addObject(new Wall(383,65), 484, 475);
        
        addObject(new Wall(45,350), 653, 268);
        
        addObject(new Wall(383,65), 316, 125);
        
        addObject(new Wall(45,350), 147, 333);
        
        ////////////////////////////////////////////////////////nodes
    }
}
