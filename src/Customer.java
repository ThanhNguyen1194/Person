public class Customer {
    int id;
    String name;
    int discount;

    public Customer() {
    }

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    public String toString(){
        final StringBuilder str = new StringBuilder("");
        str.append(name).append("(").append(id).append(")").append("(discount ").append(discount);
        str.append("%)");
        return  str.toString();
    }
}
