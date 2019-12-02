package lab5.Zadanie4;
import java.util.Random;
import static java.lang.System.*;

abstract class ZbiornikPlynu extends Zbiornik
{
    private int temperatura;
    int cisnienie;
    int iloscDoPompowania;

    void setTemperatura(int temperatura)
    {
        if (temperatura > 100)
        {
            out.println("Maksymalna temperatura to 100 stopni.");
            this.temperatura = 100;
        }
        else if (temperatura < 80)
        {
            out.println("Minimalna temperatura to 80 stopni.");
            this.temperatura = 80;
        }
        else
        {
            this.temperatura = temperatura;
        }
        System.out.println("Ustawiam temperature na " + this.temperatura + " stopni.");
    }

    void setCisnienie(int cisnienie)
    {
        if (cisnienie > 25)
        {
            out.println("Maksymalne cisnienie to 25 b.");
            this.cisnienie = 25;
        }
        else if (cisnienie > 1)
        {
            out.println("Minimalne cisnienie to 1 b.");
            this.cisnienie = 1;
        }
        else
        {
            this.cisnienie = cisnienie;
        }
        out.println("Ustawiam cisnienie na " + cisnienie + " b");
    }
    void setIloscDoPompowania(int iloscDoPompowania)
    {
        if (iloscDoPompowania > 300)
        {
            out.println("Maksymalna ilosc do wpompowania to 300 ml.");
            this.iloscDoPompowania = 300;
        }
        if (iloscDoPompowania < 0)
        {
            out.println("Ilosc do wpompowania nie moze byc mniejsza niz 0.");
            this.iloscDoPompowania = 0;
        }
        this.iloscDoPompowania = iloscDoPompowania;
    }
    abstract void pompuj();
    ZbiornikPlynu()
    {
        this.aktualnaIlosc = 1500;
        this.iloscDoPompowania = 100;
        this.temperatura = new Random().nextInt(20)+80;
        this.cisnienie = 1;
    }
}