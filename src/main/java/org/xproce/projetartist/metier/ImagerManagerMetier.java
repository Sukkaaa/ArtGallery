package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.Image;
import org.xproce.projetartist.dao.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagerManagerMetier implements ImageManager {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image addImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Image updateImage(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Boolean deleteImage(Long id) {
       try{
           imageRepository.deleteById(id);
           return true;
       }
       catch(Exception exception){
           return false;
       }
    }
}
