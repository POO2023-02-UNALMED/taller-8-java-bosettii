package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public short getGolesMarcados() {
        return this.golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public Jugador(String nombre,int edad,String posicion,short golesMarcados,byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador(){
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    public int compareTo(Object f){
        Jugador j = (Jugador) f; 
        if (j.getEdad()-this.getEdad() >0)
            return j.getEdad()-this.getEdad();
        return this.getEdad()-j.getEdad();
    }
    
    public String toString(){
        return "El futbolista  " +getNombre()+ " tiene "+getEdad()+ ", juega de " + getPosicion() + " con el dorsal " + getDorsal()+ ". Ha marcado "+ getGolesMarcados();
    }


    public boolean jugarConLasManos(){
        return false;
    }
}
