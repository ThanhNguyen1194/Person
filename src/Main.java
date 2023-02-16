public class Main {
    public static void main(String[] args) {
//        Singer john = new Singer("John","Singer","helloWorld");
//        Person person = new Person();
//        System.out.println(person);
//        Time time = new Time(8,45,06);
//        time.nextSecond();
//        time.nextSecond();
//        time.previousSecond();
//        System.out.println(time);
//        Ball ball = new Ball(80,35,5,4,6);
//        System.out.println(ball);
//        Author author = new Author("Jack","jack123@gmail.com",'m');
//        Book book = new Book("Dream",author,1000,12);
//        System.out.println(author);
//        System.out.println(book);
        Customer customer = new Customer(12,"John",20);
        System.out.println(customer);
        Invoice invoice = new Invoice(123,customer,1000);
        System.out.println(invoice);
    }
}