package pong.revisitor;

public interface PongRevisitor<Pong__PPingT, Pong__PPongT> {
	Pong__PPongT pong__PPong(final pong.PPong it);

	Pong__PPingT $(final pong.PPing it);
	default Pong__PPongT $(final pong.PPong it) {
		return pong__PPong(it);
	}
}
