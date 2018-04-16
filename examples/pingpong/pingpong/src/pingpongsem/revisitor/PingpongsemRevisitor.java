package pingpongsem.revisitor;

public interface PingpongsemRevisitor<Pong__PPingT, Pingpongsem__PPingBindPingT extends Pong__PPingT, Pong__PPongT, Ping__PingT, Ping__PongT, Pingpongsem__PongBindPPongT extends Ping__PongT>
	extends pong.revisitor.PongRevisitor<Pong__PPingT, Pong__PPongT>,
		ping.revisitor.PingRevisitor<Ping__PingT, Ping__PongT> {
	Pingpongsem__PPingBindPingT pPingBindPing(final pingpongsem.PPingBindPing it);
	Pingpongsem__PongBindPPongT pongBindPPong(final pingpongsem.PongBindPPong it);

	default Pong__PPingT $(final pong.PPing it) {
		if (it.getClass() == pingpongsem.impl.PPingBindPingImpl.class)
			return pPingBindPing((pingpongsem.PPingBindPing) it);
		return null;
	}
	default Pingpongsem__PPingBindPingT $(final pingpongsem.PPingBindPing it) {
		return pPingBindPing(it);
	}
	default Pong__PPongT $(final pong.PPong it) {
		return pPong(it);
	}
	default Ping__PingT $(final ping.Ping it) {
		return ping(it);
	}
	default Ping__PongT $(final ping.Pong it) {
		if (it.getClass() == pingpongsem.impl.PongBindPPongImpl.class)
			return pongBindPPong((pingpongsem.PongBindPPong) it);
		return null;
	}
	default Pingpongsem__PongBindPPongT $(final pingpongsem.PongBindPPong it) {
		return pongBindPPong(it);
	}
}
