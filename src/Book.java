class Book {
    String title;
    String author;
    boolean isSeries;
    String publisher;
    double price;
    int noOfPages;
    double peoplesRate;

    Book(String tit, String auth, boolean series, double pri, String pub, int pages, double rate){
        title=tit;
        author=auth;
        isSeries=series;
        publisher=pub;
        price=pri;
        noOfPages=pages;
        peoplesRate=rate;

    }
}
