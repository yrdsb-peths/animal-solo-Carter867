import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the elephant, our hero
 * 
 * @author (Carter) 
 * @version (april 29)
 */
public class elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
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
