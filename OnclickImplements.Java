public class ButtonActivity extends AppCompatActivity implements View.OnClickListener {

  @Override
    public void onClick(View view) {
        // default method for handling onClick Events..
        Button b = (Button) view;
        String buttonText = b.getText().toString();
        switch (view.getId()) {

            case R.id.btn1:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn2:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn3:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn4:
                // do your code
                Toast.makeText(getApplicationContext(), "Button " + buttonText + " is Clicked", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
    }
}
