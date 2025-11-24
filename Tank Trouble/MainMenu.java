import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class Background.
     * 
     */
    public MainMenu()
    {    
        super(800, 600, 1);
        
        PlayButton play = new PlayButton();
        addObject(play, 400, 350);
    }
}
