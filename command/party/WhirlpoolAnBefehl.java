package headfirst.command.party;

public class WhirlpoolAnBefehl implements Befehl {
	Whirlpool whirlpool;

	public WhirlpoolAnBefehl(Whirlpool whirlpool) {
		this.whirlpool = whirlpool;
	}
	public void ausf�hren() {
		whirlpool.an();
		whirlpool.setTemperatur(35);
		whirlpool.zirkulieren();
	}
	public void r�ckg�ngig() {
		whirlpool.aus();
	}
}
