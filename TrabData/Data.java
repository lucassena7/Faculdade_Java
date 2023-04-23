package br.nom.belo.marcio;

import java.util.Calendar;

public class Data {
	private int dia;
    private int mes;
    private int ano;
	
	public Data(int ano, int mes, int dia) {
		if (!DataValida(dia, mes, ano)) { //Se a data nao for válida
			dia = 1;
			mes = 1;
			ano = 1900;
		}

        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

	public Data adicionarDias(int dias) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(this.ano, this.mes - 1, this.dia);
		calendar.add(Calendar.DAY_OF_MONTH, dias);
		return new Data(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.DAY_OF_MONTH));
	}

	private boolean DataValida(int dia, int mes, int ano)
	{
		if (dia < 1 || mes < 1 || ano < 1900) {
			return false;
		}
		
		switch (mes) {
			case 1:
			case 2:
				if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
					return (dia <= 29);
				} else {
					return (dia <= 28);
				}
			case 3:
			case 4:
				return (dia <= 30);
			case 5:
			case 6:
				return (dia <= 30);
			case 7:
			case 8:
			case 9:
				return (dia <= 30);
			case 10:
			case 11:
				return (dia <= 30);
			case 12:
			default:
				return (dia <= 31);
		}
	}
}
