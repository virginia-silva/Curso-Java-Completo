package entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHours;
    private Integer hours;

    public HourContract(){

    }

    public HourContract(Date date, Double valuePerHours, Integer hours) {
        this.date = date;
        this.valuePerHours = valuePerHours;
        hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        hours = hours;
    }
    public double totalValue(){
        return valuePerHours * hours;
    }
}
