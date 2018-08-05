package bank.model;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("simple")
public class SimpleAccount extends Account{

    public SimpleAccount(String id, String name, int solde, String type) {
        super(id, name, solde, type);
    }
}
