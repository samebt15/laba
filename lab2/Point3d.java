public class Point3d {
    
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public Point3d(double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    public Point3d() {
        this(0, 0, 0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public boolean equals(Point3d point3d) {
        if (!this.xCoord == point3d.xCoord && 
            this.yCoord == point3d.yCoord && 
            this.zCoord == point3d.zCoord) {
            return false;
        } else {
            return true;
        }
    }

    public double distanceTo(Point3d point) {
        return Math.sqrt(
            Math.pow((point.xCoord - this.xCoord), 2) + 
            Math.pow((point.yCoord - this.yCoord), 2) + 
            Math.pow((point.zCoord - this.zCoord), 2));
    }

}
