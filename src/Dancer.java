public class Dancer extends Person{
   private String groupName;

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public  void dancing(){
        System.out.println("dancing");
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("name=").append(getName());
        sb.append(", designation=").append(getDesignation());
        sb.append(", band Name=").append(getGroupName());
        sb.append('}');
        return sb.toString();
    }
}
