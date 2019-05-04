import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;


public class LeCSV {
	
	public LinkedList<Cliente> leCsvClientes() throws IOException{
		
		LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
	    String current = new java.io.File(".").getCanonicalPath();        
	    BufferedReader file = new BufferedReader(new FileReader(current + "\\src\\arquivo.csv"));
	    
	    Cliente cliente;
	    String dados[] = new String[5];
	    
	    String linha = file.readLine(); /* le primeira linha */
        
	    while ((linha = file.readLine()) != null) {
	    	cliente = new Cliente();
            dados = linha.split(";");
	    	cliente.setId(dados[0]);
            cliente.setNome(dados[1]);
            cliente.setEmail(dados[2]);
            cliente.setTelefone(dados[4]);
            cliente.setTotalCompras(Double.parseDouble(dados[5]));
            clientes.add(cliente);            
	    }
	    file.close(); 
       
       //complete o codigo para ler o csv e criar as instancias de cliente.
       //rode o teste MainReadCsvTest.java para testar o seu código.
       
       return clientes;
    }

}
