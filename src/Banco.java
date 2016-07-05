import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class Banco extends UnicastRemoteObject implements IBanco {

	private List<Conta> contas;

	protected Banco() throws RemoteException {
		super();
		this.contas = null;
	}

	@Override
	public void depositar(String conta, float valor) throws RemoteException {
		
		for (Conta c : contas) {
			if (c.getConta() == conta) {
				c.depositar(valor);
				System.out.println("Valor depositado com sucesso!");

			}

		}

	}

	@Override
	public float saldo(String conta) throws RemoteException {
		for (Conta c : contas) {
			if (c.getConta() == conta) {
				System.out.println("Seu saldo e: "+c.getSaldo());

			}

		}
		return 0;
	}

	@Override
	public boolean sacar(String conta, float valor) throws RemoteException {
		for (Conta c : contas) {
			if (c.getConta() == conta) {
				c.sacar(valor);
				System.out.println("Valor sacado com sucesso!");

			}

		}
		return false;
	}

	@Override
	public boolean abreConta(String conta, Cliente c) throws RemoteException {

		Conta conta1 = new Conta(c, conta);
		contas.add(conta1);
		return true;
	}

	@Override
	public boolean fechaConta(String conta) throws RemoteException {
		for (Conta c : contas) {
			if (c.getConta() == conta) {
				contas.remove(c);
				System.out.println("Conta Removida com sucesso!");

			}

		}

		return false;
	}

	@Override
	public Cliente getCliente(String conta) throws RemoteException {

		for (Conta c : contas) {
			if (c.getConta() == conta) {
				return c.getC();

			}

		}
		return null;

	}
}
