package headfirst.command.fernsteuerung;

public class LichtAnBefehl implements Befehl {
	Licht licht;

	public LichtAnBefehl(Licht licht) {
		this.licht = licht;
	}

	public void ausf�hren() {
		licht.ein();
	}
}
