package co.uniquindio.sinfoci.Entities;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
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
}
