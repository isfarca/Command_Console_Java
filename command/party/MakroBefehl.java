package headfirst.command.party;

public class MakroBefehl implements Befehl {
	Befehl[] befehle;
 
	public MakroBefehl(Befehl[] befehle) {
		this.befehle = befehle;
	}
 
	public void ausf�hren() {
		for (int i = 0; i < befehle.length; i++) {
			befehle[i].ausf�hren();
		}
	}
 
	public void r�ckg�ngig() {
		for (int i = 0; i < befehle.length; i++) {
			befehle[i].r�ckg�ngig();
		}
	}
}

