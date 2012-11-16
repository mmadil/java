//This program uses inheritance to extend Box.
class Box{
 double width;
 double height;
 double depth;
 
 //construct close of an object
 Box(Box ob){    // pass objects to a constructor
  width = ob.width;
  height = ob.height;
  depth = ob.depth;
  }

 //constructor used when all dimensions specified
 Box(double w, double h, double d){
  width = w;
  height = h;
  depth = d;
  }

 //constructor used when no dimensions specified
 Box(double len){
  width = height = depth = len;
  }

 //constructor used when all dimensions specified
 Box(double w, double h, double d){
  double volume(){
   return width*height*depth;
  }
}

 //Here box is extended to include weight 
 class Boxweight extends Box{
  double weight; // weight of box

 //constructor for Boxweight
  Boxweight(double w, double h, double d, double a){
   width = w;
   height = h;
   depth = d;
   weight = a;
  }
}

class Inheritance{
 public static void main(String args[]){
  Boxweight mybox1 = new Boxweight(10,20,15,34.3);
  Boxweight mybox2 = new Boxweight(2,3,4,0.076);
  double vol;
 
  vol = mybox1.volume();
  System.out.println("Volume of mybox 1 is " +vol);
  System.out.println("Weight of mybox 1 is "+mybox1.weight);
  System.out.println("");

  vol = mybox2.volume();
  System.out.println("Volume of mybox 2 is "+vol);
  System.out.println("Weight of mybox 2 is "+mybox2.weight);
 }
}
