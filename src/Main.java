public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Fire and blood, part 1";
        book1.author = "George R.R. Martin";
        book1.isSeries = true;
        book1.price = 59.90;
        book1.publisher = "Zysk i S-KA";
        book1.noOfPages=614;
        book1.peoplesRate=8.8;

        System.out.printf("First book: %s, written by %s \n", book1.title, book1.author);
        System.out.println("Is it a part of the series? " + book1.isSeries);
        System.out.printf("You can buy it for the price of %.2f in the bookstore authorized by %s \n", book1.price, book1.publisher);
        System.out.printf("Shortly about the book: %d pages, with reader's rate %.1f \n \n", book1.noOfPages, book1.peoplesRate);

        Book book2 = new Book();
        book2.title = "Java";
        book2.author = "Cay S. Horstmann";
        book2.isSeries = true;
        book2.price = 99.90;
        book2.publisher = "Helion";
        book2.noOfPages=871;
        book2.peoplesRate=7.1;

        System.out.printf("First book: %s, written by %s \n", book2.title, book2.author);
        System.out.println("Is it a part of the series? " + book2.isSeries);
        System.out.printf("You can buy it for the price of %.2f in the bookstore authorized by %s \n", book2.price, book2.publisher);
        System.out.printf("Shortly about the book: %d pages, with reader's rate %.1f", book2.noOfPages, book2.peoplesRate);




    }
}
