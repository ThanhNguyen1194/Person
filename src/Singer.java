public class Singer extends Person{
    private String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println("singing");
    }
    public void playGuitar(){
        System.out.println("play guitar");
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("name=").append(getName());
        sb.append(", designation=").append(getDesignation());
        sb.append(", band Name=").append(getBandName());
        sb.append('}');
        return sb.toString();
    }
}
