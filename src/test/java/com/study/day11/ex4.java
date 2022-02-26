package com.study.day11;
class Book<E, T>{  // E, T當未知此 field 應定義哪一種型別
    String bookName;
    int bookPrice; 
    E quantity;     // E 當未知此 field 應定義哪一種型別
    T page;         // T 當未知此 field 應定義哪一種型別
    
    public Book(){
        super();
    }
    public Book(String bookName, int bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    public Book(String bookName, int bookPrice, E quantity, T page) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.quantity = quantity;
        this.page = page;
    }
    
    
    public E setBook(E quantity){
        this.quantity = quantity;
        return quantity;
    }
    public void getBook(){
        System.out.printf("書本數量: %d\n", quantity);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public E getQuantity() {
        return quantity;
    }

    public void setQuantity(E quantity) {
        this.quantity = quantity;
    }

    public T getPage() {
        return page;
    }

    public void setPage(T page) {
        this.page = page;
    }       

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", bookPrice=" + bookPrice + ", quantity=" + quantity + ", page=" + page + '}';
    } 
}
        
public class ex4 {
    public static void main(String[] args) {
        Book b1 = new Book("java", 100);
        Book b2 = new Book("python", 200);
        Book b3 = new Book("C#", 300);
        System.out.println("書本: " +  b1.bookName+"\t"+ "價格: " + b1.bookPrice);
        System.out.println("書本: " +  b2.bookName+"\t"+ "價格: " + b2.bookPrice);
        System.out.println("書本: " +  b3.bookName+"\t"+ "價格: " + b3.bookPrice);
        
        Book<Integer, ? super Integer> qtyBook = new Book<>();
        qtyBook.setBook(500);
        qtyBook.getBook();
        
        Book<Integer, Integer> b4 = new Book<>("Windows2000", 1000, 20, 5);
        System.out.println(b4);
    }
}
