package lab5.Zadanie4;
import static java.lang.System.*;

public class ZbiornikWody extends ZbiornikPlynu
{
    @Override
    void pompuj()
    {
        if (this.aktualnaIlosc > this.iloscDoPompowania)
        {
            out.println("Pompuje wode z cisnieniem " + this.cisnienie + " b, w ilosci " + this.iloscDoPompowania + " ml.");
            this.aktualnaIlosc -= this.iloscDoPompowania;
            out.println("W zbiorniku pozostało " + this.aktualnaIlosc + " ml wody.");
        }
        else
        {
            out.println("Nie ma wody. Dolej.");
        }
    }
}