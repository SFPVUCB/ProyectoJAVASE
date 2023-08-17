package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User
{
    //atributos
    private String speciality;
    private ArrayList<AvailableAppointment>availableAppointments = new ArrayList<>();
    //CONSTRUCTORES
    public Doctor(String name, String email) {
        super(name, email);
    }
    // GET Y SET
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    //COMPORTAMIENTOS O METODOS

    public void addAvailableAppointment(String date, String time)
    {
        //realizamos la tranformacion
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    //nos muestra la lista
    public ArrayList<AvailableAppointment> getAvailableAppointments()
    {
        return availableAppointments;
    }
    //TO STRING
    @Override
    public String toString() {
        return super.toString()+"Doctor{" +
                "speciality='" + speciality + '\'' +
                ", availableAppointments=" + availableAppointments +
                '}';
    }

    //Creamos una clase independiente ya que solo el doctor puede crear citas
    public static class AvailableAppointment
    {
        private int id;
        private Date date;
        private  String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        //CONSTRUCTORES
        public AvailableAppointment(String date, String time)
        {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }
        //GETTERS AND SETTERS

        public Date getDate(String DATE)
        {
            return date;
        }
        public String getDate()
        {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        //TO STRING para la clase interna independiente
        @Override
        public String toString() {
            return "AvailableAppointment{" +
                    "id=" + id +
                    ", date=" + date +
                    ", time='" + time + '\'' +
                    '}';
        }
    }
    //IMPLEMTANDO METODO ABSTRACTO
    @Override
    public void showDataUser()
    {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");

    }
}
