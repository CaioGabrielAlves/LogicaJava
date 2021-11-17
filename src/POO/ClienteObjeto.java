package POO;

public class ClienteObjeto {

	public static void main(String[] args) {
		
		Cliente1 c1 = new Cliente1();
		
		c1.setNome("Margarete");
		System.out.println("Nome do cliente é: "+c1.getNome());
		c1.setIdade(27);
		System.out.println("Meu cliente tem: "+c1.getIdade());
		c1.setDinheiro(50000);
		System.out.println("Meu cliente faturou: "+c1.getDinheiro()+" reais");
		c1.setPedidoQuantidade(76);
		System.out.println("Meu cliente recebeu: "+c1.getPedidoQuantidade()+" pedidos");
		
		c1.lucro(7670);
		System.out.println("Com o lucro passou a ser: "+c1.getDinheiro());

	}
}