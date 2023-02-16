public class Book {
    String name;
    Author author;
    double price;
    int qty = 0;

    public Book() {
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){
        final StringBuilder str = new StringBuilder("Book[");
        str.append("name= ").append(name).append(",Author[").append("name=");
        str.append(author.name).append(",email=").append(author.email);
        str.append(",gender=").append(author.gender).append("]");
        str.append(",price=").append(price).append(",qty=").append(qty).append("]");
        return  str.toString();
    }
}
