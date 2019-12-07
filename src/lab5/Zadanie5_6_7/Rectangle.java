package lab5.Zadanie5_6_7;

class Rectangle extends Point {
    public int width;
    public int height;

    // four constructors
    public Rectangle()
    {
        super();
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(Point p)
    {
        super(p.x, p.y);
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int w, int h)
    {
        this.width = w;
        this.height = h;
    }
    public Rectangle(Point p, int w, int h)
    {
        this.x = p.x;
        this.y = p.y;
        this.width = w;
        this.height = h;
    }
    public void move(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int area()
    {
        return width * height;
    }
}