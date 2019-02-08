package headfirst.command.fernsteuerung;

public class VentilatorAusBefehl implements Befehl {
	Ventilator ventilator;

	public VentilatorAusBefehl(Ventilator ventilator) {
		this.ventilator = ventilator;
	}
	public void ausf�hren() {
		ventilator.aus();
	}
}
