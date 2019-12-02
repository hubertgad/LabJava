package lab5.Zadanie5;

import java.util.Optional;

public class Point {
    protected int x = 0;
    protected int y = 0;
    public Point ()
    {
        this.x = 0;
        this.y = 0;
    }
    public Point(Optional<Integer> x, Optional<Integer> y)
    {
        this.x = x.isPresent() ? x.get() : 0;
        this.y = y.isPresent() ? y.get() : 0;
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}