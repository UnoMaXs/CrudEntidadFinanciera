package org.unomaxs.crudentidadbancaria.validations;

import org.unomaxs.crudentidadbancaria.model.Client;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AgeValidation {

    public static void validateAge(Client client) {
        LocalDateTime today = LocalDateTime.now();
        long years = ChronoUnit.YEARS.between(client.getDateOfBirth(), today);

        if (years < 18) {
            throw new IllegalArgumentException("El cliente debe ser mayor de edad.");
        }
    }

}
