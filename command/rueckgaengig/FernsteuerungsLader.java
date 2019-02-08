package headfirst.command.rueckgaengig;

public class FernsteuerungsLader {
 
	public static void main(String[] args) {
		FernSteuerungMitRueckgaengig fernSteuerung = new FernSteuerungMitRueckgaengig();
 
		Licht wohnzimmerLicht = new Licht("Wohnzimmer");
 
		LichtAnBefehl wohnzimmerLichtAn = 
				new LichtAnBefehl(wohnzimmerLicht);
		LichtAusBefehl wohnzimmerLichtAus = 
				new LichtAusBefehl(wohnzimmerLicht);
 
		fernSteuerung.setBefehl(0, wohnzimmerLichtAn, wohnzimmerLichtAus);
 
		fernSteuerung.anKnopfWurdeGedr�ckt(0);
		fernSteuerung.ausKnopfWurdeGedr�ckt(0);
		System.out.println(fernSteuerung);
		fernSteuerung.r�ckg�ngigKnopfWurdeGedr�ckt();
		fernSteuerung.ausKnopfWurdeGedr�ckt(0);
		fernSteuerung.anKnopfWurdeGedr�ckt(0);
		System.out.println(fernSteuerung);
		fernSteuerung.r�ckg�ngigKnopfWurdeGedr�ckt();

		Ventilator ventilator = new Ventilator("Wohnzimmer");
   
		VentilatorMittelBefehl ventilatorMittel = 
				new VentilatorMittelBefehl(ventilator);
		VentilatorSchnellBefehl ventilatorSchnell = 
				new VentilatorSchnellBefehl(ventilator);
		VentilatorAusBefehl ventilatorAus = 
				new VentilatorAusBefehl(ventilator);
  
		fernSteuerung.setBefehl(0, ventilatorMittel, ventilatorAus);
		fernSteuerung.setBefehl(1, ventilatorSchnell, ventilatorAus);
   
		fernSteuerung.anKnopfWurdeGedr�ckt(0);
		fernSteuerung.ausKnopfWurdeGedr�ckt(0);
		System.out.println(fernSteuerung);
		fernSteuerung.r�ckg�ngigKnopfWurdeGedr�ckt();
  
		fernSteuerung.anKnopfWurdeGedr�ckt(1);
		System.out.println(fernSteuerung);
		fernSteuerung.r�ckg�ngigKnopfWurdeGedr�ckt();
	}
}
