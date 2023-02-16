public class Person {
   private String name;
   private String designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public  void learn(){
        System.out.println("learn");
    }
    public  void walk(){
        System.out.println("walk");
    }
    public  void eat(){
        System.out.println("eat");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("name=").append(name);
        sb.append(", designation=").append(designation);
        sb.append('}');
        return sb.toString();
    }
}
