package model;

public class Patient extends User
{
    //Atributos
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

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
}

