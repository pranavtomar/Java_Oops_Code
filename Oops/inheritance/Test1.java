package inheritance;

abstract class Booking{

    private static double basicFare = 500;

    public static float discount = 2.5f;

    private String custName;

    private int custAge;

    private char gender;

    public Booking(String custName, int custAge, char gender){

        this.custName = custName;

        this.custAge = custAge;

        this.gender = gender;

    }

    public static double getBasicFare() {

        return Booking.basicFare;

    }

    public abstract double calculateAmount(String typeOfClass);

}

class ResortBooking extends Booking{

    private double resortBasicfare;      

    public ResortBooking(String custName, int custAge, char gender){

        super(custName, custAge, gender);

        this.resortBasicfare = Booking.getBasicFare() * 5;

    }

    public double getResortBasicfare() {

        return this.resortBasicfare;

    }

    public double calculateAmount(String typeOfClass){

        if(typeOfClass.equals("Executive")){

            ResortBooking.discount += 5.0;

        }

        else if(typeOfClass.equals("Luxury")){

            ResortBooking.discount += 2.5;

        }

        return this.resortBasicfare*(1-ResortBooking.discount/100);

    }

}

class HomeStayBooking extends Booking{

    private double homeStayBasicFare;

    public HomeStayBooking(String custName, int custAge, char gender){

        super(custName, custAge, gender);

        this.homeStayBasicFare = 2 * Booking.getBasicFare();

    }

    public double calculateAmount(String typeOfClass){       

        if(typeOfClass.equals("Apartment")){

            HomeStayBooking.discount+=1;

        }

        else if(typeOfClass.equals("Bungalow")){

            HomeStayBooking.discount*=0.5;

        }

        return this.homeStayBasicFare*(1-HomeStayBooking.discount/100);

     }

}

public class Test1 {

    public static void main(String[] args) {

        ResortBooking bookingObj1 = new ResortBooking("Steve", 29, 'M');

        HomeStayBooking.discount*=3;

        HomeStayBooking bookingObj2 = new HomeStayBooking("Reena", 22, 'F');

        System.out.println(Math.round(bookingObj1.calculateAmount("Luxury")+bookingObj2.calculateAmount("Bungalow"))*100/100.00);

    }

}