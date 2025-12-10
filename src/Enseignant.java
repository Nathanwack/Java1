public class Enseignant {
    public String Nom;
    public Specialite Specialite;
    public Filiere Filiere;

    public Enseignant(String Nom, Specialite Specialite, Filiere Filiere) {
        this.Nom = Nom;
        this.Specialite = Specialite;
        this.Filiere = Filiere;
    }

    public Enseignant(String Nom, Specialite Specialite) {
        this.Nom = Nom;
        this.Specialite = Specialite;
    }

    public Specialite getSpecialite() {
        return Specialite;
    }
    public void setSpecialite(Specialite Specialite) {
        this.Specialite = Specialite;
    }

    public String getNom() {
        return Nom;
    }

    public Filiere getFiliere() {
        return Filiere;
    }
    public void setFiliere(Filiere Filiere) {
        this.Filiere = Filiere;
    }
}
