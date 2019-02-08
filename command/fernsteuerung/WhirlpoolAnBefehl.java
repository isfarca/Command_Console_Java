package headfirst.command.fernsteuerung;

public class WhirlpoolAnBefehl implements Befehl {
	Whirlpool whirlpool;

	public WhirlpoolAnBefehl(Whirlpool whirlpool) {
		this.whirlpool = whirlpool;
	}

	public void ausf�hren() {
		whirlpool.an();
		whirlpool.hei�();
		whirlpool.sprudelnAn();
	}
}
