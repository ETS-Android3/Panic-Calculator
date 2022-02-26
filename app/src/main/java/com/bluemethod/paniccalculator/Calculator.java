package com.bluemethod.paniccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Activity for the main calculator view
 * Contains all code for the calculator and
 * emergency SOS initiation
 *
 * @author Dan Bliss
 * @author Sam Wyss-Duhammel
 */
public class Calculator extends AppCompatActivity {

    //TODO: Modify the UI in activity_calculator.xml

    //Used for triggering the SOS, is set to false after .25 seconds of being hit
    private boolean equalsTapped = false;
    Timer equalsTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        CalculatorFunctionality calculator = new CalculatorFunctionality();

        //Begin collecting scene information and init-ing variables

        //The text display at the top of the calculator
        TextView equationDisplay = (TextView) findViewById(R.id.equationDisplay);

        //The number buttons
        Button oneButton = (Button) findViewById(R.id.bOneButton);
        Button twoButton = (Button) findViewById(R.id.bTwoButton);
        Button threeButton = (Button) findViewById(R.id.bThreeButton);
        Button fourButton = (Button) findViewById(R.id.bFourButton);
        Button fiveButton = (Button) findViewById(R.id.bFiveButton);
        Button sixButton = (Button) findViewById(R.id.bSixButton);
        Button sevenButton = (Button) findViewById(R.id.bSevenButton);
        Button eightButton = (Button) findViewById(R.id.bEightButton);
        Button nineButton = (Button) findViewById(R.id.bNineButton);
        Button zeroButton = (Button) findViewById(R.id.bZeroButton);

        //Operation Buttons
        Button plusButton = (Button) findViewById(R.id.bPlusButton);
        Button minusButton = (Button) findViewById(R.id.bMinusButton);
        Button timesButton = (Button) findViewById(R.id.bTimesButton);
        Button divideButton = (Button) findViewById(R.id.bDivideButton);
        Button equalsButton = (Button) findViewById(R.id.bEqualsButton);

        //Clear Button
        Button clearButton = (Button) findViewById(R.id.bClearButton);

        //---- ON CLICK LISTENERS ----//

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        equalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Not only should this solve, but we should also check for double presses
                //and dispatch the SOS

                if (equalsTapped)
                    sendSOS(view);

                equalsTapped = true;

                //Deactivates the equals primer after .25 seconds
                equalsTimer = new Timer();
                equalsTimer.schedule(new RemindTask(), 250);

                //TODO: Solve the equation
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    /**
     * Class used to manage the double tapping for the equals button
     */
    class RemindTask extends TimerTask
    {
        public void run()
        {
            equalsTapped = false;
        }
    }

    /**
     * Updates the calculator's equation display
     *
     * @param view the text view to update
     * @param calculator the calculator class
     */
    private void updateDisplay(TextView view, CalculatorFunctionality calculator)
    {
        view.setText(calculator.getDisplay());
    }

    /**
     * Sends an SOS Signal
     *
     * @param view temp param for the SOS placeholder
     */
    private void sendSOS(View view)
    {
        //TODO: Dispatch SOS Signal
        Snackbar.make(view, "SOS Activated!! Wee Wooo Wee Woo", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}