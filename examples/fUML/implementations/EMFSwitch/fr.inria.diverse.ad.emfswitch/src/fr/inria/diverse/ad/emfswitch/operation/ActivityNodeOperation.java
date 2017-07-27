package fr.inria.diverse.ad.emfswitch.operation;

import java.util.List;

import activitydiagram.Token;

public interface ActivityNodeOperation {
	void run();

	List<Token> takeOfferdTokens();

	void fire(List<Token> tokens);

	void terminate();

	void addTokens(List<Token> tokens);

	void removeToken(Token token);

	void sendOffers(List<Token> tokens);

	boolean hasOffers();

	boolean isRunning();

	boolean isReady();

}
