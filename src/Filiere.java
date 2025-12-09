public class Filiere {
    public String Code;
    public String Libelle;
    public Enseignant Formateur;

    public Filiere(String Code, String Libelle, Enseignant Formateur) {
        this.Code = Code;
        this.Libelle = Libelle;
        this.Formateur = Formateur;
    }
    
    public Filiere(String Code, String Libelle) {
        this.Code = Code;
        this.Libelle = Libelle;
    }

    public String getCode() {
        return Code;
    }
    public void setCode(String Code) {
        this.Code = Code;
    }
    public String getLibelle() {
        return Libelle;
    }
}
