package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public short getGolesRecibidos() {
        return this.golesRecibidos;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos= golesRecibidos;
        this.dorsal= dorsal;
    }

    public int compareTo(Object f){
        Portero j = (Portero) f; 
        if (j.getGolesRecibidos()-this.getGolesRecibidos() >0)
            return j.getGolesRecibidos()-this.getGolesRecibidos();
        return this.getGolesRecibidos()-j.getGolesRecibidos();
    }


    public String toString(){
        return "El futbolista " +getNombre()+ " tiene "+getEdad()+ ", y juega de " + getPosicion() +" con el dorsal " + getDorsal() + ". Le han marcado " + getGolesRecibidos();
    }
    public boolean jugarConLasManos(){
        return true;
    }


}
