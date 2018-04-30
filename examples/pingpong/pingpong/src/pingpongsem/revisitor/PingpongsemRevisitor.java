package pingpongsem.revisitor;

public interface PingpongsemRevisitor<Pong__PPingT, Pingpongsem__PPingBindPingT extends Pong__PPingT, Pong__PPongT, Ping__PingT, Ping__PongT, Pingpongsem__PongBindPPongT extends Ping__PongT>
	extends ping.revisitor.PingRevisitor<Ping__PingT, Ping__PongT>,
		pong.revisitor.PongRevisitor<Pong__PPingT, Pong__PPongT> {
	Pingpongsem__PPingBindPingT pingpongsem__PPingBindPing(final pingpongsem.PPingBindPing it);
	Pingpongsem__PongBindPPongT pingpongsem__PongBindPPong(final pingpongsem.PongBindPPong it);

	default Pong__PPingT $(final pong.PPing it) {
		if (it.getClass() == pingpongsem.impl.PPingBindPingImpl.class)
			return pingpongsem__PPingBindPing((pingpongsem.PPingBindPing) it);
		return null;
	}
	default Pingpongsem__PPingBindPingT $(final pingpongsem.PPingBindPing it) {
		return pingpongsem__PPingBindPing(it);
	}
	default Pong__PPongT $(final pong.PPong it) {
		return pong__PPong(it);
	}
	default Ping__PingT $(final ping.Ping it) {
		return ping__Ping(it);
	}
	default Ping__PongT $(final ping.Pong it) {
		if (it.getClass() == pingpongsem.impl.PongBindPPongImpl.class)
			return pingpongsem__PongBindPPong((pingpongsem.PongBindPPong) it);
		return null;
	}
	default Pingpongsem__PongBindPPongT $(final pingpongsem.PongBindPPong it) {
		return pingpongsem__PongBindPPong(it);
	}
}
