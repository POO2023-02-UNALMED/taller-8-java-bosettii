package futbol;

public abstract class Futbolista implements Comparable<Object>{
    private String nombre;
    private int edad;
    private String posicion;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Futbolista(String nombre,int edad,String posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista(){
        this("Maradona",30,"delantero");
    }

    public String toString(){
        return "El futbolista " +getNombre()+ " tiene "+getEdad()+ ", y juega de " + getPosicion();
    }

    public boolean equals(Futbolista f){
        if (this == f)
            return true;
        return false;
    }

    public abstract boolean jugarConLasManos();
}