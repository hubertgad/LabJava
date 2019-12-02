package lab5.Zadanie4;

public class Przepis
{
    int ID;
    int iloscWody;
    int iloscMleka;
    int cisnienieWody;
    int temperaturaWody;
    int iloscKawy;
    Przepis(int ID, int iloscWody, int iloscMleka, int cisnienieWody, int temperaturaWody, int iloscKawy)
    {
        this.ID = ID;
        this.iloscWody = iloscWody;
        this.iloscMleka = iloscMleka;
        this.cisnienieWody = cisnienieWody;
        this.temperaturaWody = temperaturaWody;
        this.iloscKawy = iloscKawy;
    }
    @Override
    public String toString()
    {
        return "Ilosc wody: " + this.iloscWody + "ml, ilosc mleka: " + this.iloscMleka + "ml, cisnienie wody: "
                + this.cisnienieWody + "bar(y/ow), temperatura wody: " + this.temperaturaWody + " stopni, ilosc kawy: "
                + iloscKawy + " gramow.";
    }
}