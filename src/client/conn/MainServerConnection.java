package client.conn;

import java.io.FileNotFoundException;
import java.io.IOException;

import base.conn.ServerConnection;

/** 
* Respons�vel pela conexao com o servidor principal 
*/  
public class MainServerConnection extends ServerConnection {  
 
	public MainServerConnection(String configFileName) throws FileNotFoundException, IOException {  
		super(configFileName);  
	}  
 
	@Override  
	public void configure() {  
		this.serverAddress = properties.getProperty("mainServer.address");  
		this.serverPort = Integer.parseInt(properties.getProperty("mainServer.port"));  
	}  
 
}