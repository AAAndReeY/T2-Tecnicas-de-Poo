/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2clasehorarios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Andre
 */
public class Estudiantes {
   
    private String Telefono;
    private String Curso;

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public Estudiantes(String Telefono, String Curso) {
        this.Telefono = Telefono;
        this.Curso = Curso;
    }
    
}
