package Entities;

import java.util.List;

public class Module {
    private int id;
    private String nomModule;
    List<Cour> cour;
    public List<Cour> getCour() {
        return cour;
    }
    public void setCour(List<Cour> cour) {
        this.cour = cour;
    }
    List<Professeur> professeurs;
    public Module() {
    }
    public List<Professeur> getProfesseurs() {
        return professeurs;
    }
    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomModule() {
        return nomModule;
    }
    public void setNomModule(String nomModule) {
        this.nomModule = nomModule;
    }
}
