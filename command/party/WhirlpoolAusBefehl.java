package headfirst.command.party;

public class WhirlpoolAusBefehl implements Befehl {
	Whirlpool whirlpool;

	public WhirlpoolAusBefehl(Whirlpool whirlpool) {
		this.whirlpool = whirlpool;
	}

	public void ausf�hren() {
		whirlpool.setTemperatur(32);
		whirlpool.aus();
	}
	public void r�ckg�ngig() {
		whirlpool.an();
	}
}
