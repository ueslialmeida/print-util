import java.util.Scanner;
/**
 * Classe de inicialização da aplicação.
 * 
 * @author Uesli Almeida 
 * @version 20/05/2017
 */
public class Main
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        int numberOfLine = 0; // número de linhas que será impresso
        int flag = 0;

        System.out.print("\n### BEM-VINDO AO UTILITÁRIO PARA TESTES DE IMPRESSÃO ###\n");
        System.out.print("Este utilitário foi desenvolvido com o objetivo de realizar\n");
        System.out.print("testes de impressão em impressoras térmicas e outras.\n\n");
        
        do
        {
            System.out.print("Quantidade de linhas para impressão: ");
            numberOfLine = scanner.nextInt(); // lê número de linhas para impressão
            printer.print(numberOfLine);
            System.out.print("\nContinuar realizando testes? (1/Sim 0/Não): ");
            flag = scanner.nextInt();
        } while (flag != 0);
        
        System.out.print("\nFinalizando programa...");
  
    }
}
