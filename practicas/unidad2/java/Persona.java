class Persona {
    String nombre;
    int edad;
    boolean vive;

    void saludar(){
        System.out.print("Hola, mi nombre es " + nombre);
    }
    void incrementarEdad(){
        edad = edad + 1;
    }
    void morir(){
        vive = false;
    }
}

    public static void main(String[] args){
        Persona persona = new Persona();

        persona.edad = 25;
        persona.nombre = "Roge";
        persona.vive = true;

        System.out.print("La edad es " + persona.edad);
        System.out.print("Esta vivo " + persona.vive);
        persona.saludar();

        System.out.print("La edad es " + persona.edad);
        System.out.print("Esta vivo " + persona.vive);
        persona.incrementarEdad();

        System.out.print("La edad es " + persona.edad);
        System.out.print("Esta vivo " + persona.vive);
        persona.morir();

        System.out.print("La edad es " + persona.edad);
        System.out.print("Esta vivo " + persona.vive);

    }
