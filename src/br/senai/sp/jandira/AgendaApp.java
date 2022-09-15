package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		
			
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao("A cardiologia cuida do coração.");
		
		
		JOptionPane.showMessageDialog(null, especialidade.getNome());
		JOptionPane.showMessageDialog(null, especialidade.getDescricao());
		
		PlanoDeSaude planoSaude = new PlanoDeSaude();
		planoSaude.setOperadora("NotreDame");
		planoSaude.setCategoria("Premium");
		planoSaude.setNumero("777 123456");
		
		
		
		
	}

}
