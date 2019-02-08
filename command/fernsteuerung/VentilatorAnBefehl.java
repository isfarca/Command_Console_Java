package headfirst.command.fernsteuerung;

public class VentilatorAnBefehl implements Befehl {
	Ventilator ventilator;

	public VentilatorAnBefehl(Ventilator ventilator) {
		this.ventilator = ventilator;
	}
	public void ausf�hren() {
		ventilator.schnell();
	}
}
