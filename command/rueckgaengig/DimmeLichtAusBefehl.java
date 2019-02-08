package headfirst.command.rueckgaengig;

public class DimmeLichtAusBefehl implements Befehl {
	Licht licht;
	int vorherigeStufe;

	public DimmeLichtAusBefehl(Licht licht) {
		this.licht = licht;
		vorherigeStufe = 100;
	}

	public void ausf�hren() {
		vorherigeStufe = licht.getStufe();
		licht.aus();
	}

	public void r�ckg�ngig() {
		licht.dimmen(vorherigeStufe);
	}
}
