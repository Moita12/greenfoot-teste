import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flechadireita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flechadireita extends emojo
{
    GifImage flechadireita = new GifImage("flechadireita.gif");
    public void act()
    {
    setImage(flechadireita.getCurrentImage());
    ataque();
    acertarAlvo();
    }
    public void ataque(){
        double angle = Math.toRadians( getRotation());
        int x = (int) Math.round (getX() + Math.cos(angle));
        int y = (int) Math.round (getY() + Math.sin(angle));
        
        setLocation(x,y);
    }
        public void acertarAlvo(){
        Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
        Actor player = getOneIntersectingObject(duo_chique.class);
        
        if(player != null){
            counter2.add(-1);
            vida -= 1;
            getWorld().removeObject(this);
        }
}
}
