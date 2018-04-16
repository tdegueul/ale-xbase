package scenario;

import ping.Ping;
import ping.PingFactory;
import pingpongsem.PPingBindPing;
import pingpongsem.PingpongsemFactory;
import pingpongsem.PongBindPPong;
import pingpongsem.revisitor.impl.PingpongsemRevisitor;
import pong.PPong;
import pong.PongFactory;

public class Scenario1 {
	public static void main(final String[] args) {
		final PingpongsemFactory ppfact = PingpongsemFactory.eINSTANCE;
		final PingFactory pingfact = PingFactory.eINSTANCE;
		final PongFactory pongfact = PongFactory.eINSTANCE;

		final Ping ping = pingfact.createPing();
		ping.setCptr(10);
		final PPong createPPong = pongfact.createPPong();

		final PPingBindPing createPPingBindPing = ppfact.createPPingBindPing();
		createPPingBindPing.setDelegate(ping);
		createPPong.setPping(createPPingBindPing);

		final PongBindPPong createPongBindPPong = ppfact.createPongBindPPong();
		createPongBindPPong.setDelegate(createPPong);
		ping.setPong(createPongBindPPong);

		new PingpongsemRevisitor() {
		}.$(ping).call();
	}
}
