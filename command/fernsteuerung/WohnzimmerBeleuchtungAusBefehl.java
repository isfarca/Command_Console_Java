package headfirst.command.fernsteuerung;

public class WohnzimmerBeleuchtungAusBefehl implements Befehl {
	Licht licht;

	public WohnzimmerBeleuchtungAusBefehl(Licht licht) {
		this.licht = licht;
	}

	public void ausf�hren() {
		licht.aus();
	}
}
