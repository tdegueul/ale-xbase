package ping.revisitor;

public interface PingRevisitor<Ping__PingT, Ping__PongT> {
	Ping__PingT ping__Ping(final ping.Ping it);

	default Ping__PingT $(final ping.Ping it) {
		return ping__Ping(it);
	}
	default Ping__PongT $(final ping.Pong it) {
		return null;
	}
}
