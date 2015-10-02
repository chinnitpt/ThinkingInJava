package holdingyourobjects.exercise13;

import holdingyourobjects.exercise13.GreenhouseControls;
import holdingyourobjects.exercise13.GreenhouseControls.Bell;
import holdingyourobjects.exercise13.GreenhouseControls.LightOff;
import holdingyourobjects.exercise13.GreenhouseControls.LightOn;
import holdingyourobjects.exercise13.GreenhouseControls.Restart;
import holdingyourobjects.exercise13.GreenhouseControls.ThermostatDay;
import holdingyourobjects.exercise13.GreenhouseControls.ThermostatNight;
import holdingyourobjects.exercise13.GreenhouseControls.WaterOff;
import holdingyourobjects.exercise13.GreenhouseControls.WaterOn;
import holdingyourobjects.exercise13.Event;

public class GreenhouseController {
  public static void main(String[] args) {
    GreenhouseControls gc = new GreenhouseControls();
    // Instead of hard-wiring, you could parse
    // configuration information from a text file here:
    gc.addEvent(gc.new Bell(900));
    Event[] eventList = {
      gc.new ThermostatNight(0),
      gc.new LightOn(200),
      gc.new LightOff(400),
      gc.new WaterOn(600),
      gc.new WaterOff(800),
      gc.new ThermostatDay(1400)
    };	
    gc.addEvent(gc.new Restart(2000, eventList));
    if(args.length == 1)
      gc.addEvent(
        new GreenhouseControls.Terminate(
          new Integer(args[0])));
    gc.run();
  }
}
