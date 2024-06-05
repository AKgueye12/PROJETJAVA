package Entities;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Cour {
    private int id;
    private LocalDateTime date;
    private LocalTime heure;
    List<Professeur> professeurs;
    public List<Professeur> getProfesseurs() {
        return professeurs;
    }
    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }
    private Module module; 
    public Module getModule() {
        return module;
    }
    public void setModule(Module module) {
        this.module = module;
    }
    public Cour() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public LocalTime getHeure() {
        return heure;
    }
    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }
}