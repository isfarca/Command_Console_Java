package headfirst.command.party;

public class StereoAnlageAnFuerCD implements Befehl {
	StereoAnlage stereo;
 
	public StereoAnlageAnFuerCD(StereoAnlage stereo) {
		this.stereo = stereo;
	}
 
	public void ausf�hren() {
		stereo.ein();
		stereo.setCD();
		stereo.setLautst�rke(11);
	}

	public void r�ckg�ngig() {
		stereo.aus();
	}
}
