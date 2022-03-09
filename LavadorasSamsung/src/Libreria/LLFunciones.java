/*
 * Clase para las funciones lógicas de una lavadora
 */
package Libreria;

/**
 *
 * @author xavcilia
 */
public class LLFunciones {

    private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;

    public LLFunciones(int kilos, int TipoDeRopa) {
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    }

    private void Llenado() {
        if (getKilos() <= 12) {
            setLlenadoCompleto(1);
            System.out.println("Lenando...");
            System.out.println("Llenado completo");

        } else {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");

        }

    }

    private void Lavado() { //Este metodo sirve para lavar
        Llenado();
        if (getLlenadoCompleto() == 1) {
            if (TipoDeRopa == 1) {
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                setLavadoCompleto(1);
            } else if (TipoDeRopa == 2) {
                System.out.println("Ropa de color / lavado intenso");
                System.out.println("Lavando");
                setLavadoCompleto(1);
            } else {
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavará como ropa de color / Lavado intenso");
                setLavadoCompleto(1);

            }
        }
    }

    private void Secado() {
        Lavado();
        if (getLavadoCompleto() == 1) {
            System.out.println("Secando...");
            setSecadoCompleto(1);
        }

    }

    public void CicloFinalizado() {
        Secado();
        if (getSecadoCompleto() == 1) {

            System.out.println("Tu ropa está lista");
        }
    }
    
    //Setter y Getter
    
    public int getTipoDeRopa(){
        return TipoDeRopa;
    }
    public void setTipoDeRopa(int TipoDeRopa){
        this.TipoDeRopa = TipoDeRopa;
        
                
    }

    /**
     * @return the kilos
     */
    public int getKilos() {
        return kilos;
    }

    /**
     * @param kilos the kilos to set
     */
    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    /**
     * @return the llenadoCompleto
     */
    public int getLlenadoCompleto() {
        return llenadoCompleto;
    }

    /**
     * @param llenadoCompleto the llenadoCompleto to set
     */
    public void setLlenadoCompleto(int llenadoCompleto) {
        this.llenadoCompleto = llenadoCompleto;
    }

    /**
     * @return the LavadoCompleto
     */
    public int getLavadoCompleto() {
        return LavadoCompleto;
    }

    /**
     * @param LavadoCompleto the LavadoCompleto to set
     */
    public void setLavadoCompleto(int LavadoCompleto) {
        this.LavadoCompleto = LavadoCompleto;
    }

    /**
     * @return the SecadoCompleto
     */
    public int getSecadoCompleto() {
        return SecadoCompleto;
    }

    /**
     * @param SecadoCompleto the SecadoCompleto to set
     */
    public void setSecadoCompleto(int SecadoCompleto) {
        this.SecadoCompleto = SecadoCompleto;
    }
}