/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacesTEC.capaLogica.logica;

/**
 *
 * @author sebas
 */
public class Sitio {
    private String ID;
    private int telefonoInt;
    private String rating;
    private String horario;
    private String website;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getTelefonoInt() {
        return telefonoInt;
    }

    public void setTelefonoInt(int telefonoInt) {
        this.telefonoInt = telefonoInt;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Sitio(String ID, int telefonoInt, String rating, String horario, String website) {
        this.ID = ID;
        this.telefonoInt = telefonoInt;
        this.rating = rating;
        this.horario = horario;
        this.website = website;
    }
    
    
    
    
}
