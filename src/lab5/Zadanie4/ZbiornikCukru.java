package lab5.Zadanie4;
import static java.lang.System.*;

class ZbiornikCukru extends ZbiornikProszku
{
    private IloscCukru iloscDoPodania;
    void setIloscDoPodania(IloscCukru iloscDoPodania)
    {
        this.iloscDoPodania = iloscDoPodania;
    }
    @Override
    void nasyp()
    {
        if (this.iloscDoPodania != IloscCukru.C0)
        {
            out.println("Wsypuje " + this.iloscDoPodania.toString() + " porcje cukru.");
        }
    }
    ZbiornikCukru()
    {
        this.iloscDoPodania = IloscCukru.C0;
    }
}
