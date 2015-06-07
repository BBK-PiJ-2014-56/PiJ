package Exam2013.drawing;

/**
 * Created by jimjohn_thornton on 07/06/15.
 */
public class rectangles extends shape {
    private double length;
    private double width;

    public rectangles(points point, double length, double width) {
        super(point);
        this.length = length;
        this.width = width;
    }
    public boolean contains(points p) {
        double cx = getPoint().getX();
        double cy = getPoint().getY();
        double px = p.getX();
        double py = p.getY();
        if (px>cx+(width/2) || px < cx-(width/2) || py > cy+(length/2) || py< cy - (length/2)) return false;
        else return true;
    }
}
