import java.rmi.RemoteException;

public interface IBanco {
	public void depositar(String conta, float valor) throws RemoteException;

	public float saldo(String conta) throws RemoteException;

	public boolean sacar(String conta, float valor) throws RemoteException;

	public boolean abreConta(String conta, Cliente c) throws RemoteException;

	public boolean fechaConta(String conta) throws RemoteException;

	public Cliente getCliente(String conta) throws RemoteException;
}
