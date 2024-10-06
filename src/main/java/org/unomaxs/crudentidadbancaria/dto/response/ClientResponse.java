package org.unomaxs.crudentidadbancaria.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.unomaxs.crudentidadbancaria.enums.IdType;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {

    private IdType idType;
    private Long idNumber;
    private String name;
    private String surname;
    private String email;
    private Date dateOfBirth;
    private Date creationDate;
    private Date lastModified;

}
