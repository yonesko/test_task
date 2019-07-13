package glebio.bank.data;

import java.util.UUID;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * @author Gleb Danichev
 */
public class Account {

    private final UUID id = UUID.randomUUID();

    private long cents;

    public UUID getId() {
        return id;
    }

    public long getCents() {
        return cents;
    }

    public void setCents(long cents) {
        this.cents = cents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return cents == account.cents && Objects.equal(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, cents);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("id", id)
            .add("cents", cents)
            .toString();
    }
}
