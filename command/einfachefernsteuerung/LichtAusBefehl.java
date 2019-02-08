package headfirst.command.einfachefernsteuerung;

public class LichtAusBefehl implements Befehl {
	Licht licht;
 
	public LichtAusBefehl(Licht licht) {
		this.licht = licht;
	}
 
	public void ausf�hren() {
		licht.aus();
	}
}
