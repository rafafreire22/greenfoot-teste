import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class primeirafase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class primeirafase extends World
{
    public int temp = 8;
    public int temp1 = 10;
    public int temp2 = 8;
    /**
     * Constructor for objects of class primeirafase.
     * 
     */
    public primeirafase()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public void act(){ 
        temp--;
        //Diálogo ruy
        if (Greenfoot.isKeyDown("enter") && (temp < 1)){
            setBackground(new GreenfootImage("22.png"));
            temp1--;
        }
        //Diálogo ele
        if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
            setBackground(new GreenfootImage("3.png"));
            temp2--;
        }
        // intro
        if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
            Mundo world = new Mundo();
            Greenfoot.setWorld(world);
        }

    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {}
}
    
 
