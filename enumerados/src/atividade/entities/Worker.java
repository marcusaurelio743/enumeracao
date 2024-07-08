package atividade.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import atividade.entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departament departament;
	
	private List<HoursContract> contracts = new ArrayList<HoursContract>();
	
	Worker(){
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HoursContract> getContracts() {
		return contracts;
	}

	
	
	public void addContract(HoursContract contract) {
		contracts.add(contract);
	}
	
	public Double income(int years, int month) {
		
		Double valorContrato = 0.00;
		Calendar cal = Calendar.getInstance(); 
	
		for (HoursContract hoursContract : contracts) {
			cal.setTime(hoursContract.getDate());
			
			int contract_year = cal.get(Calendar.YEAR);
			int contract_month = 1 + cal.get(Calendar.MONTH);
			
			if(years == contract_year && month == contract_month) {
				valorContrato+= hoursContract.totalValue();
			}
		}
		
		return valorContrato+baseSalary;
		
	}
	
	public void removeContract(HoursContract contract) {
		contracts.remove(contract);
	}
	
	
}
