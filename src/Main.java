public class Main {
    public static void main(String[] args) {

        ObjectsAndClasses();
        MethodsOfObjects();

    }

    public static void ObjectsAndClasses() {
        System.out.println();
        Author alexandreDumas = new Author("Alexandre", "Dumas");
        Book firstBook = new Book("The Count of Monte Cristo", alexandreDumas, 1845);
        Author jackLondon = new Author("Jack", " London");
        Book secondBook = new Book("Love of live", jackLondon, 1907);
        System.out.println(firstBook.getBookName() + ", " + firstBook.getAuthor() + ", " + firstBook.getPublishYear());
    }

    public static void MethodsOfObjects() {
        System.out.println("Authors:");
        Author alexandreDumas = new Author("Alexandre", "Dumas");
        Author alexandreDumas2 = new Author("Alexandre", "Dumas");
        Author jackLondon = new Author("Jack", "London");
        System.out.println("Authors copies equal: " + alexandreDumas.equals(alexandreDumas2));
        System.out.println("Authors copies equal by hashcode: " + (alexandreDumas.hashcode() == alexandreDumas2.hashcode()));
        System.out.println("Authors equal: " + alexandreDumas.equals(jackLondon));
        System.out.println("Authors equal by hashcode: " + (alexandreDumas.hashcode() == jackLondon.hashcode()));
        System.out.println(alexandreDumas);
        System.out.println(jackLondon);

        System.out.println();
        System.out.println("Books:");
        Author scottFitzgerald = new Author("Scott", "Fitzgerald");
        Author julesVerne =new Author("jules", "julesVerne");
        Book theGreatGatsby = new Book("The Great Gatsby", scottFitzgerald, 1925);
        Book theGreatGatsby2 = new Book("The Great Gatsby", scottFitzgerald, 1925);
        Book theCapitanNemo = new Book("The Capitan Nemo", julesVerne, 1870);
        System.out.println("Books copies equal: " + theGreatGatsby.equals(theGreatGatsby2));
        System.out.println("Books copies equal by hashcode: " + (theGreatGatsby.hashcode() == theGreatGatsby2.hashcode()));
        System.out.println("Books equal: " + theGreatGatsby.equals(theCapitanNemo));
        System.out.println("Books equal by hashcode: " + (theGreatGatsby.hashcode() == theCapitanNemo.hashcode()));
        System.out.println(theGreatGatsby);
        System.out.println(theCapitanNemo);

    }
}