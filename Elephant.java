import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the elephant, our hero
 * 
 * @author (Carter) 
 * @version (april 29)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    public Elephant()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        eat();
    }

    public void eat()
    {
        if(isTouching(Apple.class))
        {
             removeTouching(Apple.class); 
             MyWorld world = (MyWorld) getWorld();
             world.createApple();
             world.increaseScore();
             elephantSound.play();
        }
    }
}
