package org.xproce.projetartist.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int frequency; //popularity of the tag
    private String description;
    private int usageCount; //represents the number pf times the tag has been used
    @ManyToMany(fetch =FetchType.LAZY )
    @JoinTable(

            name="artpiece_tag",
            joinColumns = @JoinColumn(name = "tag_id"),
            inverseJoinColumns = @JoinColumn(name = "artpiece_id")
    )
    private List<ArtPiece> artPieces;
}
