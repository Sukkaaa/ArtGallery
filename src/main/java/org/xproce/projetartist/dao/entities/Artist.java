package org.xproce.projetartist.dao.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Artist{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    private String name;
    private String bio;
    @OneToMany(mappedBy = "artist",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Review> reviews;
    @OneToMany(mappedBy = "artist",cascade = CascadeType.ALL)
    private List<ArtPiece> artPieces;

    private String image;//photo de l'artiste
    private String location;


}

