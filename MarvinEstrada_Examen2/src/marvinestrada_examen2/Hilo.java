package marvinestrada_examen2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Hilo implements Runnable{
    private JLabel hora;
    private int tiempo;
    private JProgressBar bar;

    public Hilo() {
    }

    public Hilo(JLabel hora, int tiempo) {
        this.hora = hora;
        this.tiempo = tiempo;
    }

    public Hilo(JLabel hora, int tiempo, JProgressBar bar) {
        this.hora = hora;
        this.tiempo = tiempo;
        this.bar = bar;
    }

    public Hilo(JLabel hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "hiloHora{" + "hora=" + hora + '}';
    }

    @Override
    public void run() {
        int acum=0;
         while(acum<tiempo){
            DateFormat f = new SimpleDateFormat("ss");
            hora.setText(acum+"");
            bar.setValue(acum);
            acum++;
            try {
               java.lang.Thread.sleep(1000);
           } catch (InterruptedException ex) {
           }
        }
    }
}