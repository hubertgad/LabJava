package lab5.Zadanie4;

import static java.lang.System.*;

public class ZbiornikMleka extends ZbiornikPlynu
{
    @Override
    void pompuj()
    {
        if (aktualnaIlosc > this.iloscDoPompowania)
        {
            System.out.println("Pompuje mleko w ilosci " + this.iloscDoPompowania + " ml.");
            aktualnaIlosc -= this.iloscDoPompowania;
            out.println("W zbiorniku pozostało " + this.aktualnaIlosc + " ml mleka.");
        }
        else
        {
            System.out.println("Nie ma mleka. Dolej.");
        }
    }
}
