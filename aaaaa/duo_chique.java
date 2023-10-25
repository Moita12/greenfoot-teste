import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class duo_chique here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class duo_chique extends Actor
{
    GreenfootSound arco = new GreenfootSound("bow_shoot.mp3");
    
    public int speed = 1;
    public int size = 100;
    private int sTimer = 0;
    
    public int vida = 10;
    public void act()
    {
    movimento();
    }
    public void movimento(){
           Actor player = getOneIntersectingObject(emojo.class);

    if(Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
    if(Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
        if(Greenfoot.isKeyDown("left") && player == null){
        this.setLocation(this.getX() - speed, this.getY());
    }
        if(Greenfoot.isKeyDown("right") ){
        this.setLocation(this.getX() + speed, this.getY());
    }
    else if(Greenfoot.isKeyDown("enter") && (sTimer == 0)){
        sTimer ++;
        arco.play();
        getWorld().addObject(new flechaesquerda(), getX(), getY());
    }
    else{
        if(!Greenfoot.isKeyDown("enter")){
            sTimer = 0;
        }
    }
    Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
    if(vida == 0){
    getWorld().removeObject(this);
}
}
}


