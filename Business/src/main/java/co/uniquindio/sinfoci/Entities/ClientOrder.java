package co.uniquindio.sinfoci.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
public class ClientOrder {

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
    private Float price;

    //RELATIONSHIPS

    @ManyToMany
    @ToString.Exclude
    List<Client> clients;

    @OneToMany(mappedBy = "order")
    @ToString.Exclude
    List<ProductDetail> productDetail;

    @Builder
    public ClientOrder(Integer id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
