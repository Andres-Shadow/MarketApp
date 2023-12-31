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
    @ToString.Exclude
    private ClientOrder order;

    @OneToOne
    @ToString.Exclude
    private Product product;

    @Builder
    public ProductDetail(Integer id, Integer amount, Integer finalPrice) {
        this.id = id;
        this.amount = amount;
        this.finalPrice = finalPrice;
    }
}
