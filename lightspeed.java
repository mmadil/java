/* Compute the distance light travels using
   long variables */

class lightspeed{
 public static void main(String arg[]){
  int lightspeed;
  long days,seconds,distance;
  // approx speed of light in miles
  // per second

  lightspeed = 186000;
  days = 1000;
  seconds = days * 24 * 60 * 60;
  distance = lightspeed * seconds;
  System.out.print("In "+days);
  System.out.print("days light will travel about ");
  System.out.println(distance + "miles");
  }
}
