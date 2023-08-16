package UI;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoubleConsumer;

import static UI.UIMenu.doctorlogged;

public class UIDoctorMenu
{
    public static ArrayList<Doctor>doctorsAvailableApponintments = new ArrayList<>();
    public static void showDoctorMenu()
    {
        int response =0;
        do{
            System.out.println("------------------------------");
            System.out.println("WELCOME Doctor "+ doctorlogged.getName());
            System.out.println("------------------------------");
            System.out.println("1.Agregar un nueva cita\n2.Citas Agregadas\n0.SALIR");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response)
            {
                case 1:
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }



        }while(response!=0);
    }
    private static void showAddAvailableAppointmentsMenu()
    {
        int response =0;
        do{
            System.out.println("------------------------------");
            System.out.println("Menu para agregar Citas");
            System.out.println("------------------------------");
            System.out.println("Selecciona un Mes");
            for(int i=0;i<3;i++)
            {
                int j=i+1;
                System.out.println(j+"."+UIMenu.MONTHS[i]);
            }
            System.out.println("0.Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            if(response>0 && response<4)
            {
                //1,2,3
                int mothSelected = response;
                System.out.println(mothSelected+" . "+UIMenu.MONTHS[mothSelected-1]);

                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date=sc.nextLine();
                System.out.println("Tus datos son: "+date+"\n1.Correct\n2.Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2) continue;
                int responseTime =0;
                String time ="";
                do{
                    System.out.println("Insertar el tiempo de la fecha: "+date+"[16:00]");
                    time=sc.nextLine();
                    System.out.println("Tus datos son: "+time+"\n1.Correct\n2.Change Time");
                    responseTime = Integer.valueOf(sc.nextLine());

                }while(responseTime==2);
                doctorlogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(doctorlogged);
            } else if (response==0)
            {
                showDoctorMenu();
            }
        }while(response!=0);
    }
    private static void checkDoctorAvailableAppointments(Doctor doctor)
    {
        if(doctor.getAvailableAppointments().size()>0 && !doctorsAvailableApponintments.contains(doctor))
        {
            doctorsAvailableApponintments.add(doctor);

        }
    }
}
