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

public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToMany
    List<ArtPiece> artPiecesStock;
}
