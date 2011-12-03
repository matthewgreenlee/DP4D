package com.goldenpond.state;

public class StateB extends State {

	public StateB(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action01() {
		// TODO Auto-generated method stub
	}

	@Override
	public void action02() {
		// TODO Auto-generated method stub
		log.info("handling at the state B");
		context.setState(context.getStateC());
	}

	@Override
	public void action03() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void action04() {
		// TODO Auto-generated method stub
		log.info("handling at the state B");
		context.setState(context.getStateA());
	}

}
