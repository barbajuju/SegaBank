package bank.model;

import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("saving")
public class SavingAccount extends Account{

    public SavingAccount(String id, String name, int solde, String type) {
        super(id, name, solde, type);
    }
}
