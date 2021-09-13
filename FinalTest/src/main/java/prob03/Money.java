package prob03;

import java.util.Objects;

public class Money {
	private int amount;

	Money(int amount) {
		setAmount(amount);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add(Money m) {
		return new Money(getAmount() + m.getAmount());
	}

	public Money minus(Money m) {
		return new Money(getAmount() - m.getAmount());
	}

	public Money multiply(Money m) {
		return new Money(getAmount() * m.getAmount());
	}

	public Money devide(Money m) {
		return new Money(getAmount() / m.getAmount());
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		return amount == other.amount;
	}

}
