package org.unomaxs.crudentidadbancaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.unomaxs.crudentidadbancaria.enums.IdType;

import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private IdType idType;
    private Long idNumber;
    private String name;
    private String surname;
    private String email;
    private Date dateOfBirth;
    private Date creationDate;
    private Date lastModified;

}
