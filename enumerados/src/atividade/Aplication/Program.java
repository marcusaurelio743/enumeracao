package atividade.Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import atividade.entities.Departament;
import atividade.entities.HoursContract;
import atividade.entities.Worker;
import atividade.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter departament name:  ");
		String departamentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.println("Name:");
		String workerName = sc.nextLine();
		System.out.println("Level:");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary:");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
		
		System.out.println("How many contracts to this worker? ");
		
		int qtd = sc.nextInt();
		
		for(int i=0; i< qtd; i++) {
			sc.nextLine();
			System.out.println("Enter contract #"+(i+1)+" data:");
			System.out.println("Date (DD/MM/YYYY):");
			Date dateContract = sdf.parse(sc.next());
			System.out.println("Value per hour:");
			Double contracthourValue = sc.nextDouble();
			System.out.println("Duration (hours):");
			Integer contractHours = sc.nextInt();
			
			HoursContract contract = new HoursContract(dateContract, contracthourValue, contractHours);
			
			worker.addContract(contract);
			
			
		}
		
		System.out.println();
		System.out.println("Enter month and year to calculate income (MM/YYYY):");
		String dataMes = sc.next();
		
		int month = Integer.parseInt( dataMes.substring(0, 2));
		int Years = Integer.parseInt(dataMes.substring(3));
		
		System.out.println("Name: "+worker.getName());
		System.out.println("Department: "+worker.getDepartament().getName());
		System.out.println("Income for "+dataMes+" : "+String.format("%.2f", worker.income(Years, month)));
		
		
		sc.close();
	}

}
