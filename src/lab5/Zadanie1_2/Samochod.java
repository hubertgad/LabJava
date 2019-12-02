package lab5.Zadanie1_2;
import java.time.LocalDate;
import java.time.Period;

public class Samochod
{
    private String marka;
    private String model;
    private double pojemnosc;
    private String typ;
    private double silnik;
    private int rokProdukcji;
    private LocalDate dataPierwRejestr;
    private double cena;

    public String getMarka() { return marka; }
    public String getModel() { return model; }
    public double getPojemnosc() { return pojemnosc; }
    public String getTyp() { return typ; }
    public double getSilnik() { return silnik; }
    public int getRokProdukcji() { return rokProdukcji; }
    public LocalDate getDataPierwRejestr() { return dataPierwRejestr; }
    public double getCena() { return cena; }

    public void setMarka(String marka) { this.marka = marka; }
    public void setModel(String model) { this.model = model; }
    public void setPojemnosc(double pojemnosc) { this.pojemnosc = pojemnosc; }
    public void setTyp(String typ) { this.typ = typ; }
    public void setSilnik(double silnik) { this.silnik = silnik; }
    public void setRokProdukcji(int rokProdukcji) { this.rokProdukcji = rokProdukcji; }
    public void setDataPierwRejestr(LocalDate dataPierwRejestr) { this.dataPierwRejestr = dataPierwRejestr; }
    public void setCena(double cena) { this.cena = cena; }

    public String czyMaGwarancje()
    {
        Period czasOdZakupu = Period.between(getDataPierwRejestr(), LocalDate.now());
        if (czasOdZakupu.getYears() < 2) { return "Samochod posiada jeszcze gwarancje."; }
        else { return "Okres gwarancji uplynal."; }
    }
}