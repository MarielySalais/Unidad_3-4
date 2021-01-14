package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Cliente {
    private SimpleIntegerProperty ID;
    private SimpleStringProperty Nombre;
    private SimpleStringProperty Telefono;
    private SimpleStringProperty Direccion;
    private SimpleStringProperty Entrega;

    public Cliente(int id, String nombre, String telefono, String direccion, String entrega) {
        this.ID = new SimpleIntegerProperty(id);
        this.Nombre = new SimpleStringProperty(nombre);
        this.Telefono =new SimpleStringProperty(telefono);
        this.Direccion =new SimpleStringProperty(direccion);
        this.Entrega =new SimpleStringProperty(entrega);
    }

    public int getID() {
        return ID.get();
    }

    public SimpleIntegerProperty IDProperty() {
        return ID;
    }

    public void setID(int ID) {
        this.ID.set(ID);
    }

    public String getNombre() {
        return Nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre.set(nombre);
    }

    public String getTelefono() {
        return Telefono.get();
    }

    public SimpleStringProperty telefonoProperty() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        this.Telefono.set(telefono);
    }

    public String getDireccion() {
        return Direccion.get();
    }

    public SimpleStringProperty direccionProperty() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion.set(direccion);
    }

    public String getEntrega() {
        return Entrega.get();
    }

    public SimpleStringProperty entregaProperty() {
        return Entrega;
    }

    public void setEntrega(String entrega) {
        this.Entrega.set(entrega);
    }
}
