import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gif extends Actor
{
    GifImage myGif = new GifImage("ryu.gif");
    GreenfootSound poder = new GreenfootSound("som2.mp3");
    
    private int sTimer = 20;
    public int speed = 3;
    /**
     * Act - do whatever the gif wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        movimento ();
    }
     public void movimento(){
        if (Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(), this.getY() -speed);
    }
    if (Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX(), this.getY() +speed);
    }
    if (Greenfoot.isKeyDown("left")){
        this.setLocation(this.getX() - speed, this.getY());
    }
    if (Greenfoot.isKeyDown("right")){
        this.setLocation(this.getX() + speed, this.getY());
    
    }
    else if (Greenfoot.isKeyDown("enter")&& (sTimer == 0)) {
        getWorld().addObject(new poder(), getX() +100, getY() -15);
        sTimer ++;
        poder.play();
    }
    
    else{
        if(!Greenfoot.isKeyDown("enter")){
            sTimer = 0;
        }
    }
}

} 