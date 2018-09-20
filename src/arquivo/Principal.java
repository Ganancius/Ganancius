
package arquivo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;



public class Principal {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		Arquivo Leytor = new Arquivo();
		Conversor conversor = new Conversor();

		List<String> linhasCoaches = Leytor.abrirArquivo("C:\\Users\\nodot\\Desktop\\backup maratona\\coaches.csv");
		List<Participante> coaches = conversor.linhasToParticipantes(linhasCoaches);

		List<String> linhasCoCoaches = Leytor.abrirArquivo("C:\\Users\\nodot\\Desktop\\backup maratona\\cocoaches.csv");
		List<Participante> coCoaches = conversor.linhasToParticipantes(linhasCoCoaches);

		List<String> linhasContestants = Leytor.abrirArquivo("C:\\Users\\nodot\\Desktop\\backup maratona\\contestants.csv");
		List<Participante> contestants = conversor.linhasToParticipantes(linhasContestants);

		List<String> linhasReserves = Leytor.abrirArquivo("C:\\Users\\nodot\\Desktop\\backup maratona\\reserves.csv");
		List<Participante> reserves = conversor.linhasToParticipantes(linhasReserves);
		
		List<Participante> todos = new ArrayList<Participante>();
                todos.addAll(contestants);
		todos.addAll(coaches);
                todos.addAll(reserves);
		todos.addAll(coCoaches);
		
		
                
                
                
                
                int op = 0;
        do{
                op = scan.nextInt();
                System.out.println("digite 1 para imprimir todos os participantes");
                System.out.println("digite 2 para imprimir participantes coaches");
                System.out.println("digite 3 para imprimir participantes CoCoaches");
                System.out.println("digite 4 para imprimir participantes contestants");
                System.out.println("digite 5 para imprimir participantes reserves");
                System.out.println("digite 0 para sair");
                if(op == 1){
                    for(Participante list: todos){
		          System.out.println(list);
                    }
                }else if(op == 2){
                    
            for(Participante list:coaches){
                        System.out.println(list);
            }
        }else if(op == 3){
            for(Participante list:coCoaches){
                        System.out.println(list);
            }
        }else if (op == 4){
            for(Participante list:contestants){
                        System.out.println(list);
            }
        }else if(op == 5){
              for(Participante list:reserves){
                        System.out.println(list);  
		}
		
	}
        }while(op == 0);
}
} 
