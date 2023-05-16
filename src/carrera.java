import java.util.Random;

public class carrera {
    
    static auto[] losautos;
    static Random rnd;
    static int[] vel;
    
    static public void reiniciar(){
    int[] vel={240,250,255,245};
    int[] ava={13,15,16,14};
     //Vel
        losautos[0].setVelocidad(vel[rnd.nextInt(4)]);
        losautos[1].setVelocidad(vel[rnd.nextInt(4)]);
        losautos[2].setVelocidad(vel[rnd.nextInt(4)]);
        losautos[3].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        losautos[0].setAvance(ava[rnd.nextInt(4)]);
        losautos[1].setAvance(ava[rnd.nextInt(4)]);
        losautos[2].setAvance(ava[rnd.nextInt(4)]);
        losautos[3].setAvance(ava[rnd.nextInt(4)]);
    
    }//
    
    static public void registrarAutos(){
        rnd= new Random();
        
        int[] vel={240,250,255,245};
        int[] ava={13,15,16,14};
        losautos = new auto[4];
        
        
        //crea los objetos y adigna sus propiedades 
        losautos[0] = new auto(0,0,0,0,0,"-");
        losautos[1] = new auto(0,0,0,0,0,"-");
        losautos[2] = new auto(0,0,0,0,0,"-");
        losautos[3] = new auto(0,0,0,0,0,"-");
        //ingreso de datos
        //codigos
        losautos[0].setCodigo(101);
        losautos[1].setCodigo(102);
        losautos[2].setCodigo(103);
        losautos[3].setCodigo(104);
        //nombres
        losautos[0].setNombre("Auto81");
        losautos[1].setNombre("Auto82");
        losautos[2].setNombre("Auto83");
        losautos[3].setNombre("Auto84");
        //CoordX
        losautos[0].setCoorX(frmInicio.lblauto1.getLocation().x);
        losautos[1].setCoorX(frmInicio.lblauto2.getLocation().x);
        losautos[2].setCoorX(frmInicio.lblauto3.getLocation().x);
        losautos[3].setCoorX(frmInicio.lblauto4.getLocation().x);
        //CoordX
        losautos[0].setCoorY(frmInicio.lblauto1.getLocation().y);
        losautos[1].setCoorY(frmInicio.lblauto2.getLocation().y);
        losautos[2].setCoorY(frmInicio.lblauto3.getLocation().y);
        losautos[3].setCoorY(frmInicio.lblauto4.getLocation().y);
        //Vel
        losautos[0].setVelocidad(vel[rnd.nextInt(4)]);
        losautos[1].setVelocidad(vel[rnd.nextInt(4)]);
        losautos[2].setVelocidad(vel[rnd.nextInt(4)]);
        losautos[3].setVelocidad(vel[rnd.nextInt(4)]);
        
        //avances
        losautos[0].setAvance(ava[rnd.nextInt(4)]);
        losautos[1].setAvance(ava[rnd.nextInt(4)]);
        losautos[2].setAvance(ava[rnd.nextInt(4)]);
        losautos[3].setAvance(ava[rnd.nextInt(4)]);
        //
        losautos[0].setTiempo(0);
        losautos[1].setTiempo(0);
        losautos[2].setTiempo(0);
        losautos[3].setTiempo(0);
        
        //
    }//
    
    //este metodo inicializa 4 hilos simultaneamente cad auno correspondiente a un automovil
    //en el aqrray de autos
    //cada hilo ejecutara su propia logica
    static void iniciar(){
        
        hiloUno h1= new hiloUno(losautos[0].getNombre());
        h1.start();
        
        hiloUno h2= new hiloUno(losautos[1].getNombre());
        h2.start();
        
        hiloUno h3= new hiloUno(losautos[2].getNombre());
        h3.start();
        
        hiloUno h4= new hiloUno(losautos[3].getNombre());
        h4.start();
    }//iniciar           
    
    }//class