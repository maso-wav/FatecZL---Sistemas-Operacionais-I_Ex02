package View;

import Controller.TextoController;

public class TempoPrincipal {
    
    public static void main (String args[]){
        
        TextoController tc = new TextoController();
        
        String frase01 = "abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba";
        String frase02 = "abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga";
        String frase03 = "acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião";
        
        tc.separaPalavras(frase01);
        tc.separaPalavras(frase02);
        tc.separaPalavras(frase03);
        
    }
    
}
