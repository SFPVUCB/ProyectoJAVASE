package model;

public class Nurse extends User
{
    private String speciality;


    //CONSTRUCTOR
    public Nurse(String name, String email)
    {
        super(name, email);
    }
    //METODOS
    //GETTERS AND SETTERS

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //TO STRING

}
