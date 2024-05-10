

public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas=0;

    public Persona() {
        this.id = id = ++Persona.numeroPersonas;
    }

    public Persona(String nombre, String tel, String email) {
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan Perez", "55555","Juan@hotmail.com");
        System.out.println(persona);
    }
}
