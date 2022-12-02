

public class Main{

    public static void main(String[] args) {
        
        Persona persona = new Persona();

        persona.setNombre("George");

        String nombre = persona.getNombre();
        System.out.println(nombre);

        persona.setEdad(25);

        int edad = persona.getEdad();
        System.out.println(edad);

        persona.setTelefono(112544869);

        int telefono = persona.getTelefono();
        System.out.println(telefono);





    }
}



class Persona{

    private String nombre;
    int edad;
    int telefono;

    //Function nombre

    public void setNombre(String nombreUsuario){

        this.nombre = nombreUsuario;
    }

    public String getNombre(){

        return this.nombre;
    }

    //Function edad

     public void setEdad(int edadUsuario){

        this.edad = edadUsuario;
    }

    public int getEdad(){

        return this.edad;
    }

    //Function telefono

    public void setTelefono(int telefonoUsuario){

        this.telefono = telefonoUsuario;
    }

    public int getTelefono(){

        return this.telefono;
    }


}
