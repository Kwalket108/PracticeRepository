package co.q64.test;

import liketodance.Like;

public class Main{
	public static void main(String[] args) {
		Welcomer welcomer = new Welcomer();
		welcomer.sayHello();
		Main mainer = new Main();
		mainer.like();
	}
	public void like(){
		Like like = new Like();
		like.doSomething();
	}
}
