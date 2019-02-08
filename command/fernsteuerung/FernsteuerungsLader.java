package headfirst.command.fernsteuerung;

public class FernsteuerungsLader {
 
	public static void main(String[] args) {
		FernSteuerung fernSteuerung = new FernSteuerung();
 
		Licht wohzimmerBeleuchtung = new Licht("Wohnzimmer");
		Licht k�chenBeleuchtung = new Licht("K�che");
		Ventilator ventilator= new Ventilator("Wohnzimmer");
		GaragenTor garagenTor = new GaragenTor("");
		StereoAnlage stereo = new StereoAnlage("Wohnzimmer");
  
		LichtAnBefehl wohnzimmerBeleuchtunAn = 
				new LichtAnBefehl(wohzimmerBeleuchtung);
		LichtAusBefehl wohnzimmerBeleuchtungAus = 
				new LichtAusBefehl(wohzimmerBeleuchtung);
		LichtAnBefehl k�chenBeleuchtunAn = 
				new LichtAnBefehl(k�chenBeleuchtung);
		LichtAusBefehl k�chenBeleuchtungAus = 
				new LichtAusBefehl(k�chenBeleuchtung);
  
		VentilatorAnBefehl ventilatorAn = 
				new VentilatorAnBefehl(ventilator);
		VentilatorAusBefehl ventilatorAus = 
				new VentilatorAusBefehl(ventilator);
 
		GaragenTorHochBefehl garagenTorHoch =
				new GaragenTorHochBefehl(garagenTor);
		GaragenTorRunterBefehl garagenTorRunter =
				new GaragenTorRunterBefehl(garagenTor);
 
		StereoAnlageAnMitCD stereoAnlageAnF�rCD =
				new StereoAnlageAnMitCD(stereo);
		StereoAnlageAusBefehl  stereoAnlageAus =
				new StereoAnlageAusBefehl(stereo);
 
		fernSteuerung.setBefehl(0, wohnzimmerBeleuchtunAn, wohnzimmerBeleuchtungAus);
		fernSteuerung.setBefehl(1, k�chenBeleuchtunAn, k�chenBeleuchtungAus);
		fernSteuerung.setBefehl(2, ventilatorAn, ventilatorAus);
		fernSteuerung.setBefehl(3, stereoAnlageAnF�rCD, stereoAnlageAus);
  
		System.out.println(fernSteuerung);
 
		fernSteuerung.anKnopfWurdeGedr�ckt(0);
		fernSteuerung.ausKnopfWurdeGedr�ckt(0);
		fernSteuerung.anKnopfWurdeGedr�ckt(1);
		fernSteuerung.ausKnopfWurdeGedr�ckt(1);
		fernSteuerung.anKnopfWurdeGedr�ckt(2);
		fernSteuerung.ausKnopfWurdeGedr�ckt(2);
		fernSteuerung.anKnopfWurdeGedr�ckt(3);
		fernSteuerung.ausKnopfWurdeGedr�ckt(3);
	}
}
