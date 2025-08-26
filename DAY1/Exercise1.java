class book {
    String tittle;
    String Author;
}

public class Exercise1 {
    public static void main(String[] args) {
        // Create an array to hold 3 book objects
        book books[] = new book[3];
        
        // Initialize each element of the array with a new book object
        for (int i = 0; i < books.length; i++) {
            books[i] = new book();
        }

        // Assign values to the first book object
        books[0].tittle = "The 4-Hour Workweek";
        books[0].Author = "Tim Ferris";

        // Assign values to the second and third book objects
        books[1].tittle = "The Hobbit";
        books[1].Author = "J.R.R. Tolkien";
        
        books[2].tittle = "1984";
        books[2].Author = "George Orwell";
        
        // Loop through the array and print the details of each book
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].tittle + " by " + books[i].Author);
        }
    }
}