import java.awt.Graphics;   
import java.awt.PrintJob;   
import java.awt.Toolkit;  
import java.awt.Font;   
import java.awt.Frame;    

/**
 * Classe controla a seleção de impressora e impressão.
 * 
 * @author Uesli Almeida
 * @version 20/05/2017
 */
public class Printer
{
    public void print(int numberOfLine)
    {
       int topSpacing = 10; // espaçamento superior inicial
       
       // área de impressçao     
       Frame frame = new Frame("Área de Impressão");     
       frame.pack(); 
       frame.setMaximumSize(null);
       
       // pega o toolkit da área de impressão    
       Toolkit toolKit = frame.getToolkit(); 
       
       /*
        * verifica os serviços de impressão disponíveis,
        * caso não seja encontrado nenhum serviço é automaticamente
        * exibida uma mensagem informando a indisponibilidade
       */  
       PrintJob printJob = toolKit.getPrintJob(frame,  "Teste de impressão" , null); // trabalho de impressão
       
       // se houver trabalho de impressão a impressão será iniciada  
       if (printJob != null) 
       {
           // configura um objeto gráfico
           Graphics graphic = printJob.getGraphics(); 
           graphic.setFont(new Font("Arial",Font.PLAIN,10));
          
           graphic.drawString("TESTE DE IMPRESSÃO", 15, 10);
          
           // loop para desenhar um texto de acordo com a quantidade informada no início
           for (int i = 0; i < numberOfLine; i++)
           {
               topSpacing += 15; // espaçamento superior entre cada linha
               graphic.drawString( "Teste de impressão 1 2 3" , 15, topSpacing);
            }
             
            // libera os recursos gráficos    
            graphic.dispose();  
            
            // finaliza a impressão
            printJob.end();   
       }    
       
       // libera a área de impressçao 
       frame.dispose();   
    }
}
