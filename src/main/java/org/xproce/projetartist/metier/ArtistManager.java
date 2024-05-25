package org.xproce.projetartist.metier;

import org.springframework.data.domain.Page;
import org.xproce.projetartist.dao.entities.Artist;

import java.util.List;

public interface ArtistManager {
   public Artist createArtist(Artist artist);
   public Artist updateArtist(Artist artist);
   public boolean deleteArtist(Long id);
   public List<Artist> findAll();
   public Page<Artist> searchArtist(String name,int page, int size);


}
