public class Circle extends Shape    // fill the code
{
    private Double radius;
    
    public Circle()
    {
    }
    public Circle(Double radius)
    {
        this.radius=radius;
    }
     public void setRadius(Double radius)
    {
        this.radius=radius;
    }
    public Double getRadius()
    {
        return this.radius;
    }
    

   public void computeArea()
    {
       // fill the code
        area = (22.0 / 7.0) * (radius * radius);

    }
}
