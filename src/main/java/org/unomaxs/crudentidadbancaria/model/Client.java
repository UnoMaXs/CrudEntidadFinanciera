package org.unomaxs.crudentidadbancaria.model;

import jakarta.persistence.*;
import lombok.*;
import org.unomaxs.crudentidadbancaria.enums.IdType;
import org.unomaxs.crudentidadbancaria.enums.Product;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Tipo_Id")
    private IdType idType;

    @Column(name = "Numero_Id")
    private Long idNumber;

    @Column(name = "Nombre")
    private String name;

    @Column(name = "Apellido")
    private String surname;

    @Column(name = "Correo")
    private String email;

    @Column(name = "Fecha_Nacimiento")
    private LocalDateTime dateOfBirth;

    @Column(name = "Fecha_Creacion")
    private LocalDateTime creationDate;

    @Column(name = "Fecha_Modificacion")
    private LocalDateTime lastModified;

    @Column(name = "Producto")
    private Product product;

}
