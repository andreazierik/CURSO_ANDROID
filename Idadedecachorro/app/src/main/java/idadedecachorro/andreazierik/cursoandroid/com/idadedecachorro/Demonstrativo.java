private EditText salario;
private Button resultado;
private TextView porcentagemUm;
private TextView porcentagemDois;
private TextView porcentagemTres;
private TextView porcentagemQuatro;


salario = (EditText) findViewById(R.id.);
resultado = (Button) findViewById(R.id.);
porcentagemUm = (TextView) findViewById(R.id.);
porcentagemDois = (TextView) findViewById(R.id.);
porcentagemTres = (TextView) findViewById(R.id.);
porcentagemQuatro = (TextView) findViewById(R.id.);

resultado.setOnClickListener (new View.OnClickListener() {
	@Overrade
	public void onClick(View view) {
		
		// Recuperar o que foi digitado
		String recSalario = caixaTexto.getText().toString();
		
		// Validar o EditText se vazio
		if ( recSalario.isEmpty ){
			Toast.makeText(MainActivity.this, "Por favor, digite o salário", Toast.LENGHT.SHORT).show();
		}else{
			
			//Recuperar salário
			int resultFinalString = Integer.parseInt(recSalario);
			
			//Gerar o resultado do salario em 55% - Gastos essenciais
			int resultUmFinal = resultFinalString * 55%;
			porcentagemUm.setText("Gastos essenciais: " + resultUmFinal + ", representa 55% do salário");
			
			//Gerar o resultado do salario em 5% - Gastos com educação
			int resultDoisFinal = resultFinalString * 5%;
			porcentagemDois.setText("Gastos com educação: " + resultDoisFinal ", representa 5% do salário");
			
			//Gerar o resultado do salario em 10% - Gastos com Qual quer
			int resultTresFinal = resultFinalString * 10%;
			porcentagemTres.setText("Qual quer: " + resultTresFinal ", representa 10% do salário");
			
			//Gerar o resultado do salario em 30% - Poupança
			int resultQuatroFinal = resultFinalString * 30%;
			porcentagemQuatro.setText("Poupança: " + resultQuatroFinal ", representa 30% do salário");
			
		}
	}
});