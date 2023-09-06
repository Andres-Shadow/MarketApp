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
public class Client {

    //TABLE FIELDS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    private Integer ID;
    @Column(nullable = false, length = 100)
    @ToString.Include
    private String name;
    @Column(nullable = false, length = 100)
    @ToString.Include
    private String surname;

    //RELATIONSHIPS
    @ManyToMany(mappedBy = "clients")
    List<ClientOrder> orders;
}
