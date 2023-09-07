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
    @ToString.Exclude
    private ProductDetail detail;

    @Builder
    public Product(Integer id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
