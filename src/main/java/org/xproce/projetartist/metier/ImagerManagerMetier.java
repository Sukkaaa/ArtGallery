package metier;

import dao.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagerManagerMetier implements ImageManager {

    @Autowired
    private ImageRepository imageRepository;
}
