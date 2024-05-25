package org.xproce.projetartist.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ArtPiece {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    @ManyToOne
    @JoinColumn (name = "artist_id")
    private Artist artist;
    private String medium;
    private String dimensions;
    private String description;
    private BigDecimal price;
    private boolean available;
    @ManyToMany(mappedBy = "artPieces",fetch =FetchType.LAZY)
    private List<Tags> tags;

   private String image; //url for the images //retrieve image from url and display
    @ManyToOne(fetch = FetchType.LAZY)
    private User buyer;
    @ManyToOne(fetch =FetchType.LAZY)
    private User favoritedBy;
    @ManyToOne(fetch = FetchType.LAZY)
    private Inventory inventory;


}
