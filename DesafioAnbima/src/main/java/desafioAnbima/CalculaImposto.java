package desafioAnbima;

import java.text.DecimalFormat;

public class CalculaImposto {
	private double salario, salarioAux, salarioFinal, descontoTotal, descontoDependentes, DescontoIrpf;
	private int numeroDependentes;
	private double impostoInss, impostoIrpf;

	public CalculaImposto(double salario, int dependentes) {
		super();
		this.salario = salario;
		this.numeroDependentes = dependentes;
	}


	public String calculaImpostoInss(){
		this.salarioAux = this.salario;

		DecimalFormat fmt = new DecimalFormat("0.00");

		if(salario<= 1751.81){
			this.impostoInss = salario * 0.08;
			this.salarioAux = this.salarioAux- this.impostoInss;
		}else if(this.salarioAux > 1751.81 && this.salarioAux <= 2919.72){
			this.impostoInss = this.salarioAux * 0.09;
			this.salarioAux = this.salarioAux - this.impostoInss;
		}else if(this.salarioAux > 2919.72 && this.salarioAux <= 5839.45){
			this.impostoInss = this.salarioAux * 0.11;
			this.salarioAux = this.salarioAux- this.impostoInss;
		}else{
			this.impostoInss = 642.34;
			this.salarioAux = this.salarioAux - this.impostoInss;
		}
		String inss = fmt.format(this.impostoInss);
		return  inss;
	}

	public String calculaImpostoIrpf() {
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		if(this.salarioAux <= 1903.98){
			this.impostoIrpf = 0;

		}else if(this.salarioAux > 1903.98 && this.salarioAux <= 2826.65){
			this.DescontoIrpf = 142.80;
			this.descontoDependentes = this.numeroDependentes * 189.59; 
			this.salarioAux = this.salarioAux - this.descontoDependentes;
			this.impostoIrpf = this.salarioAux * 0.075;
			this.impostoIrpf = this.impostoIrpf - this.DescontoIrpf;

		}else if(this.salarioAux > 2826.65 && this.salarioAux <= 3751.05){
			this.DescontoIrpf = 354.80;
			this.descontoDependentes = this.numeroDependentes * 189.59;
			this.salarioAux = this.salarioAux - this.descontoDependentes;
			this.impostoIrpf = this.salarioAux * 0.15;
			this.impostoIrpf = this.impostoIrpf - this.DescontoIrpf;

		}else if(this.salarioAux > 3751.05 && this.salarioAux <= 4664.68){
			this.DescontoIrpf = 636.13;
			this.descontoDependentes = this.numeroDependentes * 189.59;
			this.salarioAux = this.salarioAux - this.descontoDependentes;
			this.impostoIrpf = this.salarioAux * 0.225;
			this.impostoIrpf = this.impostoIrpf - this.DescontoIrpf;

		}else{
			this.DescontoIrpf = 869.36;
			this.descontoDependentes = this.numeroDependentes * 189.59;
			this.salarioAux = this.salarioAux - this.descontoDependentes;
			this.impostoIrpf = this.salarioAux * 0.275;
			this.impostoIrpf = this.impostoIrpf - this.DescontoIrpf;

		}
		String irpf = fmt.format(this.impostoIrpf);
		return irpf;
	}

	public String descontoTotal() {
		this.descontoTotal = this.impostoInss + this.impostoIrpf;
		DecimalFormat fmt = new DecimalFormat("0.00");
		String desconto = fmt.format(this.descontoTotal);
		return  desconto;
	}

	public String salarioFinal() {
		this.salarioFinal = this.salario - this.descontoTotal;
		DecimalFormat fmt = new DecimalFormat("0.00");
		String salarioF = fmt.format(this.salarioFinal);
		return  salarioF;
	}


	@Override
	public String toString() {
		return "\nImposto INSS = R$ "+ calculaImpostoInss()+ 
				"\nImposto IRPF = R$ " + calculaImpostoIrpf() +
				"\nDescontoTotal = R$ " + descontoTotal() +
				"\nSalario Final = R$ " + salarioFinal();
	}
}
