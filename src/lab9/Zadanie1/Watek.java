package lab9.Zadanie1;

import java.util.Date;

public class Watek extends Thread
{
    private int ID;

    Watek(int ID)
    {
        this.ID = ID;
    }

    public void run()
    {
        System.out.println("Watek: " + this.ID + " " + new Date());
        synchronized (currentThread())
        {
            try
            {
                this.wait(300);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
