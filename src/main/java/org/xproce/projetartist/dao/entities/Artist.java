package dao.entities;

import jakarta.persistence.*;
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
    private String name;
    private String bio;
    @OneToMany(mappedBy = "artist",fetch = FetchType.LAZY)
    private List<Review> reviews;
    @OneToMany(mappedBy = "artist",fetch=FetchType.LAZY)
    private List<ArtPiece> artPieces;
    private String location;


}

