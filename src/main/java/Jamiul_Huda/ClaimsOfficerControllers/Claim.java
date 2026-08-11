package Jamiul_Huda.ClaimsOfficerControllers;


import javafx.beans.property.*;



public class Claim {


    private final StringProperty token;
    private final StringProperty date;
    private final StringProperty coverage;
    private final StringProperty urgency;
    private final DoubleProperty amount;
    private final StringProperty status;



    public Claim(String token,
                 String date,
                 String coverage,
                 String urgency,
                 double amount,
                 String status){


        this.token = new SimpleStringProperty(token);
        this.date = new SimpleStringProperty(date);
        this.coverage = new SimpleStringProperty(coverage);
        this.urgency = new SimpleStringProperty(urgency);
        this.amount = new SimpleDoubleProperty(amount);
        this.status = new SimpleStringProperty(status);

    }



    public StringProperty tokenProperty(){
        return token;
    }


    public StringProperty dateProperty(){
        return date;
    }


    public StringProperty coverageProperty(){
        return coverage;
    }


    public StringProperty urgencyProperty(){
        return urgency;
    }


    public DoubleProperty amountProperty(){
        return amount;
    }


    public StringProperty statusProperty(){
        return status;
    }



    public String getDate(){

        return date.get();

    }



    public double getAmount(){

        return amount.get();

    }



    public int getUrgencyOrder(){


        return switch(urgency.get()){

            case "High" -> 1;

            case "Medium" -> 2;

            default -> 3;

        };

    }

}