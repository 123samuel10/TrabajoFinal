package com.example.demoproyectofinalsamuel.persistence;

import com.example.demoproyectofinalsamuel.Model.Clients;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Persistence {
    public static final String RUTA_ARCHIVO_CLIENTES =  "src/main/java/com/example/demoproyectofinalsamuel/persistence/resources/clients.txt";

    public static void saveClients(List<Clients> clientsList) throws IOException {
        String contenido="";

        for(Clients client : clientsList) {
            contenido += client.getId() + "~" +
                    client.getName() + "~" +
                    client.getAge() + "~" +
                    client.getPhoneNumber() + "~" +
                    client.getMail()+ "\n"
            ;
        }

        ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_CLIENTES,contenido,false);

    }

    public static List<Clients> loadClients() throws IOException {

        List<Clients> clients = new ArrayList<>();

        ArrayList<String> contenido =ArchivoUtil.leerArchivo(RUTA_ARCHIVO_CLIENTES);

        String linea = "";


        for (int i= 0; i<contenido.size();i++){

            Clients client= new Clients();
            linea = contenido.get(i);

            client.setId(linea.split("~")[0]);

            client.setName(linea.split("~")[1]);

            client.setAge(linea.split("~")[2]);

            client.setPhoneNumber(linea.split("~")[3]);

            client.setMail(linea.split("~")[4]);

            clients.add(client);
        }

        return clients;
    }

}
