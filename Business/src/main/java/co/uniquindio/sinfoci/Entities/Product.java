package co.uniquindio.sinfoci.Entities;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
public class Product {

    //TABLE FIELDS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    private Integer id;
    @Column(nullable = false, length = 100)
    @ToString.Include
    private String name;
    @Column(nullable = false)
    @ToString.Include
    private float price;

    //RELATIONSHIPS

    @OneToOne(mappedBy = "product")
    private ProductDetail detail;


}
