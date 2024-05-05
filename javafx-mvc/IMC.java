
/**
 * Calcula sua Velocidade
 * 
 * @author CodeByGabriel
 * @version 0.01
 */
public class IMC
{
    double distancia;
    double tempo;
    
    public IMC() {
        this.distancia = 0;
        this.tempo = 0;
    }
    
    /**
     * Construtor para objetos da classe CalculadoraIMC
     */
    public IMC(double distancia, double tempo)
    {
        this.distancia = distancia;
        this.tempo = tempo;
    }

    /**
     * Calcula a velocidade
     * 
     * @return  o valor da velocidade é dado por: distancia/tempo;
     * 
     */
    public double calcular()
    {
        if (this.tempo <= 0 || this.distancia <= 0)
            return 0;
        return this.distancia / this.tempo;
        
    }
    
    /**
     * Interpreta a velocidade
     * 
     * @return     interpreta a velocidade
    */
    public double interpretar()
    {
        double imc = this.calcular();
        if (imc == 0)
            return -1; // Dados incompletos ou inválidos
        return imc;
    }
}
