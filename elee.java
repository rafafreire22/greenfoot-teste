import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gidean here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elee extends Actor
{
    GifImage myGif = new GifImage("elee.gif");
    GreenfootSound poder2 = new GreenfootSound("som2.mp3");
    
    //private int sTimer = 0;
    public int speed = 50;
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
if(Greenfoot.isKeyDown("w")){
     this.setLocation(this.getX(), this.getY() - speed);
    }
if (Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
if (Greenfoot.isKeyDown("a")){
         this.setLocation(this.getX() - speed, this.getY());
        }
if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY());
    }
    if (Greenfoot.isKeyDown("space")) {
        getWorld().addObject(new poder2(), getX() -100, getY() -15);
        poder2.play();
    }
}
}

        
    
        
    

    
