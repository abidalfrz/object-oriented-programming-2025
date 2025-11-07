package SalesItemTesting.test;
import org.junit.jupiter.api.Test;

import SalesItemTesting.Comment;
import SalesItemTesting.SalesItem;

import static org.junit.jupiter.api.Assertions.*;

public class SalesItemTest {

    @Test
    public void testAddValidComment() {
        SalesItem item = new SalesItem("Laptop", 15000000);
        boolean result = item.addComment("Antony", "Good", 5);
        assertTrue(result);
        assertEquals(1, item.getNumberOfComments());
    }

    @Test
    public void testRejectInvalidRating() {
        SalesItem item = new SalesItem("Ipong", 10000000);
        boolean result = item.addComment("Abid", "Nice!!", 10);
        assertFalse(result);
        assertEquals(0, item.getNumberOfComments());
    }

    @Test
    public void testRejectDuplicateAuthor() {
        SalesItem item = new SalesItem("Laptop", 15000000);
        item.addComment("Antony", "Good", 5);
        boolean result = item.addComment("Antony", "I like it", 4);
        assertFalse(result);
        assertEquals(1, item.getNumberOfComments());
    }

    @Test
    public void testUpvoteComment() {
        SalesItem item = new SalesItem("Laptop", 15000000);
        item.addComment("Abid", "Excellent laptop!!", 5);
        item.upvoteComment(0);
        Comment comment = item.findMostHelpfulComment();
        assertEquals(1, comment.getVoteCount());
    }

    @Test
    public void testFindMostHelpfulComment() {
        SalesItem item = new SalesItem("Laptop", 150000);
        item.addComment("Bid", "OK", 3);
        item.addComment("Bida", "Nice", 5);
        item.upvoteComment(1);
        item.upvoteComment(1);

        Comment best = item.findMostHelpfulComment();
        assertEquals("Bida", best.getAuthor());
        assertEquals(2, best.getVoteCount());
    }
}