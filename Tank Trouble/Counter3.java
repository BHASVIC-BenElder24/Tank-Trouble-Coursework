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
    boolean enemy1Alive = true;
    boolean enemy2Alive = true;
    boolean enemy3Alive = true;
    
    public void act()
    {
        checkVictory();
        checkEnemy1();
        checkEnemy2();
        checkEnemy3();
    }
    public void checkVictory()
    {
        if(enemy1Alive == false && enemy2Alive == false && enemy3Alive == false)
        {
            Greenfoot.setWorld(new Level3());
        }
        //else if()
        //{
        //    Greenfoot.setWorld(new Level3());
        //}
    }
    public void checkEnemy1()
    {
        if (getWorld() != null && getWorld().getObjects(enemyBody1.getClass()).contains(enemyBody1))
        {
            enemy1Alive = true;
        }
        else
        {
            enemy1Alive = false;
        }
    }
    public void checkEnemy2()
    {
        if (getWorld() != null && getWorld().getObjects(enemyBody2.getClass()).contains(enemyBody2))
        {
            enemy2Alive = true;
        }
        else
        {
            enemy2Alive = false;
        }
    }
    public void checkEnemy3()
    {
        if (getWorld() != null && getWorld().getObjects(enemyBody3.getClass()).contains(enemyBody3))
        {
            enemy3Alive = true;
        }
        else
        {
            enemy3Alive = false;
        }
    }
    public Counter3(EnemyTankBody enemyBody1, EnemyTankBody enemyBody2,EnemyTankBody enemyBody3)
    {
        this.enemyBody1 = enemyBody1;
        this.enemyBody2 = enemyBody2;
        this.enemyBody3 = enemyBody3;
    }
}
