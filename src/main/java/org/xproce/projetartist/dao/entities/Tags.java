package dao.entities;

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
    private List<ArtPiece> artPieces;
}
