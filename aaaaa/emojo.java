import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class emojo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class emojo extends Actor
{
    GreenfootSound arco = new GreenfootSound("bow_shoot.mp3");
    
    public int speed = 10;
    public int size = 100;
    private int sTimer = 0;
    public int vida = 5;
public void act(){
    movimento();
}
    public void movimento(){
    Actor player = getOneIntersectingObject(duo_chique.class);
 if(Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
    if(Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
        if(Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());
    }
        if(Greenfoot.isKeyDown("d") && player == null){
        this.setLocation(this.getX() + speed, this.getY());
    }
    else if(Greenfoot.isKeyDown("space") && (sTimer == 0)){
        sTimer ++;
        arco.play();
        getWorld().addObject(new flechadireita(), getX(), getY());
    }
    else{
        if(!Greenfoot.isKeyDown("space")){
            sTimer = 0;
        }
    }
       Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
    if(vida == 0){
    getWorld().removeObject(this);
}
}
}


