/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2clasehorarios;

/**
 *
 * @author Personal
 */
public class HorarioClase {
    
    private String TurnoMañana;
    private String TurnoTarde;
    private String TurnoNoche;

    public String getTurnoMañana() {
        return TurnoMañana;
    }

    public void setTurnoMañana(String TurnoMañana) {
        this.TurnoMañana = TurnoMañana;
    }

    public String getTurnoTarde() {
        return TurnoTarde;
    }

    public void setTurnoTarde(String TurnoTarde) {
        this.TurnoTarde = TurnoTarde;
    }

    public String getTurnoNoche() {
        return TurnoNoche;
    }

    public void setTurnoNoche(String TurnoNoche) {
        this.TurnoNoche = TurnoNoche;
    }

    public HorarioClase(String TurnoMañana, String TurnoTarde, String TurnoNoche) {
        this.TurnoMañana = TurnoMañana;
        this.TurnoTarde = TurnoTarde;
        this.TurnoNoche = TurnoNoche;
    }
    
}
