package dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    private String adress;
    @OneToMany(mappedBy = "user")
   private List<ArtPiece> purchaseHistory;
    @OneToMany(mappedBy = "user")
   private List<ArtPiece> favoriteArtworks;
}
