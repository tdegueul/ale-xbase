package fr.inria.diverse.ad.emfswitch.operation;

import java.util.List;

import activitydiagram.InputValue;

public interface ActivityOperation {
	void main(List<InputValue> inputValues);

	void terminate();

}
