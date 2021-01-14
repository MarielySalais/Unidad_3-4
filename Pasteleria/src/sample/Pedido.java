package sample;

import java.util.Stack;

public class Pedido {
    private int Id;
    private int Total;
    private Cliente Cliente;
    private Stack<Pastel> Pasteles_restantes=new Stack<>();
    private Stack<Pastel> Pasteles_terminados=new Stack<>();

    public Pedido(int id, int total, Cliente cliente, Stack<Pastel> pasteles_restantes, Stack<Pastel> pasteles_terminados) {
        this.Id = id;
        this.Total = total;
        this.Cliente = cliente;
        Pasteles_restantes = pasteles_restantes;
        Pasteles_terminados = pasteles_terminados;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        this.Cliente = cliente;
    }

    public Stack<Pastel> getPasteles_restantes() {
        return Pasteles_restantes;
    }

    public void setPasteles_restantes(Stack<Pastel> pasteles_restantes) {
        Pasteles_restantes = pasteles_restantes;
    }

    public Stack<Pastel> getPasteles_terminados() {
        return Pasteles_terminados;
    }

    public void setPasteles_terminados(Stack<Pastel> pasteles_terminados) {
        Pasteles_terminados = pasteles_terminados;
    }
}
