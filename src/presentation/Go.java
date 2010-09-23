package presentation;

import domain.Thing;

public class Go extends Command{
	Game g1;
	Thing location;
	Thing character;
	String[] command;
	Thing target;
	String desc;
	
	@Override
	public Go process(Thing t, String[] s) {
		Go g = new Go();
		g.g1 = g1;
		t.moveTo(t, s);
		return g;
	}
	public void setGame(Game game) {
		g1 = game;
	}
	@Override
	public void output(String[] s) {
		System.out.println("You have gone " + s[1] + ".");
	}
}
