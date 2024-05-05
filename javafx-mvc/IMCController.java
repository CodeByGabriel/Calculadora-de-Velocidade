import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author (Gabriel Ferreira) 
 * @version (beta0.4.5.2024)
 */
public class IMCController
{
    IMCView imcView;
    Stage stage;
    IMC imc;
    public TextField textFieldAltura;
    public TextField textFieldPeso;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe velocidade 
     */
    public IMCController()
    {
        this.stage = new Stage();
        this.imcView = new IMCView();
        this.imcView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.imcView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e){
    try {
        double altura = Double.parseDouble(textFieldAltura.getText());
        double peso = Double.parseDouble(textFieldPeso.getText());
        
        IMC imc = new IMC(peso, altura);
        double resultadoIMC = imc.interpretar();
        
        if (resultadoIMC == -1) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        } else {
            labelResultado.setText(String.valueOf(resultadoIMC));
        }
    } catch (NumberFormatException exception) {
        labelResultado.setText("Dados de entrada incompletos ou inválidos");
    }
    }

    
    public void botaoLimparClicado(Event e) {
        textFieldAltura.setText("");
        textFieldPeso.setText("");
        labelResultado.setText("");
    }    
}
