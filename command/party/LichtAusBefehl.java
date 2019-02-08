package headfirst.command.party;

public class LichtAusBefehl implements Befehl {
	Licht licht;

	public LichtAusBefehl(Licht licht) {
		this.licht = licht;
	}

	public void ausf�hren() {
		licht.aus();
	}

	public void r�ckg�ngig() {
		licht.ein();
	}
}
