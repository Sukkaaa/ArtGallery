package org.xproce.projetartist;

import org.springframework.context.annotation.Bean;
import org.xproce.projetartist.dao.entities.ArtPiece;
import org.xproce.projetartist.dao.entities.Artist;
import org.xproce.projetartist.dao.repositories.ArtPieceRepository;
import org.xproce.projetartist.dao.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ProjetArtistApplication implements CommandLineRunner {
String opc="Oil Painting on Canvas";
    @Autowired
    public ArtistRepository artistRepository;

    @Autowired
    public ArtPieceRepository artPieceRepository;
    public static void main(String[] args)
    {
        SpringApplication.run(ProjetArtistApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {


        Artist artist=new Artist();
        artist.setName("UV");
        artist.setBio("A 21 year old artist stuck between reality and fantasy (Also the creator of this website ");
        artist.setImage("https://p16-va.lemon8cdn.com/tos-maliva-v-ac5634-us/o0wtAbQ9AN0E9APiRCAZiClb0WU0ULU1VBIji~tplv-tej9nj120t-origin.webp");
        artistRepository.save(artist);

        Artist artist1=new Artist();
        artist1.setName("Pablo Picasso ");
        artist1.setBio("🎨Creative Visionary | Master of Modern Art |  Co-founder of Cubism |  Surrealist Pioneer |  Museo Picasso Málaga | Spaniard in Paris | ");
        artist1.setImage("https://cdn.britannica.com/63/59963-050-C03F29B9/Pablo-Picasso.jpg");
        artistRepository.save(artist1);

        Artist artist2 = new Artist();
        artist2.setName("Vincent van Gogh");
        artist2.setBio("🌻Post-Impressionist Painter | Starry Night | Sunflowers | The Potato Eaters | Self-Portraits | Mental Health Advocate |");
        artist2.setImage("https://cdn.britannica.com/36/69636-050-81A93193/Self-Portrait-artist-panel-board-Vincent-van-Gogh-1887.jpg");
        artistRepository.save(artist2);

        Artist artist3 = new Artist();
        artist3.setName("Leonardo da Vinci");
        artist3.setBio("Polymath | Mona Lisa | The Last Supper | Vitruvian Man | Inventor | Scientist | Architect |");
        artist3.setImage("https://hips.hearstapps.com/hmg-prod/images/portrait-of-leonardo-da-vinci-1452-1519-getty.jpg");
        artistRepository.save(artist3);

        Artist artist4 = new Artist();
        artist4.setName("Claude Monet");
        artist4.setBio("🎨 Impressionist Painter | Water Lilies | Rouen Cathedral Series | Japanese Bridge | Founder of French Impressionism |");
        artist4.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Claude_Monet_1899_Nadar_crop.jpg/640px-Claude_Monet_1899_Nadar_crop.jpg");
        artistRepository.save(artist4);

        Artist artist5 = new Artist();
        artist5.setName("Salvador Dalí");
        artist5.setBio("✏️ Surrealist Artist | The Persistence of Memory | Dream-like Imagery | Eccentric Personality | Mustache |");
        artist5.setImage("https://assets.artworkarchive.com/image/upload/t_jpg_large/v1605300238/user_43577/contact_images/dahli_x4uneu.jpg");
        artistRepository.save(artist5);

        Artist artist6 = new Artist();
        artist6.setName("Georgia O'Keeffe");
        artist6.setBio("🎨 Modernist Painter | Flowers | New Mexico Landscapes | Precisionist Style | Alfred Stieglitz | Feminist Icon |");
        artist6.setImage("https://www.okeeffemuseum.org/wp-content/uploads/2022/04/2003-1-1-600x753-1.jpg");
        artistRepository.save(artist6);

        Artist artist7 = new Artist();
        artist7.setName("Michelangelo");
        artist7.setBio("🏛️ Renaissance Sculptor | Sistine Chapel Ceiling | David | Pieta | Architect | Poet |");
        artist7.setImage("https://cdn.britannica.com/46/75046-050-0973B0E8/Michelangelo.jpg");
        artistRepository.save(artist7);

        Artist artist8 = new Artist();
        artist8.setName("Rembrandt");
        artist8.setBio("🇳🇱 Dutch Master | The Night Watch | The Anatomy Lesson of Dr. Nicolaes Tulp | Self-Portraits | Etchings |");
        artist8.setImage("https://cdn.britannica.com/82/190482-050-33D2C4C5/Self-Portrait-canvas-Rembrandt-van-Rijn-Washington-DC.jpg");
        artistRepository.save(artist8);

        Artist artist9 = new Artist();
        artist9.setName("Frida Kahlo");
        artist9.setBio("🇲🇽 Mexican Artist | Self-Portraits | Surrealism | Political Activism | The Two Fridas | Diego Rivera |");
        artist9.setImage("https://artboxexperience.com/wp-content/uploads/2024/01/frida-kahlo-wystawa-warszawa-art-box-experience.jpg");
        artistRepository.save(artist9);

        Artist artist10 = new Artist();
        artist10.setName("Johannes Vermeer");
        artist10.setBio("🇳🇱 Dutch Golden Age Painter | Girl with a Pearl Earring | The Milkmaid | Genre Scenes | Delft Master |");
        artist10.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Cropped_version_of_Jan_Vermeer_van_Delft_002.jpg/640px-Cropped_version_of_Jan_Vermeer_van_Delft_002.jpg");
        artistRepository.save(artist10);


        ArtPiece art1 = new ArtPiece();
        art1.setArtist(artist1);
        art1.setTitle("Guernica");
        art1.setDescription("Pablo Picasso's 'Guernica' depicts the horrors of war with stark imagery and profound symbolism.");
        art1.setMedium("Oil Painting");
        art1.setDimensions("349 cm × 776 cm");
        art1.setPrice(BigDecimal.valueOf(200000000));
        art1.setImage("https://upload.wikimedia.org/wikipedia/en/thumb/7/74/PicassoGuernica.jpg/400px-PicassoGuernica.jpg");
        artPieceRepository.save(art1);


        ArtPiece art11 = new ArtPiece();
        art11.setArtist(artist2);
        art11.setTitle("Starry Night");
        art11.setDescription("Van Gogh's 'Starry Night' captivates with swirling colors and dreamlike imagery.");
        art11.setMedium(opc);
        art11.setDimensions("73.7 cm × 92.1 cm");
        art11.setPrice(BigDecimal.valueOf(200000000));
        art11.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTK_fDw2BwRYJa-nzmGmeHsFQOg7HA_-KmfcL--f-bMSg&s");
        artPieceRepository.save(art11);


        ArtPiece art2 = new ArtPiece();
        art2.setArtist(artist3);
        art2.setTitle("Mona Lisa");
        art2.setDescription("Da Vinci's 'Mona Lisa' is an enigmatic portrait that continues to intrigue viewers.");
        art2.setMedium("Oil Painting on Poplar Panel");
        art2.setDimensions("77 cm × 53 cm");
        art2.setPrice(BigDecimal.valueOf(1000000000));
        art2.setImage("https://ichef.bbci.co.uk/images/ic/480xn/p096q1j7.jpg.webp");
        artPieceRepository.save(art2);


        ArtPiece art3 = new ArtPiece();
        art3.setArtist(artist4);
        art3.setTitle("Water Lilies");
        art3.setDescription("Monet's 'Water Lilies' series captures the ephemeral beauty of nature with vibrant colors.");
        art3.setMedium(opc);
        art3.setDimensions("Various sizes");
        art3.setPrice(BigDecimal.valueOf(70400000));
        art3.setImage("https://collectionapi.metmuseum.org/api/collection/v1/iiif/438008/preview");
        artPieceRepository.save(art3);


        ArtPiece art4 = new ArtPiece();
        art4.setArtist(artist5);
        art4.setTitle("The Persistence of Memory");
        art4.setDescription("Dalí's 'Persistence of Memory' challenges perceptions of time and reality with surreal imagery.");
        art4.setMedium(opc);
        art4.setDimensions("24 cm × 33 cm");
        art4.setPrice(BigDecimal.valueOf(150000000));
        art4.setImage("https://cdn.britannica.com/96/240496-138-66D89FAD/Salvador-Dali-Persistence-of-Memory.jpg?w=800&h=450&c=crop");
        artPieceRepository.save(art4);


        ArtPiece art5 = new ArtPiece();
        art5.setArtist(artist6);
        art5.setTitle("Red Canna");
        art5.setDescription("O'Keeffe's 'Red Canna' celebrates nature's beauty with vibrant colors and bold strokes.");
        art5.setMedium(opc);
        art5.setDimensions("40.7 cm × 30.5 cm");
        art5.setPrice(BigDecimal.valueOf(44405000));
        art5.setImage("https://upload.wikimedia.org/wikipedia/en/c/ca/Red_Canna_%281924%29_by_Georgia_O%27Keeffe.jpg");
        artPieceRepository.save(art5);


        ArtPiece art6 = new ArtPiece();
        art6.setArtist(artist7);
        art6.setTitle("David");
        art6.setDescription("Michelangelo's 'David' is a masterpiece of Renaissance sculpture, celebrated for its idealized beauty.");
        art6.setMedium("Marble Sculpture");
        art6.setDimensions("517 cm × 199 cm");
        art6.setPrice(BigDecimal.valueOf(24318343));
        art6.setImage("https://www.visittuscany.com/shared/visittuscany/immagini/blogs/idea/david-michelangelo-big.jpg?__scale=w:1920,h:1000,t:2,q:85");
        artPieceRepository.save(art6);


        ArtPiece art7 = new ArtPiece();
        art7.setArtist(artist8);
        art7.setTitle("The Night Watch");
        art7.setDescription("Rembrandt's 'The Night Watch' epitomizes the drama and dynamism of Baroque painting, capturing civic guardsmen in vivid detail.");
        art7.setMedium(opc);
        art7.setDimensions("363 cm × 437 cm");
        art7.setId(Long.valueOf(500000000));
        art7.setImage("https://ychef.files.bbci.co.uk/1280x720/p070wbmx.jpg");
        artPieceRepository.save(art7);


        ArtPiece art8 = new ArtPiece();
        art8.setArtist(artist9);
        art8.setTitle("Self-Portrait with Thorn Necklace and Hummingbird");
        art8.setDescription("Frida Kahlo's 'Self-Portrait with Thorn Necklace and Hummingbird' reflects her pain, resilience, and indomitable spirit.");
        art8.setMedium(opc);
        art8.setDimensions("61 cm × 47 cm");
        art8.setPrice(BigDecimal.valueOf(34500000));
        art8.setImage("https://upload.wikimedia.org/wikipedia/en/1/1e/Frida_Kahlo_%28self_portrait%29.jpg");
        artPieceRepository.save(art8);


        ArtPiece art9 = new ArtPiece();
        art9.setArtist(artist10);
        art9.setTitle("Girl with a Pearl Earring");
        art9.setDescription("Johannes Vermeer's 'Girl with a Pearl Earring' captivates viewers with a young woman's mesmerizing gaze.");
        art9.setMedium(opc);
        art9.setDimensions("44.5 cm × 39 cm");
        art9.setPrice(BigDecimal.valueOf(300000000));
        art9.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/1665_Girl_with_a_Pearl_Earring.jpg/800px-1665_Girl_with_a_Pearl_Earring.jpg");
        artPieceRepository.save(art9);
    }
}
