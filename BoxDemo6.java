class Box{
 double width,height,depth;
 
 //this is the constructor for box
 Box(){
  System.out.println("constructing box");
  width = 10;
  height = 10;
  depth = 10;
}

// compute and return volume
 double volume(){
  return width*height*depth;
 }
}

class BoxDemo6{
 public static void main(String args[]){
  // declare allocate and initialize box objects

  Box mybox1 = new Box();
  Box mybox2 = new Box();

  double vol;

  // get volume of first box

  vol = mybox1.volume();
  System.out.println("Volume of box1 is "+vol);

  // get volume of second box

  vol = mybox2.volume();
  System.out.println("Volume of box2 is "+vol);
  }
}
