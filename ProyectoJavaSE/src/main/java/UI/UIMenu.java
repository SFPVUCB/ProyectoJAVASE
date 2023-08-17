package UI;
import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;
//Para hacer ams limpio el codigo en main, para modularizar y para evitar la implentacion.
public class UIMenu
{
    public static Doctor doctorlogged;
    public static Patient patientlogged;
    public static final String [] MONTHS= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Dciciembre"};
     public static void showMenu()
     {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            System.out.println(sc);

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response=0;

                    break;
                case 2:
                    System.out.println("Paciente");
                    response=0;
                    authUser(2);
                    response=0;
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }
    private static void authUser(int userType)
    {
        //si userType=1 entonces Doctor
        //si userType=2 entonces Paciente
        ArrayList<Doctor>doctors=new ArrayList<>();
        doctors.add(new Doctor("Marco Heredia","marco@gmail.com"));
        doctors.add(new Doctor("Teo Hernandez","teo@gmail.com"));
        doctors.add(new Doctor("Lucas Chavez","lucas@gmail.com"));
        ArrayList<Patient>patients=new ArrayList<>();
        patients.add(new Patient("Maria Flores","maria@gmail.com"));
        patients.add(new Patient("Pedro Torrez","pedro@gmail.com"));
        patients.add(new Patient("Lucia Martinez","lucia@gmail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Introduce tu email: name@.com");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType==1)
            {
                for(Doctor d:doctors)
                {
                    if(d.getEmail().equals(email))
                    {
                        emailCorrect=true;
                        //obtener el usuario logueado
                        doctorlogged=d;
                        //showDoctorMenu
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            else if (userType==2)
            {
                for(Patient p:patients)
                {
                    if(p.getEmail().equals(email))
                    {
                        emailCorrect=true;
                        //obtener el usuario logueado
                        patientlogged=p;
                        //showPatientMenu
                        UIPatientMenu.showPatientMenu();
                    }
                }

            }

        }while(!emailCorrect);//si email es falso, solicitar el correo
    }
     static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i=0;i<3;i++)
                    {
                        System.out.println(i+". "+MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
