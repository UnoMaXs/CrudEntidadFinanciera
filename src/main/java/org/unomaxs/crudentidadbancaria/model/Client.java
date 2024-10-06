package org.unomaxs.crudentidadbancaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.unomaxs.crudentidadbancaria.enums.IdType;

import java.sql.Date;
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
    private IdType idType;
    private Long idNumber;
    private String name;
    private String surname;
    private String email;
    private LocalDateTime dateOfBirth;
    private LocalDateTime creationDate;
    private LocalDateTime lastModified;

}
