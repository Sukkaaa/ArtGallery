package metier;

import dao.entities.ArtPiece;
import dao.entities.Artist;
import org.hibernate.query.Page;

public interface ArtistManager {
   public Artist createArtist(Artist artist);
   public Artist updateArtist(Artist artist);
   public boolean deleteArtist(Long id);



}
