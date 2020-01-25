package lab9.Zadanie2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OcenaFilmu
{
    private int id_filmu;
    private int id_uzytkownika;
    private int ocena;
    private Date data_glosowania;

    OcenaFilmu(int id_filmu, int id_uzytkownika, int ocena, Date data_glosowania)
    {
        this.id_filmu = id_filmu;
        this.id_uzytkownika = id_uzytkownika;
        this.ocena = ocena;
        this.data_glosowania = data_glosowania;
    }
    OcenaFilmu(String CSV)
    {
        String[] output = CSV.split(",");
        id_filmu = Integer.parseInt(output[0]);
        id_uzytkownika = Integer.parseInt(output[1]);
        ocena = Integer.parseInt(output[2]);
        try
        {
            data_glosowania = new SimpleDateFormat("yyyy-MM-dd").parse(output[3]);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
    String toCSV()
    {
        return id_filmu + "," + id_uzytkownika + "," + ocena + "," + new SimpleDateFormat("yyyy-MM-dd").format(data_glosowania);
    }
    public String toString()
    {
        return "ID filmu: " + id_filmu + " ID uzytkownika: " + id_uzytkownika + " ocena: " + ocena + " data: " + data_glosowania;
    }
}