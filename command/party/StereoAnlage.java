package headfirst.command.party;

public class StereoAnlage {
	String ort;

	public StereoAnlage(String ort) {
		this.ort = ort;
	}

	public void ein() {
		System.out.println(ort + ": Stereoanlage ist an");
	}

	public void aus() {
		System.out.println(ort + ": Stereoanlage ist aus");
	}

	public void setCD() {
		System.out.println(ort + ": Stereoanlage spielt CD");
	}

	public void setDVD() {
		System.out.println(ort + ": Stereoanlage spielt DVD");
	}

	public void setRadio() {
		System.out.println(ort + ": Stereoanlage spielt Radio");
	}

	public void setLautst�rke(int lautst�rke) {
		// Code zum Setzen der Lautst�rke
		// G�ltiger Bereich: 1-11 (11 ist schlie�lich besser als 10, oder?)
		System.out.println(ort + ": Lautst�rke der Stereoanlage gesetzt auf " + lautst�rke);
	}
}
