package headfirst.command.party;

public class FernseherAnBefehl implements Befehl {
	Fernseher fernseher;

	public FernseherAnBefehl(Fernseher fernseher) {
		this.fernseher= fernseher;
	}

	public void ausf�hren() {
		fernseher.ein();
		fernseher.setSender();
	}

	public void r�ckg�ngig() {
		fernseher.aus();
	}
}
