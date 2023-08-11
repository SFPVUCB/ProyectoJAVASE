package Principal;
public class Doctor
{
    //atributos
    static int id=0; // debe ser una variable incrementable
    String name;
    String speciality;

    public Doctor()
    {
        System.out.println("Construyendo el objeto Doctor");
        id=id+1;
        this.name = " ";
        this.speciality = "";
    }

    public Doctor(String name)
    {
        this.name = name;
    }

    //comportamientos
    public void showName()
    {
        System.out.println(name);
    }
    public void showId()
    {
        System.out.println("ID del doctor: "+id);
    }

}
