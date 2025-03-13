public class Moto {
    private String placa;
    private boolean esAltoCilindraje;
    
    public Moto(String placa, boolean esAltoCilindraje) {
        this.placa = placa;
        this.esAltoCilindraje = esAltoCilindraje;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public boolean esAltoCilindraje() {
        return esAltoCilindraje;
    }
}
