package pl.wipb.ztp.ps3;
import java.util.ArrayList;
import java.util.List;
//Abstract Class
public abstract class Builder {
    private final int topMargin = 4, leftMargin = 4;
    //x,y koordynaty od których zaczyna się tworzenie mapy, x tak na prawdę nie ma znaczenia
    protected int x = leftMargin;
    protected int y = topMargin;
    protected final int TILESIZE = 32;
    //Lista z planszą
    protected final List<Segment> plansza = new ArrayList<Segment>();

    public abstract void buildX(int liczba);
    public abstract void buildA();
    public abstract void buildB();
    public abstract void buildC();
    public abstract void buildG();

    public void moveToNextRow() {
        y += TILESIZE;
        x = leftMargin;
    }
    //Zwracanie stworzonej planszy
    public List<Segment> getPlansza() {
        return plansza;
    }
}
