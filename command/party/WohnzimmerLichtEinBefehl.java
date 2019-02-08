package headfirst.command.party;

public class WohnzimmerLichtEinBefehl implements Befehl {
	Licht licht;

	public WohnzimmerLichtEinBefehl(Licht licht) {
		this.licht = licht;
	}
	public void ausf�hren() {
		licht.ein();
	}
	public void r�ckg�ngig() {
		licht.aus();
	}
}
