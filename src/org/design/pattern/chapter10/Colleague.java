package org.design.pattern.chapter10;

public abstract class Colleague {
	private Mediator medietor;

	public Colleague(Mediator mediator) {
		this.medietor = mediator;
	}

	public Mediator getMedietor() {
		return medietor;
	}

}
