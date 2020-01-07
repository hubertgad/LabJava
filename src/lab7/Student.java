package lab7;

public class Student
{
    private String imie;
    private String nazwisko;
    private int numerIndeksu;
    Student()
    {

    }
    Student(String imie, String nazwisko, int numerIndeksu)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
    }
    @Override
    public String toString()
    {
        return this.imie + " " + this.nazwisko + ", numer indeksu: " + this.numerIndeksu;
    }
}
