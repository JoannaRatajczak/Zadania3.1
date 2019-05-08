public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Fire and blood, part 1", "George R.R. Martin", true, 59.90, "Zysk i S-KA", 614, 8.8);
        System.out.printf("First book: %s, written by %s \n", book1.title, book1.author);
        System.out.println("Is it a part of the series? " + book1.isSeries);
        System.out.printf("You can buy it for the price of %.2f in the bookstore authorized by %s \n", book1.price, book1.publisher);
        System.out.printf("Shortly about the book: %d pages, with reader's rate %.1f \n \n", book1.noOfPages, book1.peoplesRate);


        Book book2 = new Book("Java", "Cay S. Horstmann", false, 99.90, "Helion", 871, 7.1 );
        System.out.printf("First book: %s, written by %s \n", book2.title, book2.author);
        System.out.println("Is it a part of the series? " + book2.isSeries);
        System.out.printf("You can buy it for the price of %.2f in the bookstore authorized by %s \n", book2.price, book2.publisher);
        System.out.printf("Shortly about the book: %d pages, with reader's rate %.1f", book2.noOfPages, book2.peoplesRate);




    }
}
