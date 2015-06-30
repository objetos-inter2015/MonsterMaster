import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigos extends Actor
{
    private int mundo = 0;
    private int ex;
    private int rand=Greenfoot.getRandomNumber(400);
    private int dir = 1;
    private int cont = 0;//milisegundos
    private int cont2 = 0;//Segundos
    private int cont3 = 0;//Segundos
    private int cont4 = 0;//Segundos
    private int contGolpe = 0;
    private int vida = 5;
    private int golpe = 0;
    private int puntos2 = 0;
    private int jump = -20;
    private int puntos = 0;
    private int verticalSpeed = 5;
    Poderes p = new Poderes();
    private int poderb = 0;
    private int poderm = 0;
    /**
     * Act - do whatever the enemigo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mov_rand();
    }
    public void mov_rand()
    {
        String cad;
        int accion=Greenfoot.getRandomNumber(50);
        checkFall();
        cont ++;
        cad = "Contador 1: " + cont +  "Contador 2: " + cont2;
        getWorld().showText(cad, 500, 50);
        if(cont == 100)
        {
            cont2++;
            if(cont2 == 3)
            {
                pintaPoderes();
                cont=0;
                cont2=0;
            }
            if(poderm != 0)
            {
                cont3++;
                if(cont3 == 5)
                {
                    poderm = 0;
                    cont3 = 0;
                }
            }
            if(poderb != 0)
            {
                cont4++;
                if(cont4 == 10)
                {
                    poderm = 0;
                    cont4 = 0;
                }
            }
        }
        if(poderm == 0)
        {
            if(accion==1)
            {
                muevete();
            }
            if(accion==2)
            {
                muevete();
            }

            if(cont==100)
            {
                dispara();
                cont = 0;
            }
            if(accion==4)
            {
                if(onGround())
                {
                    verticalSpeed = jump; 
                    fall();                
                }
            }
        }
        if(isTouching(bala_jug.class))
        {
            if(poderb == 0)
            {
                contGolpe+=2;
            }
            if(poderb == 1)
            {
                contGolpe++;
            }
            if(contGolpe == 20)
            {
                golpe++;
                if(golpe == 7)
                {
                    //getWorld().removeObject();
                    vida--;
                    if(vida == 0)
                    {
                        Greenfoot.setWorld(new gameOverText());
                    }
                }
                contGolpe = 0;
            }
            removeTouching(bala_jug.class);
            puntos = 0;
        }
    }

    private void muevete()
    {
        int band_dir = Greenfoot.getRandomNumber(40);
        int mov = 0;
        switch(band_dir)
        {
            case 1:
            //setImage("space_pirates2.png");
            setLocation(getX()+20,getY());
            mov = 1;
            break;
            case 2:
            //setImage("space_pirates1.png");
            setLocation(getX()-20,getY());
            mov = 2;
            break;
        }
        dir = mov;
    }

    public void pintaPoderes()
    {
        int poder = Greenfoot.getRandomNumber(6);
        int x = Greenfoot.getRandomNumber(781);
        int y = 200;
        if(x == 0)
        {
            x = 20;
        }
        if(poder == 0)
        {
            getWorld().addObject(new MinimizarPoder(),x,y);
        }
        if(poder == 1)
        {
            getWorld().addObject(new Invulnerable(),x,y);
        }
        if(poder == 2)
        {
            getWorld().addObject(new DetenerUsuario(),x,y);
        }
        if(poder == 3)
        {
            getWorld().addObject(new DetenerEnemigo(),x,y);
        }
        if(poder == 4)
        {
            getWorld().addObject(new DañoUsuario(),x,y);
        }
        if(poder == 5)
        {
            getWorld().addObject(new AgrandarVida(),x,y);
        }
    }

    private void dispara()
    {
        int band = 0;
        if (dir!=0)
        {
            band = dir;
        }
        getWorld().addObject(new bala_enem(band),getX(),getY());
    }

    private void fall()
    {
        setLocation(getX(),getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + 2;
    }

    private boolean onGround()
    {
        if(getY()>=550)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private void checkFall()
    {
        if(onGround())
            verticalSpeed = 0;
        else
            fall();
    }

    public void detenEnem()
    {
        if(poderm == 0)
        {
            poderm = 1;
        }
    }
    public void minP()
    {
        if(poderb == 0)
        {
            poderb = 1;
        }
    }
}