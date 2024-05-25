package org.xproce.projetartist.metier;

import org.xproce.projetartist.dao.entities.Image;

public interface ImageManager {
    public Image addImage(Image image);
    public Image updateImage(Image image);
    public Boolean deleteImage(Long id);

}
