package Abstract_ch13;

public final class Utility {
    private StringBuilder name;
    public Utility() {}
    public Utility(StringBuilder name) {
        this.name = name;
    }
    public StringBuilder getName() {
        return name;
    }
    public void setName(StringBuilder name) {
        this.name = name;
    }
    public void appendName(StringBuilder name) {
        this.name.append(name);
    }
    public String toString() {
        return name.toString();
    }
}
