package com.proshanto.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		Movable bmw= new BMW();
		MovableAdapter movableAdapter = new MovableAdapterImpl(bmw);
		System.err.println(movableAdapter.getSpeed());

	}

}
