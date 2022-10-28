private static class ViewHolder{
        // Somente essa classe tem acesso a esse método por ser private
        // Será executado uma vez por ser static
        EditText editvalue;
        TextView textViewNumeorDolar;
        TextView textViewNumeroEuro;
        Button buttonCalcular;
    }
    private final ViewHolder mViewHolder = new ViewHolder();
    
    // ON CREATE--------------------------------------------------
    
    this.mViewHolder.editvalue = findViewById(R.id.editTextNumberReal);
        this.mViewHolder.textViewNumeorDolar = findViewById(R.id.textViewResultadoDolar);
        this.mViewHolder.textViewNumeroEuro = findViewById(R.id.textViewResultadoEuro);
        this.mViewHolder.buttonCalcular = findViewById(R.id.buttonCalcular);

        this.mViewHolder.buttonCalcular.setOnClickListener(this);
        
     //-----------------------------------------------------------
