import java.util.Scanner;

public class Quiz_animalCrossing {
	
		public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				String per1, per2, per3, per4, per5, per6, per7, per8, per9, per10;
				String nome; 
				int total = 0;
				System.out.println("Qual seu nome?\n");
				nome=sc.next();
				System.out.println("|---------------------------------------------------------|\n"
						+ "|Quanto você conhece sobre Animal Crossing: New Horizons? |\n"
						+ "|---------------------------------------------------------|\n");
				System.out.println("1-Aproximadamente quantos villagers existem em animal crossing?\r\n"
						+ "a) Entre 500 e 540\r\n"
						+ "b) Entre 370 e 400\r\n"
						+ "c) Entre 420 e 450\r\n"
						+ "d) Entre 290 e 310");
				per1=sc.next();
				if (per1.equals("b")) {
					total++;
					System.out.println("Parabéns, você acertou!");
				}else System.out.println("Alternativa certa: b) Entre 370 e 400");
						
				System.out.println("\n----------------------------------------------------------");
				
				System.out.println("2-Qual desses é o evento mais díficl de acontecer no jogo? \n"
						+ "\na) Todas as obras de arte de Reed serem falsas"
						+ "\nb) Chuva de estrelas cadentes intensa"
						+ "\nc) Compartilhar seu aniversário com um villager"
						+ "\nd) Ilha misteriosa de escorpiões ou tarântulas");
				per2= sc.next();
				
				if (per2.equals("c")) {
					total++;
					System.out.println("Parabéns, você acertou!");
				}else System.out.println("Alternativa certa: c)Compartilhar seu aniversário com um villager");
				System.out.println("\n----------------------------------------------------------");
				
				System.out.println("3-Qual animal é o Tom Nook?"
						+ "a) Urso\r\n"
						+ "b) Guaxinin\r\n"
						+ "c) Gamba\r\n"
						+ "d) Tanuki");
per3= sc.next();

if (per3.equals("d")) {
				total++;
				System.out.println("Parabéns, você acertou!");
}else System.out.println("Alternativa certa: d) Tanuki");


System.out.println("\n----------------------------------------------------------");

System.out.println("4- Quanto custa a casa inical do jogo?\r\n"
					+ "a) 98.000 Bells\r\n"
					+ "b) 100.000 Bells\r\n"
					+ "c) 90.000 Bells\r\n"
					+ "d) 110.000 Bells");
per4= sc.next();

if (per4.equals("a")) {
				total++;
				System.out.println("Parabéns, você acertou!");
}else System.out.println("Resposta certa: a) 98.000 Bells");


System.out.println("\n----------------------------------------------------------");

System.out.println("5- Se você esquecer de salvar o jogo antes de sair, quem vai te dar um xingo?\r\n"
					+ "a) Timmy e Tomy\r\n"
					+ "b) Isabelle\r\n"
					+ "c) Tom Nook\r\n"
					+ "d) Mr. Resetti");

per5= sc.next();

if (per5.equals("d")) {
				total++;
				System.out.println("Parabéns, você acertou!");
}else System.out.println("Alternativa certa: d) Mr. Resetti");


System.out.println("\n----------------------------------------------------------");

System.out.println("6- Quando Isabelle foi anunciada no Smash Bros?\r\n"
					+ "a) 30 de julho de 2019\r\n"
					+ "b) 26 de julho de 2019 \r\n"
					+ "c) 15 de agosto de 2018\r\n"
					+ "d) 24 de junho de 2019");
per6= sc.next();

if (per6.equals("b")) {
				total++;
				System.out.println("Parabéns, você acertou!");
}else System.out.println("Alternativa certa: b)26 de julho de 2019");
					
System.out.println("\n----------------------------------------------------------");

System.out.println("7- O que Gulliver pede para você preocurar quando ele aparece na ilha?\r\n"
					+ "a) minhocas\r\n"
					+ "b) Pilhas\r\n"
					+ "c) Celulares\r\n"
					+ "d) Partes do comunicador");
per7= sc.next();
if (per7.equals("d")) {
				total++;
				System.out.println("Parabéns, você acertou!");
}else System.out.println("Alternativa certa: d) Partes do comunicador");

System.out.println("\n----------------------------------------------------------");

System.out.println("8- Por que Blathers se assusta quando entram no museu durante o dia?\r\n"
					+ "a) Porque ele é uma coruja\r\n"
					+ "b) Porque ele é timido\r\n"
					+ "c) Porque ele é feio\r\n"
					+ "d) Porque ele é ranzinza");
per8= sc.next();
if (per8.equals("a")) {
				total++;
				System.out.println("Parabéns, você acertou!");
}else System.out.println("Alternativa certa: a) Porque ele é uma coruja");
				
System.out.println("\n----------------------------------------------------------");
					
System.out.println("9- Que dia a Maisie Day visita a ilha?\n"
					+ "a) Domingo\r\n"
					+ "b) Sexta- feira \r\n"
					+ "c) Sabado \r\n"
					+ "d) Quinta- feira");
per9= sc.next();
if (per9.equals("a")) {
				total++;
				System.out.println("Parabéns, você acertou!");
}else System.out.println("Alternativa certa: d) Domingo");

System.out.println("\n----------------------------------------------------------");

System.out.println("10-Com quantas estrelas K.K. Slider visita a ilha para fazer um show?\r\n"
					+ "a) 4 estrelas\r\n"
					+ "b) 3 estrelas\r\n"
					+ "c) 5 estrelas\r\n"
					+ "d) 1 estrelas");
per10=sc.next();
if (per10.equals("b")) {
				total++;
				System.out.println("Parabéns, você acertou!");
}else System.out.println("Alternativa certa: b) 3 estrelas");

System.out.println("\n----------------------------------------------------------");

System.out.println("parabéns " + nome + " você tirou " + total);
			}
		}
	}

