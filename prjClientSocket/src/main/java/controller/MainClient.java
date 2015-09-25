package controller;

import interfaces.ArduinoLED;

import java.rmi.Naming;

public class MainClient {

	public static void main(String[] args) throws Exception {
		ArduinoLED arduino = (ArduinoLED) Naming.lookup(ArduinoLED.URL);
		arduino.turnOn();
		arduino.turnOff();
	}

}
