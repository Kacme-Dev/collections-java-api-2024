
import OperacoresBasicas.ListaTarefa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Kleber Moreno
 */
public class CollectionsJavaApi_2024 {

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
       
       System.out.println("O número total na lista é " + listaTarefa.obterNumeroTotalTarefas());
       
       listaTarefa.adicionarTarefa("Tarefa 1");
       listaTarefa.adicionarTarefa("Tarefa 1");
       listaTarefa.adicionarTarefa("Tarefa 2");
       System.out.println("O número total na lista é " + listaTarefa.obterNumeroTotalTarefas());
       
       listaTarefa.removerTarefa("Tarefa 1");
       System.out.println("O número total na lista é " + listaTarefa.obterNumeroTotalTarefas());
       
       listaTarefa.obterDescricoesTarefas();
    }
}
