import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter3 extends Actor
{
    private EnemyTankBody enemyBody1;
    private EnemyTankBody enemyBody2;
    private EnemyTankBody enemyBody3;
    private EnemyTankBody enemyBody4;
    boolean enemy1Alive = true;
    boolean enemy2Alive = true;
    boolean enemy3Alive = true;
    boolean enemy4Alive = true;
    
    public void act()
    {
        checkVictory();
        checkEnemies();
    }
    public void checkVictory()
    {
        if(enemy1Alive == false && enemy2Alive == false && enemy3Alive == false)
        {
            Greenfoot.setWorld(new Level3());
        }
    }
    public void checkEnemies()
    {
        if (getWorld() != null && getWorld().getObjects(enemyBody1.getClass()).contains(enemyBody1))
        {
            enemy1Alive = true;
        }
        else
        {
            enemy1Alive = false;
        }
        
        if (getWorld() != null && getWorld().getObjects(enemyBody2.getClass()).contains(enemyBody2))
        {
            enemy2Alive = true;
        }
        else
        {
            enemy2Alive = false;
        }
        
        if (getWorld() != null && getWorld().getObjects(enemyBody3.getClass()).contains(enemyBody3))
        {
            enemy3Alive = true;
        }
        else
        {
            enemy3Alive = false;
        }
        
        if (getWorld() != null && getWorld().getObjects(enemyBody4.getClass()).contains(enemyBody4))
        {
            enemy4Alive = true;
        }
        else
        {
            enemy4Alive = false;
        }
    }
    public Counter3(EnemyTankBody enemyBody1, EnemyTankBody enemyBody2,EnemyTankBody enemyBody3, EnemyTankBody enemyBody4)
    {
        this.enemyBody1 = enemyBody1;
        this.enemyBody2 = enemyBody2;
        this.enemyBody3 = enemyBody3;
        this.enemyBody4 = enemyBody4;
        enemyBody1.level = 3;
        enemyBody2.level = 3;
        enemyBody3.level = 3;
        enemyBody4.level = 3;
    }
}
