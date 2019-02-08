package headfirst.command.party;

public class WohnzimmerLichtAusBefehl implements Befehl {
	Licht licht;

	public WohnzimmerLichtAusBefehl(Licht licht) {
		this.licht = licht;
	}
	public void ausf�hren() {
		licht.aus();
	}
	public void r�ckg�ngig() {
		licht.ein();
	}
}
