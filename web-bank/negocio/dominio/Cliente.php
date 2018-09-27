
<?php 

class Cliente {

	var $codigo;
	var $nome;
	var $cpf;
	
	public function pegarDados(){
		
		$this->nome = $_GET["nome"];
		$this->cpf = $_GET["cpf"];
	}
	
	public function validarDados(){
	}

}

?>