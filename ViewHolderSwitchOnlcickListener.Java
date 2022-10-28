public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        this.mViewholder.buttonApplyText = findViewById(R.id.buttonApplyText);
        this.mViewholder.buttonSaveText = findViewById(R.id.buttonSaveData);
      
        this.mViewholder.buttonApplyText.setOnClickListener(this);
        this.mViewholder.buttonSaveText.setOnClickListener(this);
    }
    
    private static class ViewHolder{
        Button buttonApplyText;
        Button buttonSaveText;
    }

    private final ViewHolder mViewholder = new ViewHolder();
    
     @Override
    public void onClick(View view) {
        switch (view.getId()){
            case (R.id.buttonApplyText):
                Toast.makeText(this, "Apply Working", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.buttonSaveData):
                Toast.makeText(this, "Save Working", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
    
    }
