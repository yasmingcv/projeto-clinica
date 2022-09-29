package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		//Criar objetos
		
		PlanoDeSaude planoDeSaude = new PlanoDeSaude();
		planoDeSaude.setOperadora("Unimed");
		planoDeSaude.setCategoria("Bronze");
		planoDeSaude.setNumero("7771-8873-5421-2525");
		planoDeSaude.setValidade(LocalDate.of(2023, 8, 20));
	
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Elton Silva");
		endereco.setNumero("905");
		endereco.setBairro("Centro");
		endereco.setCidade("Jandira");
		endereco.setCep("06600-025");
		endereco.setEstado(Estados.RIO_DE_JANEIRO);
		endereco.setComplemento("Instituição de ensino");
		
		Paciente paciente = new Paciente();
		paciente.setNome("Carlos Pereira");
		paciente.setTelefone("11 948303519");
		paciente.setEndereco(endereco);
		paciente.setRg("12345678-9");
		paciente.setCpf("742985626-39");
		paciente.setPlanoSaude(planoDeSaude);
		paciente.setDataNascimento(LocalDate.of(2006, 5, 28));
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Patricia");
		paciente2.setTelefone("11 948303999");
		paciente2.setEndereco(endereco);
		paciente2.setRg("12345558-7");
		paciente2.setCpf("742985626-31");
		paciente2.setPlanoSaude(planoDeSaude);
		paciente2.setDataNascimento(LocalDate.of(2000, 6, 29));
		
		System.out.println("Nome: " + paciente.getNome());
		System.out.println("Telefone: " + paciente.getTelefone());
		System.out.println("Operadora do plano: " + paciente.getPlanoSaude().getOperadora());
		System.out.println("Categoria do plano: " + paciente.getPlanoSaude().getCategoria());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Estado: " + endereco.getEstado());
		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("Cuida do coração");
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Otorrinolaringologista");
		especialidade2.setDescricao("Cuida da garganta, ouvido, etc..");
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clínico geral");
		especialidade3.setDescricao("Sabe de tudo um pouquinho.");
		
		Medico medico1 = new Medico();
		medico1.setNome("Ana Maria");
		medico1.setEmail("anamaria@gmail.com");
		medico1.setTelefone("11 981235847");
		medico1.setCRM("12548-9");
		Especialidade[] especialidades1 = {especialidade1, especialidade3};
		medico1.setEspecialidade(especialidades1);
		
		Medico medico2 = new Medico();
		medico2.setNome("Roberto da Silva");
		medico2.setEmail("roberto@gmail.com");
		medico2.setTelefone("11 982587315");
		medico2.setCRM("12558-1");
		Especialidade[] especialidades2 = {especialidade1, especialidade2, especialidade3};
		medico2.setEspecialidade(especialidades2);
		
		System.out.println("--------------------------");
		System.out.println("Nome do médico: " + medico1.getNome());
	
		
		
		int i = 0;
		while(medico1.getEspecialidade().length > i) {
			System.out.println("Especialidade " + (i+1) + " - " + medico1.getEspecialidade()[i].getNome());
			i++;
		
			
		}
		
		System.out.println("--------------------------");
		System.out.println("Nome do médico: " + medico2.getNome());
		
		i = 0;
		while(medico2.getEspecialidade().length > i) {
			System.out.println("Especialidade " + (i+1) + " - " + medico2.getEspecialidade()[i].getNome());
			i++;
		}
		System.out.println("--------------------------");
		
		Agenda agenda = new Agenda();
		agenda.setPaciente(paciente);
		agenda.setEspecialidade(especialidade1);
		agenda.setMedico(medico2);
		agenda.setDataDaConsulta(LocalDate.of(2022, 9, 27));
		agenda.setHoraDaConsulta(LocalTime.of(14, 15));
		
		Agenda agenda2 = new Agenda();
		agenda2.setPaciente(paciente2);
		agenda2.setEspecialidade(especialidade3);
		agenda2.setMedico(medico1);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 10, 12));
		agenda2.setHoraDaConsulta(LocalTime.of(9, 30));
		
		
		System.out.println("Agenda do (a) paciente: " + agenda.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda.getEspecialidade().getNome());
		System.out.println("Médico: " + agenda.getMedico().getNome());
		System.out.println("Data: " + agenda.getDataDaConsulta());
		System.out.println("Hora: " + agenda.getHoraDaConsulta());
		
		System.out.println("-------------------------");
		
		System.out.println("Agenda do (a) paciente: " + agenda2.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
		System.out.println("Médico: " + agenda2.getMedico().getNome());
		System.out.println("Data: " + agenda2.getDataDaConsulta());
		System.out.println("Hora: " + agenda2.getHoraDaConsulta());
		
		
	}

}
