package Controller;

public class TextoController {
    
    public TextoController(){
        
        super();
    }
    
    public void separaPalavras(String frase){
        
        String[] vetorPalavras = frase.split(";");
        int tamanho = vetorPalavras.length;
        
        for(String i: vetorPalavras){
                        
        }
        
        System.out.println("A frase " + frase + " tem " + tamanho + " palavras.");            
    }
}
