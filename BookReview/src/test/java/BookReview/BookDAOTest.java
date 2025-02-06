package BookReview;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.print.Book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import dao.Bookdao;
import daoimpl.Bookdaoimpl;

public class BookDAOTest {

    private Bookdao bookDao;

    @BeforeEach
    public void setUp() {
        bookDao = Mockito.mock(Bookdaoimpl.class); // Mocking Bookdaoimpl
    }

    @Test
    public void testInsertBook() {
        // Arrange: Create a mock book object
        model.Book book = new model.Book(1, "Test Book", "Test Author", "Fiction", "Test Publisher", 2025, "A test book.");

        // Act: Mock the behavior of insertBook() to return true
        Mockito.when(bookDao.insertBook(book)).thenReturn(true);

        // Assert: Verify that insertBook returns true when the book is inserted
        assertTrue(bookDao.insertBook(book), "Book should be inserted successfully.");
    }
}