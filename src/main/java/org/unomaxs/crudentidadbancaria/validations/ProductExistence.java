package org.unomaxs.crudentidadbancaria.validations;

import org.unomaxs.crudentidadbancaria.model.Client;

public class ProductExistence {

    public static void validateProduct(Client client) {
        if (client.getProduct() != null) {
            throw new IllegalStateException("El Cliente tiene un producto y no puede ser eliminado");
        };
    }
}
