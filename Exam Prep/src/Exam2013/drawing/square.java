package Exam2013.drawing;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class square extends shape{
    private double sidelength;

    public square(points p, double sidelength) {
        super(p);
        this.sidelength = sidelength;
    }
    public boolean contains(points p) {
        double cx = getPoint().getX();
        double cy = getPoint().getY();
        double px = p.getX();
        double py = p.getY();
        if (px>cx+(sidelength/2) || px < cx-(sidelength/2) || py > cy+(sidelength/2) || py< cy - (sidelength/2)) return false;
        else return true;
    }
}
