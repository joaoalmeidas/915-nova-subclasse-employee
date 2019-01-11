
public class FuncionarioHoraTeste {
	
	public static void main(String[] args) {
		
		FuncionarioHora empregado = new FuncionarioHora("João", "Guilherme", "22542189641", 40, 10);
		
		System.out.println("Dados do empregado obtidos através dos métodos get().");
		
		System.out.printf("%n%s %s%n", "O nome é", empregado.getNome());
		
		System.out.printf("%s %s%n", "O sobrenome é", empregado.getSobrenome());
		
		System.out.printf("%s %s%n", "O CPF é", empregado.getCpf());

		System.out.printf("%s %.2f%n", "O total de horas trabalhadas é", empregado.getHoras());
		
		System.out.printf("%s %.2f%n", "O salário por hora é ", empregado.getSalarioHora());
		
		System.out.printf("%s %.2f%n", "O salário total é ", empregado.calculaGanhos());
		
		empregado.setHoras(50);
		empregado.setSalarioHora(10);
		
		System.out.printf("%n%s:%n%n%s%n", "Informações atualizadas obtidas através do toString()", empregado);
		
	}

}
