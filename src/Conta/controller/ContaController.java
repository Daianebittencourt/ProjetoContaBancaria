package Conta.controller;

import java.util.ArrayList;

import Conta.model.Conta;
import Conta.repository.ContaRepository;

public class ContaController implements ContaRepository{
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero=0;

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA conta número: "+conta.getNumero()+ "foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	public int gerarNumero() {
		return ++ numero;
	}
}
