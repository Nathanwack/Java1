public class Enseignant {
    public String Nom;
    public Specialite Specialite;

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
}
