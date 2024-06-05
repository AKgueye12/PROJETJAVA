package Entities;

public class Professeur {
    private int id;
    private String Nom;
    private String Prenom;
    private String Tel;
    private Cour cour;
    private Module module;
    public Professeur() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public String getPrenom() {
        return Prenom;
    }
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }
    public String getTel() {
        return Tel;
    }
    public void setTel(String tel) {
        Tel = tel;
    }
    public Cour getCour() {
        return cour;
    }
    public void setCour(Cour cour) {
        this.cour = cour;
    }
    public Module getModule() {
        return module;
    }
    public void setModule(Module module) {
        this.module = module;
    }
}
