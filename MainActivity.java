package com.edgar.testestestes;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	 
    public static int PlacarJ,Placar1,Placar2;    
    
    
    
    public void tela (View view){
    	setContentView(R.layout.jogo);
    	
    }
    public void voltar (View view){
    	setContentView(R.layout.activity_main);
    }
    
    public void gold (View view){
    	setContentView(R.layout.gold);
    }
    
    public void compra (View view){
    	setContentView(R.layout.compra);
    }
    
    public void resetar (View view){
    	PlacarJ = 0;
    	Placar1 = 0;
    	Placar2 = 0;
    			
    }
    
    public void Um (View view){
    	int Jo=1;
    	int cpu1= (int)(Math.random()*2)+1;
    	int cpu2= (int)(Math.random()*2)+1;
    	
    	
    	
    	
    	if(cpu1 == 2 && cpu2 == 2){
    		
    		TextView Txcpu1 = (TextView)findViewById(R.id.Rcpu1);
    		Txcpu1.setText(" Jogou 2 ");
    		
    		TextView Txcpu2 = (TextView)findViewById(R.id.Rcpu2);
    		Txcpu2.setText(" Jogou 2 ");
    		
    		
    		TextView Txresultado = (TextView)findViewById(R.id.Resultado);
    		Txresultado.setText(" Jogador 1 Ganhou ");
    		
    		
    		PlacarJ++;
    		TextView gerador = (TextView)findViewById(R.id.PlacarJ);
    		gerador.setText (String.valueOf(this.PlacarJ));
    		
    	}else if(cpu1 == 1 && cpu2 == 2){
    		
    		TextView Txcpu1 = (TextView)findViewById(R.id.Rcpu1);
    		Txcpu1.setText(" Jogou 1 ");
    		
    		TextView Txcpu2 = (TextView)findViewById(R.id.Rcpu2);
    		Txcpu2.setText(" Jogou 2 ");
    		
    		TextView Txresultado = (TextView)findViewById(R.id.Resultado);
    		Txresultado.setText(" Maria  Ganhou ");
    		
    		Placar2++;
    		TextView gerador = (TextView)findViewById(R.id.Placar2);
    		gerador.setText (String.valueOf(this.Placar2));
    		
    	}else if (cpu1 == 2 && cpu2 == 1){
    		
    		TextView Txcpu1 = (TextView)findViewById(R.id.Rcpu1);
    		Txcpu1.setText(" Jogou 2 ");
    		
    		TextView Txcpu2 = (TextView)findViewById(R.id.Rcpu2);
    		Txcpu2.setText(" Jogou 1 ");
    		
    		TextView Txresultado = (TextView)findViewById(R.id.Resultado);
    		Txresultado.setText(" Jesus  Ganhou ");
    		
    		Placar1++;
    		TextView gerador = (TextView)findViewById(R.id.Placar1);
    		gerador.setText (String.valueOf(this.Placar1));
    	
    	}else if (cpu1 == 1 && cpu2 == 1){

    		TextView Txcpu1 = (TextView)findViewById(R.id.Rcpu1);
    		Txcpu1.setText(" Jogou 1 ");
    		
    		TextView Txcpu2 = (TextView)findViewById(R.id.Rcpu2);
    		Txcpu2.setText(" Jogou 1 ");
    		
    		TextView Txresultado = (TextView)findViewById(R.id.Resultado);
    		Txresultado.setText(" Empate ");
    		}	
    	}
    
    public void Dois (View view){
    	
    
    	int Jo=2;
    	int cpu1= (int)(Math.random()*2)+1;
    	int cpu2= (int)(Math.random()*2)+1;
    	
    	
    	
    	
    	if(cpu1 == 2 && cpu2 == 2){
    		
    		TextView Txcpu1 = (TextView)findViewById(R.id.Rcpu1);
    		Txcpu1.setText(" Jogou 2 ");
    		
    		TextView Txcpu2 = (TextView)findViewById(R.id.Rcpu2);
    		Txcpu2.setText(" Jogou 2 ");
    		
    		
    		TextView Txresultado = (TextView)findViewById(R.id.Resultado);
    		Txresultado.setText(" Empate ");
    		
    	
    		
    	}else if(cpu1 == 1 && cpu2 == 2){
    		
    		TextView Txcpu1 = (TextView)findViewById(R.id.Rcpu1);
    		Txcpu1.setText(" Jogou 1 ");
    		
    		TextView Txcpu2 = (TextView)findViewById(R.id.Rcpu2);
    		Txcpu2.setText(" Jogou 2 ");
    		
    		TextView Txresultado = (TextView)findViewById(R.id.Resultado);
    		Txresultado.setText(" Jesus  Ganhou ");
    		
    		Placar1++;
    		TextView gerador = (TextView)findViewById(R.id.Placar1);
    		gerador.setText (String.valueOf(this.Placar1));
    		
    	}else if (cpu1 == 2 && cpu2 == 1){
    		
    		TextView Txcpu1 = (TextView)findViewById(R.id.Rcpu1);
    		Txcpu1.setText(" Jogou 2 ");
    		
    		TextView Txcpu2 = (TextView)findViewById(R.id.Rcpu2);
    		Txcpu2.setText(" Jogou 1 ");
    		
    		TextView Txresultado = (TextView)findViewById(R.id.Resultado);
    		Txresultado.setText(" Maria Ganhou ");
    		
    		Placar2++;
    		TextView gerador = (TextView)findViewById(R.id.Placar2);
    		gerador.setText (String.valueOf(this.Placar2));
    	
    	}else if (cpu1 == 1 && cpu2 == 1){
    		
    		TextView Txcpu1 = (TextView)findViewById(R.id.Rcpu1);
    		Txcpu1.setText(" Jogou 1 ");
    		
    		TextView Txcpu2 = (TextView)findViewById(R.id.Rcpu2);
    		Txcpu2.setText(" Jogou 1 ");
    		
    		TextView Txresultado = (TextView)findViewById(R.id.Resultado);
    		Txresultado.setText(" Voce  Ganhou ");
    		
    	}
    	
    	
    }
    	
    }
    

