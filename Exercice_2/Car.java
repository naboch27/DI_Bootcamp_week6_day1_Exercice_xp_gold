/**
 * Car
 */
public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

   public  Car(){ }

   public  Car(String makeC,String modelC,int yearC){ 

    make = makeC ;
    model = modelC ;
    year = yearC ;
    this.setColor(color);
    this.setPrice(price);
   }

   /**
 * @param make
 * @param model
 * @param year
 */
public  Car (String make,String model,Integer year){ 

    this.make = make ;
    this.model = model;
    this.year = year ;

   }

   public String getColor()  {  
    return color;
  }

  public void setColor(String colorC)
  {
    color = colorC;
  }

  public double getPrice()  {  
    return price;
  }

  public void setPrice(double priceC)
  {
    price = priceC;
  }
   

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public Car color(String color) {
        setColor(color);
        return this;
    }

    public Car price(double price) {
        setPrice(price);
        return this;
    }

    
    
    public String displayStudentInfo() {
        return "{" +
            " make='" + getMake() + "'" +
            ", model='" + getModel() + "'" +
            ", year='" + getYear() + "'" +
            ", color='" + getColor() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }
 
   
    public static void main(String[] args) {
        Car car1 = new Car();

        Car car2 = new Car("Chine","toyota",1992);
         car2.setColor("red");
         car2.setPrice(1000000);
         Car car3 = new Car("Allemand","BMW",1990);
        System.out.println(car1.displayStudentInfo());
        System.out.println(car2.displayStudentInfo());
        System.out.println(car3.displayStudentInfo());
    }

}