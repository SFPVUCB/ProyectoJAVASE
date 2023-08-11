package Principal;

import javax.swing.*;

import static Principal.UIMenu.*;

public class Main {
    public static void main(String[] args)
    {

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

        showMenu();
    }
}