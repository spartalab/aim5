package aim4.config;

import java.util.Map;

import aim4.im.v2i.V2IManager;
import aim4.im.v2i.RequestHandler.ApproxNPhasesTrafficSignalRequestHandler.SignalController;
import aim4.map.GridMap;
import aim4.map.destination.DestinationSelector;
import aim4.vehicle.VehicleSimView;

/**
 * Make it possible to get the handler of objects in other classes 
 * FIXME This is for implementation convenience, not a good design
 * 
 * @author menie482
 *
 */
public class Resources {
	/**
	 * which contains policy
	 * 
	 * TODO only dealing with one im
	 */
	public static V2IManager im;
	
	/**
	 * The list of vehicles
	 * This reference is got from AutoDriverOnlySimulator.java
	 */
	public static Map<Integer,VehicleSimView> vinToVehicles;

	/**
	 * This helps to get which destination a lane would lead to.
	 */
	public static DestinationSelector destinationSelector;

	/**
	 * This is a GridMap handler
	 */
	public static GridMap map;

	/**
	 * For updating red signal
	 */
	public static Map<Integer, SignalController> signalControllers;

	/**
	 * Traffic phase file
	 */
	public static TrafficSignalPhase phase;
}
