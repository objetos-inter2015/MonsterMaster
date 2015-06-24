import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigos extends Actor
{
    private int rand=Greenfoot.getRandomNumber(400);
    private int dir = 1;
    private int cont = 0;
    private int cont2 = 0;
    private int contGolpe = 0;
    private int golpe = 0;
    private int puntos2 = 0;
    private int jump = -20;
    private int puntos = 0;
    private int verticalSpeed = 5;
    Poderes p = new Poderes();
    record_puntos rec=new record_puntos();
    private Counter puntaje  = new Counter("Puntos: ");
    /**
     * Act - do whatever the enemigo_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        mov_rand();
        muevete();
        cont ++;
        cont2++;
        //Actor 
        //salta();//Pendiente
        //usaCarta();//Pendiente
    }
    public void mov_rand()
    {
        int accion=Greenfoot.getRandomNumber(50);
        getWorld().addObject(puntaje, 100,25);
        getWorld().addObject(new vidaEnemigo(golpe), 600 , 100 );
        checkFall();
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
    private void muevete()
    {
        int band_dir = Greenfoot.getRandomNumber(40);
        int mov = 0;
        Actor bala = getOneIntersectingObject(bala_jug.class);
        Niveles m = (Niveles) getWorld();
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
        if(isTouching(bala_jug.class))
        {
            contGolpe++;
            puntos = puntos + 10;
            puntos2 += puntos;
            if(contGolpe == 10)
            {
                golpe++;
                sumaPuntos(puntos);
                rec.guardaRecords(puntos2);
                //System.out.println("Contador de puntos: " + puntos);
                if(golpe == 7)
                {
                    Greenfoot.setWorld(new gameOverText(puntaje.getValue()));
                    m.eliminaActores();
                }
                contGolpe = 0;
            }
            removeTouching(bala_jug.class);
            puntos = 0;
        }
        dir = mov;
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

    protected void sumaPuntos(int p)
    {
        puntos += p;
        //puntaje.setValue(puntos);
        puntaje.add(puntos);
    }

}

