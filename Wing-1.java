public class Wing 

{

  private final double RHO_SEA_LEVEL = 1.225; // kg/m^3
  
  private double b; // span in meters
  private double c; // chord in meters
  private double cl;
  private double cd;
  private double v;
  
  
  public Wing()
  {
    b = 8;
    c = 1.7;
    cl = 1.8;
    cd = 0.4;
    v = 22.4; // 50 mph
    
    public Wing(double pb, double pc, double pcl, 
                double pcd, double v )
    {
      b = pb;
      c = pc;
      cl = pcl;
      cd = pcd;
      this.v = v;
    }
    
    public double lift()
    {
      return 1;
    }
    
    public double drag()
    {
      return 2;
    }
    
    public double area()
    {
      return b * c;
    }
    
    public double String toString()
    {
      return "Span: " + b + "/n" +
             "Chord: " + c + "/n" +;
    }
    
    public static void main(String[] args)
    {
      Wing wl = new Wing();
      System.out.println( "Wing area: "  + wl.area() + "m^2" );
      System.out.println( wl );
    }
    
    
  }