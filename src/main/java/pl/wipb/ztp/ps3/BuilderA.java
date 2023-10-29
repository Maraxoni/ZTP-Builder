package pl.wipb.ztp.ps3;

class BuilderA extends Builder {
    public void buildX(int liczba) {
        x += liczba * TILESIZE;
    }

    public void buildA() {
        Segment s = new SegmentBlock(x, y, "block1.png");
        plansza.add(s);
        x += TILESIZE;
    }

    public void buildB() {
        Segment s = new SegmentBlockV(x, y, "block2.png");
        plansza.add(s);
        x += TILESIZE;
    }

    public void buildC() {
        Segment s = new Segment(x, y, "block3.png");
        plansza.add(s);
        x += TILESIZE;
    }

    public void buildG() {
        Segment s = new SegmentAnim(x, y, "bonus.png", new int[]{0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 2, 2, 1, 1, 1, 0, 0});
        plansza.add(s);
        x += TILESIZE;
    }
}
