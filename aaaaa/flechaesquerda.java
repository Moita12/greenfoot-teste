import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flechaesquerda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flechaesquerda extends duo_chique
{
    GifImage flechaesquerda = new GifImage("flechaesquerda.gif");
    public void act()
    {
    setImage(flechaesquerda.getCurrentImage());
    ataque();
    acertarAlvo();
    }
       public void ataque(){
        double angle = Math.toRadians( getRotation());
        int x = (int) Math.round (getX() - Math.cos(angle));
        int y = (int) Math.round (getY() + Math.sin(angle));
        
        setLocation(x,y);
    }
    public void acertarAlvo(){
        Actor player = getOneIntersectingObject(emojo.class);
        Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        if(player != null){
            counter.add(-1);
            vida -= 1;
            getWorld().removeObject(this);
        }

    }
    
}
