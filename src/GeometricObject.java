import java.util.Date;

class GeometricObject {
    private String color;
    private boolean filled;
    private Date date;

    public GeometricObject() {
        date = new Date();
        color = "black";
    }

    public GeometricObject(String color, boolean filled) {
        date = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", date=" + date +
                '}';
    }
}
