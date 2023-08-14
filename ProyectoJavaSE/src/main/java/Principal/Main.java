package Principal;

import javax.swing.*;

import static Principal.UIMenu.*;

public class Main {
    public static void main(String[] args)
    {
        /*
        Doctor myDoctor = new Doctor();
        myDoctor.name= "Sergio Prudencio";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println("Imprmiendo el objeto: "+myDoctor);
        System.out.println("-------------------");
        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.name= "Fernando Prudencio";
        myDoctorAnn.showName();
        myDoctorAnn.showId();
         */
        //showMenu();
        Doctor myDoctor = new Doctor("Fercho","Pediatria");
        System.out.println(myDoctor);
        myDoctor.showId();

        Patient patient = new Patient("Alice","alice@gmail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());





    }
}