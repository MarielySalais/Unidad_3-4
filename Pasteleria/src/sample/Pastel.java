package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Pastel {
    private SimpleIntegerProperty ID;
    private SimpleIntegerProperty Pisos;
    private SimpleStringProperty TipodePiso;
    private SimpleStringProperty Figura;
    private SimpleStringProperty Sabor;
    private SimpleStringProperty Relleno;
    private SimpleStringProperty Diseño;
    private SimpleIntegerProperty Precio;

    public Pastel(int id,int pisos, String tipodePiso, String figura, String sabor, String relleno, String diseño, int precio) {
        this.ID= new SimpleIntegerProperty(id);
        this.Pisos =new SimpleIntegerProperty(pisos);
        this.TipodePiso =new SimpleStringProperty(tipodePiso);
        this.Figura =new SimpleStringProperty(figura);
        this.Sabor =new SimpleStringProperty(sabor);
        this.Relleno =new SimpleStringProperty(relleno);
        this.Diseño =new SimpleStringProperty (diseño);
        this.Precio =new SimpleIntegerProperty(precio);
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

    public int getPisos() {
        return Pisos.get();
    }

    public SimpleIntegerProperty pisosProperty() {
        return Pisos;
    }

    public void setPisos(int pisos) {
        this.Pisos.set(pisos);
    }

    public String getTipodePiso() {
        return TipodePiso.get();
    }

    public SimpleStringProperty tipodePisoProperty() {
        return TipodePiso;
    }

    public void setTipodePiso(String tipodePiso) {
        this.TipodePiso.set(tipodePiso);
    }

    public String getFigura() {
        return Figura.get();
    }

    public SimpleStringProperty figuraProperty() {
        return Figura;
    }

    public void setFigura(String figura) {
        this.Figura.set(figura);
    }

    public String getSabor() {
        return Sabor.get();
    }

    public SimpleStringProperty saborProperty() {
        return Sabor;
    }

    public void setSabor(String sabor) {
        this.Sabor.set(sabor);
    }

    public String getRelleno() {
        return Relleno.get();
    }

    public SimpleStringProperty rellenoProperty() {
        return Relleno;
    }

    public void setRelleno(String relleno) {
        this.Relleno.set(relleno);
    }

    public String getDiseño() {
        return Diseño.get();
    }

    public SimpleStringProperty diseñoProperty() {
        return Diseño;
    }

    public void setDiseño(String diseño) {
        this.Diseño.set(diseño);
    }

    public int getPrecio() {
        return Precio.get();
    }

    public SimpleIntegerProperty precioProperty() {
        return Precio;
    }

    public void setPrecio(int precio) {
        this.Precio.set(precio);
    }

    public void calcular_precio(){
        int total=120;
        int precioxpiso=total*getPisos();


        int tdp=0;
        if(getPisos()==1){
            tdp=0;
        }else{
            switch (getTipodePiso()){
                case "Escalonado":tdp=130;
                    break;
                case "Torre":tdp=150;
                    break;
            }
        }
        int sabor=0;
        switch (getSabor()){
            case "Vainilla":sabor=30;
                break;
            case"Chocolate":sabor=40;
                break;
            case"Red velvet":sabor=60;
                break;
            case "Fresa":sabor=31;
                break;
            case "Almendra":sabor=45;
                break;
            case "Limón":sabor=46;
                break;
            case "Zanahoria":sabor=47;
                break;
            case "Naranja":sabor=43;
                break;
            case "Tres leches":sabor=50;
                break;
        }
        int relleno=0;
        switch (getRelleno()){
            case "Frutos Rojos":relleno=20;
                break;
            case "Nutella":relleno=50;
                break;
            case "Betun de mantequilla":relleno=15;
                break;
            case "Crema Chantilly":relleno=18;
                break;
            case "Ganache de chocolate":relleno=30;
                break;
            case "Mermelada":relleno=14;
                break;
            case "Dulce de leche":relleno=29;
                break;
        }
        int figura=0;
        switch (getFigura()){
            case "Circulo":figura=100;
                break;
            case "Cuadrado":figura=200;
                break;
            case "Corazón":figura=400;
             break;
            case "Silueta de personaj":figura=500;
                break;
        }
        total=total+precioxpiso+tdp+sabor+relleno+figura;
        setPrecio(total);

    }
}
