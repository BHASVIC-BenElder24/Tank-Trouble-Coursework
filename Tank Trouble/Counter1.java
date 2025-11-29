import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter1 extends Actor
{
    private EnemyTankBody enemyBody1;
    private EnemyTankBody enemyBody2;
    private EnemyTankBody enemyBody3;
    boolean enemy1Alive = true;
    boolean enemy2Alive = true;
    boolean enemy3Alive = true;
    
    public void act()
    {
        checkVictory();
        checkEnemies();
    }
    public void checkVictory()
    {
        if(enemy1Alive == false && enemy2Alive == false && enemy3Alive == false)
        {
            Greenfoot.setWorld(new Level2());
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
    }
    public Counter1(EnemyTankBody enemyBody1, EnemyTankBody enemyBody2,EnemyTankBody enemyBody3)
    {
        this.enemyBody1 = enemyBody1;
        this.enemyBody2 = enemyBody2;
        this.enemyBody3 = enemyBody3;
        enemyBody1.level = 1;
        enemyBody2.level = 1;
        enemyBody3.level = 1;
    }
}
