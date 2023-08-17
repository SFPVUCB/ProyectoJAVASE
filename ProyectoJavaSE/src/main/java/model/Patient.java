package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User
{
    //Atributos
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;
    private ArrayList<AppointmentDoctor>appointmentDoctors= new ArrayList<>();
    private ArrayList<AppointmentNurse>appointmentNurses= new ArrayList<>();

    //CONSTRUCTORES

    public Patient(String name, String email) {
        super(name, email);
    }
    //GETTER Y SETTERS MODIFICADORES
    // (Nos ayudan a verificar la validez de los datos ingresados)
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    //cambiamos el valor de retorno de Double a String para concatenar
    public String getWeight() {
        return weight+" Kg.";
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    //cambiamos el valor de retorno de Double a String para concatenar
    public String getHeight() {
        return height+" Mts.";
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors()
    {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedulable(date,time);
        appointmentDoctors.add(appointmentDoctor);
    }


    public ArrayList<AppointmentNurse> getAppointmentNurses()
    {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses)
    {
        this.appointmentNurses = appointmentNurses;
    }
    //TO STRING


    @Override
    public String toString() {
        return super.toString()+
                "Patient{" +
                "birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                '}';
    }
    //Metodos Abstractos
    @Override
    public void showDataUser()
    {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");

    }
}

