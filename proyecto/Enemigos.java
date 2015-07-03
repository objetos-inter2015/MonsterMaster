import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.*;
/**
 * Write a description of class Enemigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigos extends Actor
{
    protected GreenfootImage[] enem = new GreenfootImage[8];
    private int mundo = 0;
    private int ex;
    private int anim=0;
    private int rand=Greenfoot.getRandomNumber(400);
    private int dir = 1;//1 es a la izquierda, 2 a la derecha
    private int cont = 0;//milisegundos
    private int cont2 = 0;//Segundos
    private int cont3 = 0;//Segundos
    private int cont4 = 0;//Segundos
    private int vida = 5;
    private int puntos2 = 0;
    private int jump = -20;
    private int puntos = 0;
    private int verticalSpeed = 5;
    static int contEnem = 0;
    private int contGolpe = 0;
    private int golpe = 0;
    private String cad2;
    Poderes p = new Poderes();
    private int poderb = 0;
    private int poderm = 0;
    private int en;
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
        cad = "Enemigos vencidos: " + contEnem;
        getWorld().showText(cad, 500, 20);
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
            if(accion==3)
            {
                muevete();
            }
            if(accion==5)
            {
                muevete();
            }
            /*if(accion==2)
            {
            muevete();
            }*/

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
        if(contEnem == 4)
        {
            contEnem=0;
            Greenfoot.setWorld(new gameOverText());
        }
    }

    private void muevete()
    {
        int band_dir = Greenfoot.getRandomNumber(40);
        int mov = 0;
        dir=band_dir;
        switch(band_dir)
        {
            case 1:
            animacion();
            mov = 1;
            break;
            case 2:
            animacion();
            mov = 2;
            break;
        }
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
        if(getX()<400)
        {
            dir=1;
        }
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
        cad2 = "Si entro a la detenerte ";
        //cad = "Enemigos a vencer: " + contEnem;
        //getWorld().showText(cad, 500, 50);
        if(poderm == 0)
        {
            poderm = 1;
        }
    }

    public void minP()
    {
        cad2 = "Si entro a ganarte ";
        //cad = "Enemigos a vencer: " + contEnem;
        //getWorld().showText(cad, 500, 20);
        if(poderb == 0)
        {
            poderb = 1;
        }
    }

    public void animacion()
    {
        int anim;
        for(anim=0; anim<=400;anim++)
        {
            if(anim==100)
            {
                if(dir==1)
                {
                    setLocation(getX()+4,getY());
                    setImage(enem[4]);
                }
                if(dir==2)
                {
                    setLocation(getX()-4,getY());
                    setImage(enem[0]);
                }
            }
            if(anim==200)
            {
                if(dir==1)
                {
                    setLocation(getX()+4,getY());
                    setImage(enem[5]);
                }
                if(dir==2)
                {
                    setLocation(getX()-4,getY());
                    setImage(enem[1]);
                }
            }
            if(anim==300)
            {
                if(dir==1)
                {
                    setLocation(getX()+4,getY());
                    setImage(enem[6]);
                }
                if(dir==2)
                {
                    setLocation(getX()-4,getY());
                    setImage(enem[2]);
                }
            }
            if(anim==400)
            {
                if(dir==1)
                {
                    setLocation(getX()+4,getY());
                    setImage(enem[7]);
                }
                if(dir==2)
                {
                    setLocation(getX()-4,getY());
                    setImage(enem[3]);
                }
            }
        }
    }
}