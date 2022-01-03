package org.wecancoeit.reviews;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(101L, "Year1", "image1", "1", "0-16", "Winless", "blah blah");
    private Review reviewTwo = new Review(102L, "Year2", "image2", "2", "1-15", "Almost Winless", "blah blah blah");

    @Test
    public void shouldFindReviewOne() {
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(101L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);

    }
}
