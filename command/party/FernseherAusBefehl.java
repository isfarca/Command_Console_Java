package headfirst.command.party;

public class FernseherAusBefehl implements Befehl {
	Fernseher fernseher;

	public FernseherAusBefehl(Fernseher fernseher) {
		this.fernseher= fernseher;
	}

	public void ausf�hren() {
		fernseher.aus();
	}

	public void r�ckg�ngig() {
		fernseher.ein();
	}
}
