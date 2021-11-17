package POO;

public class Cliente1 {
		private String nome;
		private int idade;
		private int dinheiro;
		private int pedidoQuantidade;
		
		public void pedidoQuantidade() 
		{
			System.out.println("Quantidade do pedido!!!"+ pedidoQuantidade);
			
		}
		public void ganhosDinheiro()
		{
			if (this.dinheiro>50000) 
			{
				System.out.println("Meta atingida..."+ dinheiro);
				
			}
			else
			{
				System.out.println("Abaixo da meta"+ dinheiro);
			}
		}
		public void lucro(int money) {
			this.dinheiro += money;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getDinheiro() {
			return dinheiro;
		}
		public void setDinheiro(int dinheiro) {
			this.dinheiro = dinheiro;
		}
		public int getPedidoQuantidade() {
			return pedidoQuantidade;
		}
		public void setPedidoQuantidade(int pedidoQuantidade) {
			this.pedidoQuantidade = pedidoQuantidade;
		}
		
}
