package headfirst.command.rueckgaengig;

public class VentilatorSchnellBefehl implements Befehl {
	Ventilator ventilator;
	int letzteGeschwindigkeit;
  
	public VentilatorSchnellBefehl(Ventilator ventilator) {
		this.ventilator = ventilator;
	}
 
	public void ausf�hren() {
		letzteGeschwindigkeit = ventilator.getGeschwindigkeit();
		ventilator.schnell();
	}
 
	public void r�ckg�ngig() {
		if (letzteGeschwindigkeit == Ventilator.SCHNELL) {
			ventilator.schnell();
		} else if (letzteGeschwindigkeit == Ventilator.MITTEL) {
			ventilator.mittel();
		} else if (letzteGeschwindigkeit == Ventilator.LANGSAM) {
			ventilator.langsam();
		} else if (letzteGeschwindigkeit == Ventilator.AUS) {
			ventilator.aus();
		}
	}
}
