import java.util.Random;

public class Uzivatel {
    private String jmeno;
    private String prijmeni;
    private String datumNarozeni;
    private String email;
    private String heslo;

    public Uzivatel(String jmeno, String prijmeni, String datumNarozeni, String email, String heslo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
        this.email = email;
        this.heslo = heslo;
    }

    public String upravaJmena() {
        String upraveneJmeno = jmeno.replaceAll("[^a-zA-Zá-žÁ-Ž]", "");
        return upraveneJmeno.substring(0, 1).toUpperCase() + upraveneJmeno.substring(1).toLowerCase();
    }

    public String upravaPrijmeni() {
        String upravenePrijemni = prijmeni.replaceAll("[^a-zA-Zá-žÁ-Ž]", "");
        return upravenePrijemni.substring(0, 1).toUpperCase() + upravenePrijemni.substring(1).toLowerCase();
    }

    public String generaceEmailu() {
        String generaceEmailu = (prijmeni + jmeno).replaceAll("[^a-zA-Zá-žÁ-Ž]", "");
        String vysledek = generaceEmailu;
        Random random = new Random();
        int randomNumber = random.nextInt(900) + 100;

        return vysledek.toLowerCase() + randomNumber + "@gmail.com";
    }

    public boolean jeEmail() {
        String email = generaceEmailu();
        boolean obsahujeZavinac = false;
        boolean obsahujeTecku = false;

        for (int i = 0; i < email.length(); i++) {
            char znak = email.charAt(i);
            if (znak == '@') {
                obsahujeZavinac = true;
            } else if (znak == '.') {
                obsahujeTecku = true;
            }
        }
        return obsahujeZavinac && obsahujeTecku;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getDatumNarozeni() {
        return datumNarozeni;
    }

    public String getEmail() {
        return email;
    }

    public String getHeslo() {
        return heslo;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setDatumNarozeni(String datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    @Override
    public String toString() {
        return "Jméno: " + jmeno + ", Příjmení: " + prijmeni + ", Datum narození: " + datumNarozeni + ", Email: " + email + ", Heslo: " + heslo;
    }
}