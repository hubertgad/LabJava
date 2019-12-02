package lab5.Zadanie4;
import static java.lang.System.*;

public class ZbiornikCukru extends ZbiornikProszku
{
    protected IloscCukru iloscDoPodania;
    void setIloscDoPodania(IloscCukru iloscDoPodania)
    {
        this.iloscDoPodania = iloscDoPodania;
    }
    @Override
    void nasyp()
    {
        if (iloscDoPodania != IloscCukru.C0)
        {
            out.println("Wsypuje " + iloscDoPodania.toString() + " porcje cukru.");
        }
    }
    ZbiornikCukru()
    {
        this.iloscDoPodania = IloscCukru.C0;
    }
}
