package Principal;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User
{
    //atributos
    private String speciality;
    //CONSTRUCTORES
    public Doctor(String name, String email) {
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: "+name);
        this.speciality = speciality;
    }
    // GET Y SET
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    //COMPORTAMIENTOS O METODOS

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    //nos permite añadir elementos a la lista
    public void addAvailableAppointment(Date date, String time)
    {
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
        //CONSTRUCTORES
        public AvailableAppointment(Date date, String time)
        {
            this.date = date;
            this.time = time;
        }
        //GETTERS AND SETTERS

        public Date getDate() {
            return date;
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

}
