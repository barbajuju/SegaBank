package bank.model;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("paid")
public class PaidAccount extends Account{

    public PaidAccount(String id, String name, int solde, String type) {
        super(id, name, solde, type);
    }
}
