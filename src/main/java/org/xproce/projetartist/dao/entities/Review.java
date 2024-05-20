package dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int rating;
    private String title;
    private String text;
    private Date timestamp;
    private boolean verifiedPurchase;


}
