import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
	final static String HOST_URL = "rmi://10.0.4.48/Banco";
	
	public static void main(String args[]){
		try{
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			Banco banco = new Banco();
			Naming.bind(HOST_URL, banco);
			
		}catch(Exception e){
			System.out.println("Error: "+e);
		}
	}

}
