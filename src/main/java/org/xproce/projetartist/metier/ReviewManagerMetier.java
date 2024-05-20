package metier;

import dao.repositories.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewManagerMetier implements ReviewManager{

    private ReviewRepository reviewRepository;
}
