package org.xproce.projetartist.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table (name = "Users")
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
    @OneToMany(mappedBy = "buyer")
   private List<ArtPiece> purchaseHistory;
    @OneToMany(mappedBy = "favoritedBy")
   private List<ArtPiece> favoriteArtworks;
    @OneToMany(mappedBy = "reviewer")
    private List<Review> reviews;
}
