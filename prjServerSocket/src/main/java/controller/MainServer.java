package controller;

import interfaces.ArduinoLED;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import service.ArduinoService;

public class MainServer {

	public static void main(String[] args) throws Exception {
		LocateRegistry.createRegistry(ArduinoLED.PORT);
		Naming.bind(ArduinoLED.URL, new ArduinoService());
		
	}
}
