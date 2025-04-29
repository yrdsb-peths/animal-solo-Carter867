import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the elephant, our hero
 * 
 * @author (Carter) 
 * @version (april 29)
 */
public class elephant extends Actor
{
    /**
     * Act - do whatever the elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
        }
    }
}
