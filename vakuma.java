import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vakuma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vakuma extends World
{
public int temp = 0;
    /**
     * Constructor for objects of class vakuma.
     * 
     */
    public vakuma()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        act();
    }
    public void act(){ 
    if (Greenfoot.isKeyDown("enter") && (temp < 0)){
            creditos world = new creditos();
            Greenfoot.setWorld(world);
        }
}
}
