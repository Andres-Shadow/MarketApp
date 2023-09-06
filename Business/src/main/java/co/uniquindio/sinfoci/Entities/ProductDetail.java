package co.uniquindio.sinfoci.Entities;


import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
