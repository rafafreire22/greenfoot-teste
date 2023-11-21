import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vryu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vryu extends World
{

    /**
     * Constructor for objects of class vryu.
     * 
     */
    public vryu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        act();
    }
     public void act(){ 
    if (Greenfoot.isKeyDown("enter")){
            creditos world = new creditos();
            Greenfoot.setWorld(world);
        }
}
}
