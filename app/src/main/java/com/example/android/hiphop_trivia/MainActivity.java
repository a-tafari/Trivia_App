package com.example.android.hiphop_trivia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton checkBoxA, checkBoxB, checkBoxC;

    private RadioButton checkBoxQ4_1, checkBoxQ4_2, checkBoxQ4_3;
    private RadioButton checkBoxQ5_1, checkBoxQ5_2, checkBoxQ5_3;
    private RadioButton checkBoxQ6_1, checkBoxQ6_2, checkBoxQ6_3;
    private RadioButton checkBoxQ7_1, checkBoxQ7_2, checkBoxQ7_3;
    private RadioButton checkBoxQ8_1, checkBoxQ8_2, checkBoxQ8_3;
    private RadioButton checkBoxQ9_1, checkBoxQ9_2, checkBoxQ9_3;
    private RadioButton checkBoxQ10_1, checkBoxQ10_2, checkBoxQ10_3;

    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxA = (RadioButton) findViewById(R.id.q1CheckBox1);
        checkBoxB = (RadioButton) findViewById(R.id.q1CheckBox2);
        checkBoxC = (RadioButton) findViewById(R.id.q1CheckBox3);

        checkBoxQ4_1 = (RadioButton) findViewById(R.id.q4CheckBox1);
        checkBoxQ4_2 = (RadioButton) findViewById(R.id.q4CheckBox2);
        checkBoxQ4_3 = (RadioButton) findViewById(R.id.q4CheckBox3);

        checkBoxQ5_1 = (RadioButton) findViewById(R.id.q5CheckBox1);
        checkBoxQ5_2 = (RadioButton) findViewById(R.id.q5CheckBox2);
        checkBoxQ5_3 = (RadioButton) findViewById(R.id.q5CheckBox3);

        checkBoxQ6_1 = (RadioButton) findViewById(R.id.q6CheckBox1);
        checkBoxQ6_2 = (RadioButton) findViewById(R.id.q6CheckBox2);
        checkBoxQ6_3 = (RadioButton) findViewById(R.id.q6CheckBox3);

        checkBoxQ7_1 = (RadioButton) findViewById(R.id.q7CheckBox1);
        checkBoxQ7_2 = (RadioButton) findViewById(R.id.q7CheckBox2);
        checkBoxQ7_3 = (RadioButton) findViewById(R.id.q7CheckBox3);

        checkBoxQ8_1 = (RadioButton) findViewById(R.id.q8CheckBox1);
        checkBoxQ8_2 = (RadioButton) findViewById(R.id.q8CheckBox2);
        checkBoxQ8_3 = (RadioButton) findViewById(R.id.q8CheckBox3);

        checkBoxQ9_1 = (RadioButton) findViewById(R.id.q9CheckBox1);
        checkBoxQ9_2 = (RadioButton) findViewById(R.id.q9CheckBox2);
        checkBoxQ9_3 = (RadioButton) findViewById(R.id.q9CheckBox3);

        checkBoxQ10_1 = (RadioButton) findViewById(R.id.q10CheckBox1);
        checkBoxQ10_2 = (RadioButton) findViewById(R.id.q10CheckBox2);
        checkBoxQ10_3 = (RadioButton) findViewById(R.id.q10CheckBox3);
    }

    //Activates and deactivates the instruction textview... makes it visible or invisible.
    public void showInstructions(View view) {
        View showText = findViewById(R.id.game_instructions);
        showText.setVisibility((showText.getVisibility() == View.VISIBLE) ? View.GONE : View.VISIBLE);
    }

    public void isQOneCorrect(View View) {
        RadioGroup isCorrect = (RadioGroup) findViewById(R.id.radioGroup1);
        int radioButtonID = isCorrect.getCheckedRadioButtonId();
        if (radioButtonID == R.id.q1CheckBox1) {
            score += 10;
        } else {
            score -= 1;
        }
    }

    public void isQTwoCorrect(View View) {
        CheckBox isCorrect = (CheckBox) findViewById(R.id.q2CheckBox2);
        CheckBox isCorrect2 = (CheckBox) findViewById(R.id.q2CheckBox3);
        CheckBox isCorrect3 = (CheckBox) findViewById(R.id.q2CheckBox1);
        Boolean isChecked = isCorrect.isChecked();
        Boolean isChecked2 = isCorrect2.isChecked();
        Boolean isChecked3 = isCorrect3.isChecked();
        if (isChecked & isChecked2 & !isChecked3) {
            score += 10;
        } else if (isChecked3) {
            score -= 1;
        }
    }

    public void isQThreeCorrect(View View) {
        EditText isCorrect = (EditText) findViewById(R.id.q3Answer);
        String answer = isCorrect.getText().toString().toLowerCase();
        String rightAnswer= "bronx";
        Boolean matches = answer.contains(rightAnswer);
        if (matches) {
            score += 10;
        } else {
            score -= 1;
        }
    }

    public void isQ4Correct(View View) {
        RadioGroup isCorrect = (RadioGroup) findViewById(R.id.radioGroup4);
        int radioButtonID = isCorrect.getCheckedRadioButtonId();
        if (radioButtonID == R.id.q4CheckBox3) {
            score += 10;
        } else {
            score -= 1;
        }
    }

    public void isQ5Correct(View View) {
        RadioGroup isCorrect = (RadioGroup) findViewById(R.id.radioGroup5);
        int radioButtonID = isCorrect.getCheckedRadioButtonId();
        if (radioButtonID == R.id.q5CheckBox3) {
            score += 10;
        } else {
            score -= 1;
        }
    }

    public void isQ6Correct(View View) {
        RadioGroup isCorrect = (RadioGroup) findViewById(R.id.radioGroup6);
        int radioButtonID = isCorrect.getCheckedRadioButtonId();
        if (radioButtonID == R.id.q6CheckBox2) {
            score += 10;
        } else {
            score -= 1;
        }
    }

    public void isQ7Correct(View View) {
        RadioGroup isCorrect = (RadioGroup) findViewById(R.id.radioGroup7);
        int radioButtonID = isCorrect.getCheckedRadioButtonId();
        if (radioButtonID == R.id.q7CheckBox1) {
            score += 10;
        } else {
            score -= 1;
        }
    }

    public void isQ8Correct(View View) {
        RadioGroup isCorrect = (RadioGroup) findViewById(R.id.radioGroup8);
        int radioButtonID = isCorrect.getCheckedRadioButtonId();
        if (radioButtonID == R.id.q8CheckBox3) {
            score += 10;
        } else {
            score -= 1;
        }
    }

    public void isQ9Correct(View View) {
        RadioGroup isCorrect = (RadioGroup) findViewById(R.id.radioGroup9);
        int radioButtonID = isCorrect.getCheckedRadioButtonId();
        if (radioButtonID == R.id.q9CheckBox1) {
            score += 10;
        } else {
            score -= 1;
        }
    }

    public void isQ10Correct(View View) {
        RadioGroup isCorrect = (RadioGroup) findViewById(R.id.radioGroup10);
        int radioButtonID = isCorrect.getCheckedRadioButtonId();
        if (radioButtonID == R.id.q10CheckBox3) {
            score += 10;
        } else {
            score -= 1;
        }
    }


    //calls all the methods 1-10 and gets score.
    public void submitTest(View view) {
        isQOneCorrect(view);
        isQTwoCorrect(view);
        isQThreeCorrect(view);
        isQ4Correct(view);
        isQ5Correct(view);
        isQ6Correct(view);
        isQ7Correct(view);
        isQ8Correct(view);
        isQ9Correct(view);
        isQ10Correct(view);
        EditText inputName = (EditText) findViewById(R.id.edit_message);
        Editable name = inputName.getText();
        String yourResult = resultSummary(name);
        Toast.makeText(this, yourResult, Toast.LENGTH_SHORT).show();
        score = 0;


    }

    //Takes name and attaches it to a result string.
    public String resultSummary(Editable name) {
        String results = name + " you scored " + score + " Pts!";


        return results;

    }

    //clears all checked boxes or ons when clear form is clicked.
    public void clearForm(View view) {
        EditText inputName = (EditText) findViewById(R.id.edit_message);
        EditText inputAnswer = (EditText) findViewById(R.id.q3Answer);
        RadioGroup isCorrect = (RadioGroup) findViewById(R.id.radioGroup1);
        RadioGroup isCorrect2 = (RadioGroup) findViewById(R.id.radioGroup2);
        RadioGroup isCorrect4 = (RadioGroup) findViewById(R.id.radioGroup4);
        RadioGroup isCorrect5 = (RadioGroup) findViewById(R.id.radioGroup5);
        RadioGroup isCorrect6 = (RadioGroup) findViewById(R.id.radioGroup6);
        RadioGroup isCorrect7 = (RadioGroup) findViewById(R.id.radioGroup7);
        RadioGroup isCorrect8 = (RadioGroup) findViewById(R.id.radioGroup8);
        RadioGroup isCorrect9 = (RadioGroup) findViewById(R.id.radioGroup9);
        RadioGroup isCorrect10 = (RadioGroup) findViewById(R.id.radioGroup10);
        CheckBox isChecked1 = (CheckBox) findViewById(R.id.q2CheckBox1);
        CheckBox isChecked2 = (CheckBox) findViewById(R.id.q2CheckBox2);
        CheckBox isChecked3 = (CheckBox) findViewById(R.id.q2CheckBox3);
        inputName.getText().clear();
        inputAnswer.getText().clear();
        isCorrect.clearCheck();
        isCorrect2.clearCheck();
        if (isChecked1.isChecked() || isChecked2.isChecked() || isChecked3.isChecked()) {
            isChecked1.setChecked(false);
            isChecked2.setChecked(false);
            isChecked3.setChecked(false);
        }

        isCorrect4.clearCheck();
        isCorrect5.clearCheck();
        isCorrect6.clearCheck();
        isCorrect7.clearCheck();
        isCorrect8.clearCheck();
        isCorrect9.clearCheck();
        isCorrect10.clearCheck();

    }

    //This method is what allows for only one checkbox or button to be clicked at a time.
    public void onCheckboxClicked(View view) {

        switch (view.getId()) {

            case R.id.q1CheckBox1:

                checkBoxB.setChecked(false);
                checkBoxC.setChecked(false);

                break;

            case R.id.q1CheckBox2:

                checkBoxC.setChecked(false);
                checkBoxA.setChecked(false);

                break;

            case R.id.q1CheckBox3:

                checkBoxA.setChecked(false);
                checkBoxB.setChecked(false);

                break;


            case R.id.q4CheckBox1:

                checkBoxQ4_3.setChecked(false);
                checkBoxQ4_2.setChecked(false);

                break;

            case R.id.q4CheckBox2:

                checkBoxQ4_1.setChecked(false);
                checkBoxQ4_3.setChecked(false);

                break;

            case R.id.q4CheckBox3:

                checkBoxQ4_1.setChecked(false);
                checkBoxQ4_2.setChecked(false);

                break;
            case R.id.q5CheckBox1:

                checkBoxQ5_3.setChecked(false);
                checkBoxQ5_2.setChecked(false);

                break;

            case R.id.q5CheckBox2:

                checkBoxQ5_1.setChecked(false);
                checkBoxQ5_3.setChecked(false);

                break;

            case R.id.q5CheckBox3:

                checkBoxQ5_1.setChecked(false);
                checkBoxQ5_2.setChecked(false);

                break;
            case R.id.q6CheckBox1:

                checkBoxQ6_3.setChecked(false);
                checkBoxQ6_2.setChecked(false);

                break;

            case R.id.q6CheckBox2:

                checkBoxQ6_1.setChecked(false);
                checkBoxQ6_3.setChecked(false);

                break;

            case R.id.q6CheckBox3:

                checkBoxQ6_1.setChecked(false);
                checkBoxQ6_2.setChecked(false);

                break;
            case R.id.q7CheckBox1:

                checkBoxQ7_3.setChecked(false);
                checkBoxQ7_2.setChecked(false);

                break;

            case R.id.q7CheckBox2:

                checkBoxQ7_1.setChecked(false);
                checkBoxQ7_3.setChecked(false);

                break;

            case R.id.q7CheckBox3:

                checkBoxQ7_1.setChecked(false);
                checkBoxQ7_2.setChecked(false);

                break;
            case R.id.q8CheckBox1:

                checkBoxQ8_3.setChecked(false);
                checkBoxQ8_2.setChecked(false);

                break;

            case R.id.q8CheckBox2:

                checkBoxQ8_1.setChecked(false);
                checkBoxQ8_3.setChecked(false);

                break;

            case R.id.q8CheckBox3:

                checkBoxQ8_1.setChecked(false);
                checkBoxQ8_2.setChecked(false);

                break;
            case R.id.q9CheckBox1:

                checkBoxQ9_3.setChecked(false);
                checkBoxQ9_2.setChecked(false);

                break;

            case R.id.q9CheckBox2:

                checkBoxQ9_1.setChecked(false);
                checkBoxQ9_3.setChecked(false);

                break;

            case R.id.q9CheckBox3:

                checkBoxQ9_1.setChecked(false);
                checkBoxQ9_2.setChecked(false);

                break;
            case R.id.q10CheckBox1:

                checkBoxQ10_3.setChecked(false);
                checkBoxQ10_2.setChecked(false);

                break;

            case R.id.q10CheckBox2:

                checkBoxQ10_1.setChecked(false);
                checkBoxQ10_3.setChecked(false);

                break;

            case R.id.q10CheckBox3:

                checkBoxQ10_1.setChecked(false);
                checkBoxQ10_2.setChecked(false);

                break;
        }
    }

}
