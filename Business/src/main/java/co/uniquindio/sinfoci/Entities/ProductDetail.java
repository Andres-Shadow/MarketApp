package co.uniquindio.sinfoci.Entities;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
public class ProductDetail {

    //TABLE FIELDS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    private Integer id;
    @Column(nullable = false)
    @ToString.Include
    private Integer amount;
    @Column(nullable = false)
    @ToString.Include
    private Integer finalPrice;

    //RELATIONSHIPS

    @ManyToOne
    private ClientOrder order;

    @OneToOne
    private Product product;

}
