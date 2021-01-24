package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Controller {
    @FXML Button inicio_bt,pedido_bt,orden_bt,clientes_bt,close,minimizar;
    @FXML AnchorPane inicio,pedidos,pastel,clientes;
    //Panel Pedidos
    @FXML TableView ped_tabla_clientes,ped_tabla_pr,ped_tabla_pt;
    @FXML ListView<Integer> lv_pedidos;
    @FXML TextField ped_txt_total;
    ObservableList<Integer>ID_Pedido= FXCollections.observableArrayList();
    ObservableList<Cliente>cliente = FXCollections.observableArrayList();
    ObservableList<Pastel>Pastel_Restante= FXCollections.observableArrayList();
    ObservableList<Pastel>Pastel_Terminado= FXCollections.observableArrayList();
    Queue<Pedido>cola_pedido= new LinkedList<>();
    int id_pedido=1;


    //tabla de cliente
    TableColumn columna_ped_cl_Id_clientes= new TableColumn("ID");
    TableColumn columna_ped_cl_Nombre= new TableColumn("Nombre");
    TableColumn columna_ped_cl_Telefono= new TableColumn("Telefono");
    TableColumn columna_ped_cl_Direccion= new TableColumn("Dirección");
    TableColumn columna_ped_cl_Entrega= new TableColumn("A Domicilio");

    //pasteles restantes
    TableColumn columna_ped_pr_Id_pastel=new TableColumn("ID");
    TableColumn columna_ped_pr_Pisos=new TableColumn("Pisos");
    TableColumn columna_ped_pr_TipodePiso=new TableColumn("Tipo de piso");
    TableColumn columna_ped_pr_Sabor=new TableColumn("Sablor");
    TableColumn columna_ped_pr_Relleno=new TableColumn("Relleno");
    TableColumn columna_ped_pr_Figura=new TableColumn("Figura");
    TableColumn columna_ped_pr_Disenio=new TableColumn("Diseño");
    TableColumn columna_ped_pr_Precio=new TableColumn("Precio");

    //pasteles terminados
    TableColumn columna_ped_pt_Id_pastel=new TableColumn("ID");
    TableColumn columna_ped_pt_Pisos=new TableColumn("Pisos");
    TableColumn columna_ped_pt_TipodePiso=new TableColumn("Tipo de piso");
    TableColumn columna_ped_pt_Sabor=new TableColumn("Sablor");
    TableColumn columna_ped_pt_Relleno=new TableColumn("Relleno");
    TableColumn columna_ped_pt_Figura=new TableColumn("Figura");
    TableColumn columna_ped_pt_Disenio=new TableColumn("Diseño");
    TableColumn columna_ped_pt_Precio=new TableColumn("Precio");

    int id_pastel=1;
    //Panel Pastel
    @FXML Button pas_bt_agregar,pas_bt_generar,pas_bt_eliminar,pas_bt_vaciar,pas_bt_ordid,pas_bt_ordprecio;
    @FXML ComboBox pas_cb_pisos,pas_cb_TipodePiso,pas_cb_sabor,pas_cb_relleno,pas_cb_figura,pas_cb_cliente;
    @FXML TableView pas_tabla;
    @FXML TextField pas_txt_disenio,pas_txt_precio,pas_txt_total,pas_txt_id;
    //Columnas
        TableColumn columnaId_pastel=new TableColumn("ID");
        TableColumn columnaPisos=new TableColumn("Pisos");
        TableColumn columnaTipodePiso=new TableColumn("Tipo de piso");
        TableColumn columnaSabor=new TableColumn("Sablor");
        TableColumn columnaRelleno=new TableColumn("Relleno");
        TableColumn columnaFigura=new TableColumn("Figura");
        TableColumn columnaDisenio=new TableColumn("Diseño");
        TableColumn columnaPrecio=new TableColumn("Precio");
        ObservableList<Pastel> listaPastel = FXCollections.observableArrayList();
        //Lista ComboBox
        LinkedList<String> listaPisos=new LinkedList<String>();
        LinkedList<String> listaTPisos=new LinkedList<String>();
        LinkedList<String> listaSabor=new LinkedList<String>();
        LinkedList<String> listaRelleno=new LinkedList<String>();
        LinkedList<String> listaFigura=new LinkedList<String>();
        ObservableList<Integer> listaCliente_id = FXCollections.observableArrayList();
    //Panel Clientes
    @FXML Button cl_bt_agregar,cl_bt_eliminar,cl_bt_vaciar;
    @FXML TextField cl_txt_nombre,cl_txt_telefono,cl_txt_direccion,cl_txt_id;
    @FXML RadioButton cl_rb_si,cl_rb_no;
    @FXML TableView tabla_clientes;
    int id_cliente=1;
        //Columnas
        TableColumn columnaId_clientes= new TableColumn("ID");
        TableColumn columnaNombre= new TableColumn("Nombre");
        TableColumn columnaTelefono= new TableColumn("Telefono");
        TableColumn columnaDireccion= new TableColumn("Dirección");
        TableColumn columnaEntrega= new TableColumn("A Domicilio");
        ObservableList<Cliente> listaCliente = FXCollections.observableArrayList();




    public void initialize(){
        inicio.setVisible(true);
        pedidos.setVisible(false);
        pastel.setVisible(false);
        clientes.setVisible(false);
        //pedidos
        ped_tabla_pt.setVisible(false);

        lv_pedidos.setItems(ID_Pedido);
        columna_ped_pt_Id_pastel.setCellValueFactory(new PropertyValueFactory<Pastel,Integer>("ID"));
        columna_ped_pt_Pisos.setCellValueFactory(new PropertyValueFactory<Pastel,Integer>("Pisos"));
        columna_ped_pt_TipodePiso.setCellValueFactory(new PropertyValueFactory<Pastel,String>("TipodePiso"));
        columna_ped_pt_Sabor.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Sabor"));
        columna_ped_pt_Relleno.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Relleno"));
        columna_ped_pt_Figura.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Figura"));
        columna_ped_pt_Disenio.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Diseño"));
        columna_ped_pt_Precio.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Precio"));
        ped_tabla_pt.getColumns().addAll(columna_ped_pt_Id_pastel,columna_ped_pt_Pisos,columna_ped_pt_TipodePiso,columna_ped_pt_Sabor,columna_ped_pt_Relleno,columna_ped_pt_Figura,columna_ped_pt_Disenio,columna_ped_pt_Precio);
        ped_tabla_pt.setItems(Pastel_Terminado);

        columna_ped_pr_Id_pastel.setCellValueFactory(new PropertyValueFactory<Pastel,Integer>("ID"));
        columna_ped_pr_Pisos.setCellValueFactory(new PropertyValueFactory<Pastel,Integer>("Pisos"));
        columna_ped_pr_TipodePiso.setCellValueFactory(new PropertyValueFactory<Pastel,String>("TipodePiso"));
        columna_ped_pr_Sabor.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Sabor"));
        columna_ped_pr_Relleno.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Relleno"));
        columna_ped_pr_Figura.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Figura"));
        columna_ped_pr_Disenio.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Diseño"));
        columna_ped_pr_Precio.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Precio"));
        ped_tabla_pr.getColumns().addAll(columna_ped_pr_Id_pastel,columna_ped_pr_Pisos,columna_ped_pr_TipodePiso,columna_ped_pr_Sabor,columna_ped_pr_Relleno,columna_ped_pr_Figura,columna_ped_pr_Disenio,columna_ped_pr_Precio);
        ped_tabla_pr.setItems(Pastel_Restante);

        columna_ped_cl_Id_clientes.setCellValueFactory(new PropertyValueFactory<Cliente,Integer>("ID"));
        columna_ped_cl_Nombre.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Nombre"));
        columna_ped_cl_Telefono.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Telefono"));
        columna_ped_cl_Direccion.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Direccion"));
        columna_ped_cl_Entrega.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Entrega"));
        ped_tabla_clientes.getColumns().addAll(columna_ped_cl_Id_clientes,columna_ped_cl_Nombre,columna_ped_cl_Telefono,columna_ped_cl_Direccion,columna_ped_cl_Entrega);
        ped_tabla_clientes.setItems(cliente);


        //cliente
        columnaId_clientes.setCellValueFactory(new PropertyValueFactory<Cliente,Integer>("ID"));
        columnaNombre.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Nombre"));
        columnaTelefono.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Telefono"));
        columnaDireccion.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Direccion"));
        columnaEntrega.setCellValueFactory(new PropertyValueFactory<Cliente,String>("Entrega"));
        tabla_clientes.getColumns().addAll(columnaId_clientes,columnaNombre,columnaTelefono,columnaDireccion,columnaEntrega);
        tabla_clientes.setItems(listaCliente);
        //pastel
        columnaId_pastel.setCellValueFactory(new PropertyValueFactory<Pastel,Integer>("ID"));
        columnaPisos.setCellValueFactory(new PropertyValueFactory<Pastel,Integer>("Pisos"));
        columnaTipodePiso.setCellValueFactory(new PropertyValueFactory<Pastel,String>("TipodePiso"));
        columnaSabor.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Sabor"));
        columnaRelleno.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Relleno"));
        columnaFigura.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Figura"));
        columnaDisenio.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Diseño"));
        columnaPrecio.setCellValueFactory(new PropertyValueFactory<Pastel,String>("Precio"));
        pas_tabla.getColumns().addAll(columnaId_pastel,columnaPisos,columnaTipodePiso,columnaSabor,columnaRelleno,columnaFigura,columnaDisenio,columnaPrecio);
        pas_tabla.setItems(listaPastel);




        listaPisos.add("1");
        listaPisos.add("2");
        listaPisos.add("3");
        listaPisos.add("4");
        listaPisos.add("5");
        listaPisos.add("6");
        listaPisos.add("7");
        listaPisos.add("8");
        for(int i=0;i<listaPisos.size();i++)pas_cb_pisos.getItems().addAll(listaPisos.get(i));
        pas_cb_pisos.setValue("1");

        listaTPisos.add("Escalonado");
        listaTPisos.add("Torre");
        for (int i=0;i<listaTPisos.size();i++)pas_cb_TipodePiso.getItems().addAll(listaTPisos.get(i));
        pas_cb_TipodePiso.setValue("Escalonado");

        listaSabor.add("Vainilla");
        listaSabor.add("Chocolate");
        listaSabor.add("Red velvet");
        listaSabor.add("Fresa");
        listaSabor.add("Almendra");
        listaSabor.add("Limón");
        listaSabor.add("Zanahoria");
        listaSabor.add("Naranja");
        listaSabor.add("Tres leches");
        for (int i=0;i<listaSabor.size();i++)pas_cb_sabor.getItems().addAll(listaSabor.get(i));
        pas_cb_sabor.setValue("Vainilla");

        listaRelleno.add("Frutos Rojos");
        listaRelleno.add("Nutella");
        listaRelleno.add("Betun de mantequilla");
        listaRelleno.add("Crema Chantilly");
        listaRelleno.add("Ganache de chocolate");
        listaRelleno.add("Mermelada");
        listaRelleno.add("Dulce de leche");
        for (int i=0;i<listaRelleno.size();i++)pas_cb_relleno.getItems().addAll(listaRelleno.get(i));
        pas_cb_relleno.setValue("Frutos Rojos");

        listaFigura.add("Circulo");
        listaFigura.add("Cuadrado");
        listaFigura.add("Corazón");
        listaFigura.add("Silueta de personaje");
        for (int i=0;i<listaFigura.size();i++)pas_cb_figura.getItems().addAll(listaFigura.get(i));
        pas_cb_figura.setValue("Circulo");

        pas_cb_cliente.setItems(listaCliente_id);

    }

    public void bt_inicio(){
        inicio.setVisible(true);
        pedidos.setVisible(false);
        pastel.setVisible(false);
        clientes.setVisible(false);
    }
    public void bt_pedidos(){
        inicio.setVisible(false);
        pedidos.setVisible(true);
        pastel.setVisible(false);
        clientes.setVisible(false);
    }
    public void bt_orden(){
        inicio.setVisible(false);
        pedidos.setVisible(false);
        pastel.setVisible(true);
        clientes.setVisible(false);
    }
    public void bt_clientes(){
        inicio.setVisible(false);
        pedidos.setVisible(false);
        pastel.setVisible(false);
        clientes.setVisible(true);
    }
    public void bt_close(){
        System.exit(0);
    }
    public void bt_minimizar(){}
    //Accion de botones de pastel
    public void bt_pas_agregar() {
        int Pisos = Integer.parseInt(String.valueOf(pas_cb_pisos.getSelectionModel().getSelectedItem()));
        String TipodePiso = String.valueOf(pas_cb_TipodePiso.getSelectionModel().getSelectedItem());
        String Sabor = String.valueOf(pas_cb_sabor.getSelectionModel().getSelectedItem());
        String Relleno = String.valueOf(pas_cb_relleno.getSelectionModel().getSelectedItem());
        String Figura = String.valueOf(pas_cb_figura.getSelectionModel().getSelectedItem());
        String Disenio=pas_txt_disenio.getText();
        Pastel pastel=new Pastel(0,Pisos,TipodePiso,Sabor,Relleno,Figura,Disenio,0);
        pastel.calcular_precio();
        pas_txt_precio.setText(pastel.getPrecio()+"");
        listaPastel.add(new Pastel(id_pastel,Pisos,TipodePiso,Sabor,Relleno,Figura,Disenio,pastel.getPrecio()));
        id_pastel++;
        int total=0;
        for (int i=0;i<listaPastel.size();i=i+1)total=total+listaPastel.get(i).getPrecio();
        pas_txt_total.setText(total+"");

    }
    public void bt_pas_generar(){
        int total=Integer.parseInt(pas_txt_total.getText());
        Stack<Pastel>Pasteles_restantes=new Stack<>();
        Stack<Pastel>Pasteles_terminados=new Stack<>();
        for (int i=0;i<listaPastel.size();i++)Pasteles_restantes.add(listaPastel.get(i));
        cola_pedido.add(new Pedido(id_pedido,total,listaCliente.get(Integer.parseInt(String.valueOf(pas_cb_cliente.getSelectionModel().getSelectedIndex()))),Pasteles_restantes,Pasteles_terminados));

        Pastel_Restante.clear();
        Pastel_Terminado.clear();
        cliente.clear();
        cliente.add(cola_pedido.peek().getCliente());
        for(int i=0;i<cola_pedido.peek().getPasteles_restantes().size();i++)Pastel_Restante.add(cola_pedido.peek().getPasteles_restantes().get(i));
        for (int i=0;i<cola_pedido.peek().getPasteles_terminados().size();i++)Pastel_Terminado.add(cola_pedido.peek().getPasteles_terminados().get(i));
        ped_txt_total.setText(cola_pedido.peek().getTotal()+"");
        ID_Pedido.add(id_pedido);
        id_pedido++;
        listaPastel.clear();
        id_pastel=1;
        pas_txt_total.setText("");



    }
    public void bt_pas_eliminar(){
        quicksort(listaPastel,0,listaPastel.size()-1);
        int id_buscado=Integer.parseInt(pas_txt_id.getText());
        int mitad, inferior = 0;
        int superior = listaPastel.size()-1;

        do {
            mitad = (inferior + superior) / 2;
            if (id_buscado > listaPastel.get(mitad).getID()) {
                inferior = mitad + 1;
            } else {
                superior = mitad - 1;
            }
        } while (listaPastel.get(mitad).getID() != id_buscado && inferior <= superior);

        if (listaPastel.get(mitad).getID() == id_buscado) {
            listaPastel.remove(mitad);
        }
    }
    public void bt_pas_vaciar(){
        if (listaPastel.isEmpty()!=true){
            listaPastel.clear();
            id_pastel=1;
            pas_txt_total.setText("");
        }
    }
    public void bt_pas_precio(){
        int Pisos = Integer.parseInt(String.valueOf(pas_cb_pisos.getSelectionModel().getSelectedItem()));
        String TipodePiso = String.valueOf(pas_cb_TipodePiso.getSelectionModel().getSelectedItem());
        String Sabor = String.valueOf(pas_cb_sabor.getSelectionModel().getSelectedItem());
        String Relleno = String.valueOf(pas_cb_relleno.getSelectionModel().getSelectedItem());
        String Figura = String.valueOf(pas_cb_figura.getSelectionModel().getSelectedItem());
        String Disenio=pas_txt_disenio.getText();
        Pastel pastel=new Pastel(0,Pisos,TipodePiso,Sabor,Relleno,Figura,Disenio,0);
        pastel.calcular_precio();
        pas_txt_precio.setText(pastel.getPrecio()+"");
    }
    public void bt_pas_ordprecio(){
        int i, j;
        Pastel pastel;
        for(i=0;i<listaPastel.size()-1;i++)
            for(j=0;j<listaPastel.size()-i-1;j++)
                if(listaPastel.get(j+1).getPrecio()<listaPastel.get(j).getPrecio()){
                    pastel=listaPastel.get(j+1);
                    listaPastel.set(j+1,listaPastel.get(j));
                    listaPastel.set(j,pastel);
                }
    }
    public void bt_pas_orid(){
        quicksort(listaPastel,0,listaPastel.size()-1);
    }
    public void quicksort(ObservableList<Pastel> listaPastel,int primero, int ultimo){
        int i, j, central;
        int pivote;
        central = (primero + ultimo)/2;
        pivote = listaPastel.get(central).getID();
        i = primero;
        j = ultimo;
        do {
            while (listaPastel.get(i).getID() < pivote) i++;
            while (listaPastel.get(j).getID() > pivote) j--;
            if (i <= j)
            {
                Pastel pastel;
                pastel = listaPastel.get(i);
                listaPastel.set(i,listaPastel.get(j));
                listaPastel.set(j,pastel);
                i++;
                j--;
            }
        }while (i <= j);
        if (primero < j)
            quicksort(listaPastel, primero, j);
        if (i < ultimo)
            quicksort(listaPastel, i, ultimo);
    }
    //Accion de botones de clientes

    public void bt_cl_agregar(){
        String Nombre=cl_txt_nombre.getText();
        String Telefono=cl_txt_telefono.getText();
        String Direccion=cl_txt_direccion.getText();
        String Entrega="";
        if(cl_rb_si.isSelected()==true){
            Entrega="SI";
        }else if(cl_rb_no.isSelected()==true){
            Entrega="NO";
        }
        listaCliente.add(new Cliente(id_cliente,Nombre,Telefono,Direccion,Entrega));
        listaCliente_id.add(id_cliente);
        id_cliente=id_cliente+1;

    }
    public void bt_cl_eliminar(){

        int eliminar;
        eliminar=Integer.parseInt(cl_txt_id.getText());
        for (int i=0;i<listaCliente.size();i++){
            if (eliminar==listaCliente.get(i).getID()){
                listaCliente.remove(i);
                listaCliente_id.remove(i);
                break;
            }
        }

    }
    public void bt_cl_vaciar(){
        if (listaCliente.isEmpty()!=true){
            listaCliente.clear();
            listaCliente_id.clear();
            id_cliente=1;
        }
    }

    //Pedidos
    public void bt_ped_fpastel(){
        if (cola_pedido.isEmpty()!=true){
            if(cola_pedido.peek().getPasteles_restantes().isEmpty()!=true){
                cola_pedido.peek().getPasteles_terminados().add(cola_pedido.peek().getPasteles_restantes().pop());
                Pastel_Restante.clear();
                Pastel_Terminado.clear();
                for(int i=0;i<cola_pedido.peek().getPasteles_restantes().size();i++)Pastel_Restante.add(cola_pedido.peek().getPasteles_restantes().get(i));
                for (int i=0;i<cola_pedido.peek().getPasteles_terminados().size();i++)Pastel_Terminado.add(cola_pedido.peek().getPasteles_terminados().get(i));

            }
        }

    }
    public void bt_ped_fpedido(){
        if(cola_pedido.isEmpty()!=true){
            cola_pedido.poll();
            ID_Pedido.remove(0);
            Pastel_Restante.clear();
            Pastel_Terminado.clear();
            cliente.clear();
            if(cola_pedido.isEmpty()!=true){
                cliente.add(cola_pedido.peek().getCliente());
                for(int i=0;i<cola_pedido.peek().getPasteles_restantes().size();i++)Pastel_Restante.add(cola_pedido.peek().getPasteles_restantes().get(i));
                for (int i=0;i<cola_pedido.peek().getPasteles_terminados().size();i++)Pastel_Terminado.add(cola_pedido.peek().getPasteles_terminados().get(i));
                ped_txt_total.setText(cola_pedido.peek().getTotal()+"");
            }else{
                ped_txt_total.setText("");
            }
        }


    }
    public void bt_ped_pt(){
        ped_tabla_pt.setVisible(true);
        ped_tabla_pr.setVisible(false);
    }
    public void bt_ped_pr(){
        ped_tabla_pt.setVisible(false);
        ped_tabla_pr.setVisible(true);
    }




}
