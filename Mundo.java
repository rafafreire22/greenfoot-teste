import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Rafinha 
 * @version 0.1 Alpha
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("som.mp3");
     public void started()
     {
         bgMusic.playLoop();
     }
     public void stopped()
     {
         bgMusic.pause();
     }
    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        elee elee = new elee();
        addObject(elee,383,413);
        elee.setLocation(389,428);
        elee.setLocation(473,459);
        elee.setLocation(464,452);
        removeObject(elee);
        addObject(elee,351,420);
        elee.setLocation(443,440);
        removeObject(elee);
        addObject(elee,441,456);
        elee.setLocation(216,355);
        elee.setLocation(197,311);
        gif gif = new gif();
        addObject(gif,519,317);
        gif.setLocation(651,296);
        elee.setLocation(216,316);
        Counter counter = new Counter();
        addObject(counter,500,30);
        Counter2 counter2 = new Counter2();
        addObject(counter2,247,32);
        counter2.setLocation(264,16);
        counter2.setLocation(295,35);
    }
}















