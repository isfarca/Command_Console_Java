package headfirst.command.party;

public class StereoAnlageEinBefehl implements Befehl {
	StereoAnlage stereo;

	public StereoAnlageEinBefehl(StereoAnlage stereo) {
		this.stereo = stereo;
	}

	public void ausf�hren() {
		stereo.ein();
	}

	public void r�ckg�ngig() {
		stereo.aus();
	}
}
