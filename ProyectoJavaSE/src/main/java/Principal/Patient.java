package Principal;

public class Patient
{
    //Atributos
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    //CONSTRUCTORES
    public Patient(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
    //GETTER Y SETTERS MODIFICADORES
    // Nos ayudan a verificar la validez de los datos ingresados

    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        if(phoneNumber.length()>8)
        {
            System.out.println("El numero telefonico debe ser de 8 digitos maximo");
        }
        else if (phoneNumber.length()==8)
        {
            this.phoneNumber = phoneNumber;
        }
    }
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

    //TO STRING

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", birthday='" + birthday + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", blood='" + blood + '\'' +
                '}';
    }
}

