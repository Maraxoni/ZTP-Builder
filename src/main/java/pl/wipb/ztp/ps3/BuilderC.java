package pl.wipb.ztp.ps3;

public class BuilderC extends BuilderA {
    //nadpisanie metody buildC, aby stworzony blok miał właściwości A i obrazek C
    public void buildC() {
        Segment s = new SegmentBlock(x, y, "block3.png");
        plansza.add(s);
        x += TILESIZE;
    }
}
