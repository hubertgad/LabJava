package lab5.Zadanie5_6_7;
import java.util.Optional;

public class Point {
    private static int liczbaInstancji;
    protected int x = 0;
    protected int y = 0;

    public Point ()
    {
        this.x = 0;
        this.y = 0;
        liczbaInstancji++;
    }
    public Point(Optional<Integer> x, Optional<Integer> y)
    {
        this.x = x.isPresent() ? x.get() : 0;
        this.y = y.isPresent() ? y.get() : 0;
        liczbaInstancji++;
    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
        liczbaInstancji++;
    }
    public Point(Point that)
    {
        this.x = that.x;
        this.y = that.y;
        liczbaInstancji++;
    }
    @Override
    protected void finalize() throws Throwable
    {
        liczbaInstancji--;
    }
    static void zliczaj()
    {
        System.out.println("Liczba instancji: " + liczbaInstancji);
    }
}