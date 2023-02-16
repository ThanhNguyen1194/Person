public class Programer extends Person{
    private String companyName;

    public Programer() {
    }

    public Programer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public  void coding(){
        System.out.println("coding");
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("name=").append(getName());
        sb.append(", designation=").append(getDesignation());
        sb.append(", band Name=").append(getCompanyName());
        sb.append('}');
        return sb.toString();
    }
}
