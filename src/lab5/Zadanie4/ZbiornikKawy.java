package lab5.Zadanie4;
import static java.lang.System.*;

public class ZbiornikKawy extends ZbiornikProszku
{
    protected int iloscDoPodania;
    public void setIloscDoPodania(int iloscDoPodania)
    {
        this.iloscDoPodania = iloscDoPodania;
    }
    @Override
    void nasyp()
    {
        out.println("Miele " + this.iloscDoPodania + " gramow kawy.");
    }
    ZbiornikKawy()
    {
        this.iloscDoPodania = 0;
    }
}