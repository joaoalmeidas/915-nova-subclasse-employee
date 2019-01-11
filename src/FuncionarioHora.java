
public class FuncionarioHora extends Funcionario {
	
	private double horas;
	private double salarioHora;
	
	public FuncionarioHora(String nome, String sobrenome, String cpf, double horas, double salarioHora) {
		super(nome, sobrenome, cpf);
		
		if(horas < 0) {
			throw new IllegalArgumentException("Horas deve ser >= 0");
		}
		
		if(salarioHora <= 0) {
			throw new IllegalArgumentException("Salario Horas deve ser > 0");
		}
		
		this.horas = horas;
		this.salarioHora = salarioHora;
	}

	
	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		
		if(horas < 0) {
			throw new IllegalArgumentException("Horas deve ser >= 0");
		}
		
		this.horas = horas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		
		if(salarioHora <= 0) {
			throw new IllegalArgumentException("Salario Horas deve ser > 0");
		}
		
		this.salarioHora = salarioHora;
	}
	
	public double calculaGanhos() {
		
		return getSalarioHora() * getHoras();
		
	}
	
	@Override
	public String toString() {
		return String.format("%sHoras: %.2f\nSalário Hora: %.2f\nGanhos: %.2f", super.toString(), getHoras(), getSalarioHora(), calculaGanhos());
	}
	
	
}
