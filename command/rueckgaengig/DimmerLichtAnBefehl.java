package headfirst.command.rueckgaengig;

public class DimmerLichtAnBefehl implements Befehl {
	Licht licht;
	int vorherigeStufe;

	public DimmerLichtAnBefehl(Licht licht) {
		this.licht = licht;
	}

	public void ausf�hren() {
		vorherigeStufe = licht.getStufe();
		licht.dimmen(75);
	}

	public void r�ckg�ngig() {
		licht.dimmen(vorherigeStufe);
	}
}
