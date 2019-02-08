package headfirst.command.fernsteuerung;

public class WohnzimmerBeleuchtungAnBefehl implements Befehl {
	Licht licht;

	public WohnzimmerBeleuchtungAnBefehl(Licht licht) {
		this.licht = licht;
	}

	public void ausf�hren() {
		licht.ein();
	}
}
