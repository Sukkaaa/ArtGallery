package org.xproce.projetartist.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.xproce.projetartist.dao.entities.Review;
import org.xproce.projetartist.dao.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewManagerMetier implements ReviewManager{

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review saveReview(Review review) {
        reviewRepository.save(review);
        return review;

    }

    @Override
    public Review findReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }
}
