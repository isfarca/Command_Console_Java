package headfirst.command.fernsteuerung;

public class StereoAnlageAusBefehl implements Befehl {
	StereoAnlage stereo;
 
	public StereoAnlageAusBefehl(StereoAnlage stereo) {
		this.stereo = stereo;
	}
 
	public void ausf�hren() {
		stereo.aus();
	}
}
