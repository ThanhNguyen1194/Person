public class Invoice {
    int id;
    Customer customer;
    double amount;

    public Invoice() {
    }

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }
    public int getCustomerID() {
        return customer.id;
    }
    public String getCustomerName() {
        return customer.name;
    }
    public int getCustomerDiscount() {
        return customer.discount;
    }
    public double getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmountAffterDiscount(){
        return amount = this.amount * ((100 - customer.discount)*1.0/100);
    }
    public String toString(){
        final StringBuilder str = new StringBuilder("Invoice[id:");
        str.append(id).append(",customer=name(").append(customer.id).append(")").append("(discount ").append(customer.discount);
        str.append("%)").append(",amount=").append(getAmountAffterDiscount()).append("]");
        return  str.toString();
    }
}
