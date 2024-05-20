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

public class ArtPiece {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String title;
    @ManyToOne
    private Artist artist;
    private String medium;
    private String dimensions;
    private String description;
    private double price;
    private boolean available;
    @ManyToMany(mappedBy = "artpiece",fetch =FetchType.LAZY)
    private List<Tags> tags;
    @OneToMany(mappedBy = "artpiece",fetch=FetchType.LAZY)
   private List<Image> images; //url for the images //retrieve image from url and display
    @ManyToOne
    private User buyer;
    @ManyToOne
    private User favoritedBy;


}
