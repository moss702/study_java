package main;

import serviece.BankService;
import utils.BankUtils;

public class BankApp { 
	public static void main(String[] args) {
		while(true) {
			System.out.println(" __                         __       \r\n"
					+ "|  \\                       |  \\      \r\n"
					+ "| ▓▓____   ______  _______ | ▓▓   __ \r\n"
					+ "| ▓▓    \\ |      \\|       \\| ▓▓  /  \\\r\n"
					+ "| ▓▓▓▓▓▓▓\\ \\▓▓▓▓▓▓\\ ▓▓▓▓▓▓▓\\ ▓▓_/  ▓▓\r\n"
					+ "| ▓▓  | ▓▓/      ▓▓ ▓▓  | ▓▓ ▓▓   ▓▓ \r\n"
					+ "| ▓▓__/ ▓▓  ▓▓▓▓▓▓▓ ▓▓  | ▓▓ ▓▓▓▓▓▓\\ \r\n"
					+ "| ▓▓    ▓▓\\▓▓    ▓▓ ▓▓  | ▓▓ ▓▓  \\▓▓\\\r\n"
					+ " \\▓▓▓▓▓▓▓  \\▓▓▓▓▓▓▓\\▓▓   \\▓▓\\▓▓   \\▓▓\r\n"
					+ "");
			System.out.println("===================================================");
			BankService.getInstance().menu();
			
			
			
		}
	}
}
