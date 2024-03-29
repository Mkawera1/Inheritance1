public class Book extends Product {
    private String author;
    private int pages;

    public Book() {
    }

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "Author:                " + getAuthor() + "\n" +
                "Pages:              " + getPages() + "\n";
    }

}

