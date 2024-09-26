import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o servico");
        String servico = scanner.nextLine().trim();
        
        System.out.println("Digite o nome do cliente, e seus servico contratados");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0].trim();
        boolean contratado = false;
        
        // Verificando se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            String servicoContratado = partes[i].trim();
            
            if (servicoContratado.equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }
        
        // Exibir resultado sem acentuação para evitar problemas de codificação
        if (contratado) {
            System.out.println(nomeCliente + " contratou o servico:Sim");
        } else {
            System.out.println(nomeCliente + " Contratou o servico:Nao");
        }
        
        scanner.close();
    }
}
