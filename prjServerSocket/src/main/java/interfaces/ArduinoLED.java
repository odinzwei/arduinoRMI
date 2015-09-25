package interfaces;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ArduinoLED extends Serializable, Remote {
	int PORT = 1099;
	String PROTOCOL ="rmi";
	String HOST = "localhost";
	String NAME_SERVICE = "arduinoLED";
	String URL = PROTOCOL + "://" + HOST + ":" + PORT + "/" + NAME_SERVICE;

	boolean turnOn() throws RemoteException;

	boolean turnOff() throws RemoteException;
}
