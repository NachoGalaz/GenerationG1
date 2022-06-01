package com.generation.f20220531.manager;

import com.generation.f20220531.Cliente;

import java.util.List;
public class ClienteManager {

    //recorrer el arreglo

    public void recorrerArregloCLiente(List<Cliente> listaCliente) {

        for (int i = 0; i < listaCliente.size(); i++){
            //antes era un variable y ahora
            System.out.println("cliente " + i + ": \n" + listaCliente.toString());
        }


    }

}
