
public class FuncionarioHoraTeste {
	
	public static void main(String[] args) {
		
		FuncionarioHora empregado = new FuncionarioHora("Jo�o", "Guilherme", "22542189641", 40, 10);
		
		System.out.println("Dados do empregado obtidos atrav�s dos m�todos get().");
		
		System.out.printf("%n%s %s%n", "O nome �", empregado.getNome());
		
		System.out.printf("%s %s%n", "O sobrenome �", empregado.getSobrenome());
		
		System.out.printf("%s %s%n", "O CPF �", empregado.getCpf());

		System.out.printf("%s %.2f%n", "O total de horas trabalhadas �", empregado.getHoras());
		
		System.out.printf("%s %.2f%n", "O sal�rio por hora � ", empregado.getSalarioHora());
		
		System.out.printf("%s %.2f%n", "O sal�rio total � ", empregado.calculaGanhos());
		
		empregado.setHoras(50);
		empregado.setSalarioHora(10);
		
		System.out.printf("%n%s:%n%n%s%n", "Informa��es atualizadas obtidas atrav�s do toString()", empregado);
		
	}

}
