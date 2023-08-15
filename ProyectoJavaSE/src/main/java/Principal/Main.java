package Principal;

import javax.swing.*;

import java.util.Date;

import static Principal.UIMenu.*;

public class Main {
    public static void main(String[] args)
    {

        //showMenu();
        Doctor myDoctor = new Doctor("Fercho","Pediatria");
        myDoctor.addAvailableAppointment(new Date(),"4 pm");
        myDoctor.addAvailableAppointment(new Date(),"10 am");
        myDoctor.addAvailableAppointment(new Date(),"5 pm");
        System.out.println(myDoctor);

        System.out.println("----------------------------------------");

        Patient patient = new Patient("Alice","alice@gmail.com");
        Patient patient2 = new Patient("Maria","maria@gmail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient=patient2;
        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());




    }
}