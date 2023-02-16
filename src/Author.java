public class Author {
    String name;
    String email;
    char gender;

    public Author() {
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public String toString(){
        final StringBuilder str = new StringBuilder("Author[");
        str.append("name= ").append(name).append(",email= ").append(email);
        str.append(", gender=").append(gender).append("]");
        return  str.toString();
    }
}
