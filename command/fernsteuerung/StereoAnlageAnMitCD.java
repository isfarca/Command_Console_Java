package headfirst.command.fernsteuerung;

public class StereoAnlageAnMitCD implements Befehl {
	StereoAnlage stereo;
 
	public StereoAnlageAnMitCD(StereoAnlage stereo) {
		this.stereo = stereo;
	}
 
	public void ausf�hren() {
		stereo.ein();
		stereo.setCD();
		stereo.setLautst�rke(11);
	}
}
