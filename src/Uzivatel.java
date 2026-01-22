import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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
        StringBuilder sb = new StringBuilder("");
        String prijmeni1 = prijmeni.trim().replace(" ", "").toLowerCase();
        String jmeno1 = jmeno.trim().replace(" ", "").toLowerCase();
        sb.append(prijmeni1.substring(0, 3));
        sb.append(jmeno1.substring(0, 3));
        sb.append((int) (Math.random() * 2000));
        sb.append("@firma.cz");
        return sb.toString();
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

    public String nahodneHeslo() {
        Random random = new Random();
        int randomNum = (int) (Math.random() * 101);
        String[] words = {"abad.deba.e", "abe.wbe.aeba.", "ba-wb.aeb,a", "eabweb-aeb.eab", "aebwaebaebaebae,.ba-eba,"};
        String randomWord = words[random.nextInt(words.length)];
        String heslo = randomWord + randomNum;
        return heslo;
    }

    public String zastreniEmailu() {
        StringBuilder builder = new StringBuilder(email);
        for (int i = 0; i < email.length() - 6; i++) {
            if (builder.charAt(i) != '@') {
                builder.replace(i, i + 1, "*");
            } else {
                i++;
            }
        }
        return builder.toString();
    }

    public long dnyDoNarozenin() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");
        LocalDate datumNarozeni1 = LocalDate.parse(this.datumNarozeni, formatter);
        LocalDate dnes = LocalDate.now();
        LocalDate Narozeniny2 = datumNarozeni1.withYear(dnes.getYear());
        return ChronoUnit.DAYS.between(dnes, Narozeniny2);
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