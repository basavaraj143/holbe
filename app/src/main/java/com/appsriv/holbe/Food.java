package com.appsriv.holbe;

/**
 * Created by appsriv-02 on 29/4/16.
 */
public class Food
{

    private String food_mapping_id;
    private String food_name;
    private String when;
    private String compliance;

    int ProgressBarRes;
    String Colour;
    private int int_compliance;


    //profile screen

    private int food_count;
    private int food_completed;
    private int food_late;
    private int food_missed;

    public int getFood_count() {
        return food_count;
    }

    public void setFood_count(int food_count) {
        this.food_count = food_count;
    }

    public int getFood_completed() {
        return food_completed;
    }

    public void setFood_completed(int food_completed) {
        this.food_completed = food_completed;
    }

    public int getFood_late() {
        return food_late;
    }

    public void setFood_late(int food_late) {
        this.food_late = food_late;
    }

    public int getFood_missed() {
        return food_missed;
    }

    public void setFood_missed(int food_missed) {
        this.food_missed = food_missed;
    }

    public int getInt_compliance() {
        return int_compliance;
    }

    public void setInt_compliance(int int_compliance) {
        this.int_compliance = int_compliance;
    }
    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public int getProgressBarRes() {
        return ProgressBarRes;
    }

    public void setProgressBarRes(int progressBarRes) {
        ProgressBarRes = progressBarRes;
    }

    public String getFood_mapping_id() {
        return food_mapping_id;
    }

    public void setFood_mapping_id(String food_mapping_id) {
        this.food_mapping_id = food_mapping_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public String getCompliance() {
        return compliance;
    }

    public void setCompliance(String compliance) {
        this.compliance = compliance;
    }
}
