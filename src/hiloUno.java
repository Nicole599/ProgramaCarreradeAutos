/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.plaf.SliderUI;

/**
 *
 * @author Christian
 */
public class hiloUno extends Thread {
    
    public hiloUno(String name) {
        this.setName(name);
    }//constr

    
    @Override
    public void run() {
        
        if (getName().equals("Auto81")) {

            long ti = System.currentTimeMillis();

            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblauto1.setLocation(frmInicio.lblauto1.getLocation().x + carrera.losautos[0].getAvance(), frmInicio.lblauto1.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);

                    sleep(carrera.losautos[0].getVelocidad());

                    if (frmInicio.lblauto1.getLocation().x >= frmInicio.lblLinea.getLocation().x) {
                        long tf = System.currentTimeMillis();
                        long tt = tf - ti;
                        carrera.losautos[0].setTiempo(tt);
                        frmInicio.txtR.append("\n" + this.getName() + ":" + carrera.losautos[0].getTiempo() + " ms");
                        j = 99;
                    } else {
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }

            }//for

            frmInicio.lblauto1.setLocation(frmInicio.lblauto1.getLocation().x, frmInicio.lblauto1.getLocation().y);

            this.stop();
        }//if

        if (getName().equals("Auto82")) {
            long ti = System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblauto2.setLocation(frmInicio.lblauto2.getLocation().x + carrera.losautos[1].getAvance(), frmInicio.lblauto2.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);

                    sleep(carrera.losautos[1].getVelocidad());

                    if (frmInicio.lblauto2.getLocation().x >= frmInicio.lblLinea.getLocation().x) {
                        long tf = System.currentTimeMillis();
                        long tt = tf - ti;
                        carrera.losautos[1].setTiempo(tt);
                        frmInicio.txtR.append("\n" + this.getName() + ":" + carrera.losautos[1].getTiempo() + " ms");
                        j = 99;
                    } else {
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }

            }//for
            frmInicio.lblauto2.setLocation(frmInicio.lblauto2.getLocation().x, frmInicio.lblauto2.getLocation().y);
            this.stop();
        }//if

        if (getName().equals("Auto83")) {
            long ti = System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblauto3.setLocation(frmInicio.lblauto3.getLocation().x + carrera.losautos[2].getAvance(), frmInicio.lblauto3.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);

                    sleep(carrera.losautos[2].getVelocidad());

                    if (frmInicio.lblauto3.getLocation().x >= frmInicio.lblLinea.getLocation().x) {
                        long tf = System.currentTimeMillis();
                        long tt = tf - ti;
                        carrera.losautos[2].setTiempo(tt);
                        frmInicio.txtR.append("\n" + this.getName() + ":" + carrera.losautos[2].getTiempo() + " ms");
                        j = 99;
                    } else {
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }

            }//for
            frmInicio.lblauto3.setLocation(frmInicio.lblauto3.getLocation().x, frmInicio.lblauto3.getLocation().y);
            this.stop();
        }//if

        if (getName().equals("Auto84")) {
            long ti = System.currentTimeMillis();
            for (int j = 0; j < 99; j++) {
                try {
                    frmInicio.lblauto4.setLocation(frmInicio.lblauto4.getLocation().x + carrera.losautos[3].getAvance(), frmInicio.lblauto4.getLocation().y);
                    //System.out.println(this.getName()+":"+frmInicio.lblCaballo1.getLocation()+" -- "+frmInicio.lblLinea.getLocation().x);

                    sleep(carrera.losautos[3].getVelocidad());

                    if (frmInicio.lblauto4.getLocation().x >= frmInicio.lblLinea.getLocation().x) {
                        long tf = System.currentTimeMillis();
                        long tt = tf - ti;
                        carrera.losautos[3].setTiempo(tt);
                        frmInicio.txtR.append("\n" + this.getName() + ":" + carrera.losautos[3].getTiempo() + " ms");
                        j = 99;
                    } else {
                        j++;
                    }//else
                } //for
                catch (InterruptedException ex) {
                    Logger.getLogger(hiloUno.class.getName()).log(Level.SEVERE, null, ex);
                }

            }//for
            frmInicio.lblauto4.setLocation(frmInicio.lblauto4.getLocation().x, frmInicio.lblauto4.getLocation().y);
            this.stop();
        }//if

    }//run

}
