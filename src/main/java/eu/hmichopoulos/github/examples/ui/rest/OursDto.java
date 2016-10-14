package eu.hmichopoulos.github.examples.ui.rest;

public class OursDto {

    private double heightInFeet;
    private String fullName;
    private int weight;
    private OursSexEnum sex;

    public double getHeightInFeet() {
        return heightInFeet;
    }

    public void setHeightInFeet(double heightInFeet) {
        this.heightInFeet = heightInFeet;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public OursSexEnum getSex() {
        return sex;
    }

    public void setSex(OursSexEnum sex) {
        this.sex = sex;
    }
}
