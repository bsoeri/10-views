package sr.unasat.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CharSequence toastText = "This is a Toast. Welcome to Views Playground!";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(this, toastText, duration);
        toast.show();

        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText("This is a TextView");

        EditText editText = (EditText) findViewById(R.id.edit_text);
        String text = editText.getText().toString();

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String string = String.valueOf(spinner.getSelectedItem());

    }

    /** Called when the button is clicked */
    public void onButtonClicked(View view) {
        // Do something in response to button click
        TextView buttonView = (TextView) findViewById(R.id.text_view);
        buttonView.setText("The Button is clicked");
    }

    /** Called when the toggle button is clicked */
    public void onToggleButtonClicked(View view) {
        // Get the state of the toggle button.
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            TextView toggleOnView = (TextView) findViewById(R.id.text_view);
            toggleOnView.setText("The ToggleButton is ON");
        } else {
            TextView toggleOffView = (TextView) findViewById(R.id.text_view);
            toggleOffView.setText("The ToggleButton is OFF");
        }
    }

    /** Called when the switch is clicked */
    public void onSwitchClicked(View view) {
        // Is the switch on?
        boolean on = ((Switch) view).isChecked();
        if (on) {
            TextView switchOnView = (TextView) findViewById(R.id.text_view);
            switchOnView.setText("The Switch is ON");
        } else {
            TextView switchOffView = (TextView) findViewById(R.id.text_view);
            switchOffView.setText("The Switch is OFF");
        }
    }

    public void onCheckboxClicked(View view) {
        // Has the checkbox that was clicked been checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Retrieve which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_milk:
                if (checked) {
                    TextView checkboxMilkView = (TextView) findViewById(R.id.text_view);
                    checkboxMilkView.setText("The Checkbox Milk is checked"); // Why is this skipped??
                } else {
                    TextView checkboxMilkView = (TextView) findViewById(R.id.text_view);
                    checkboxMilkView.setText("This is a TextView");
                    break;
                }
            case R.id.checkbox_sugar:
                if (checked) {
                    TextView checkboxSugarView = (TextView) findViewById(R.id.text_view);
                    checkboxSugarView.setText("The Checkbox Sugar is checked");
                } else {
                    TextView checkboxSugarView = (TextView) findViewById(R.id.text_view);
                    checkboxSugarView.setText("This is a TextView");
                    break;
                }
        }
    }

    public void onRadioButtonClicked(View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        int id = radioGroup.getCheckedRadioButtonId();
        switch(id) {
            case R.id.radio_cavemen:
                TextView radioCavemenView = (TextView) findViewById(R.id.text_view);
                radioCavemenView.setText("The RadioButton Cavemen is checked");
                break;
            case R.id.radio_astronauts:
                TextView radioAstronautsView = (TextView) findViewById(R.id.text_view);
                radioAstronautsView.setText("The RadioButton Astronauts is checked");
                break;
        }
    }

}
