import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balas extends Actor
{
    /**
     * Act - do whatever the Balas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //muevete();// Add your action code here.
    }
    protected void muevete(int dir)
    {
        int band_dir = dir;
        int band = Greenfoot.getRandomNumber(1);
        int x = getX(), y = getY();
        checaColision();
        if(band_dir == 1)
        {
            switch(band)
            {
                case 0:
                setLocation(x+20,y);
                break;
            }
        }
        if(band_dir == 2)
        {
            switch(band)
            {
                case 0:
                setLocation(x-20,y);
                break;
            }
        }
    }
    private void checaColision()
    {
        Actor a = this.getOneIntersectingObject(bala_enem.class);
        if(a != null )
        {
            //getWorld().removeObject(this);
            this.getWorld().removeObject(a);
        }
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}