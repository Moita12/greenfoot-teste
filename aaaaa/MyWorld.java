import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("musica.mp3");
    public void started(){
        bgMusic.playLoop();
    }
    public void stopped(){
        bgMusic.stop();
    }
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 450, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        duo_chique duo_chique = new duo_chique();
        addObject(duo_chique,726,285);
        emojo emojo = new emojo();
        addObject(emojo,40,372);
        emojo.setLocation(109,395);
        duo_chique.setLocation(656,327);

        Counter counter = new Counter();
        addObject(counter,60,35);
        emojo.setLocation(108,446);
        Counter2 counter2 = new Counter2();
        addObject(counter2,735,31);
    }

}
