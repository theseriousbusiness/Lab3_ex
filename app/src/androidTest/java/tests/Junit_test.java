package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

import com.example.rrivasfe.lab3_exercise.MainActivity;
import com.example.rrivasfe.lab3_exercise.R;

/**
 * Created by rrivasfe on 4/18/2016.
 */
public class Junit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public Junit_test() {
        super(MainActivity.class);
        //add_testrunner();

    }

    public void test_add() {

        add_test1(3,4); // positive ints
        add_test1(-3,-4); // negative ints
        add_test1(-67,234); // neg, pos ints
        add_test1(234,-13); // pos, neg ints
        add_test1(43.43, 65.3); // pos doubles
        add_test1(0,0.0); // zeros
        add_test1(0, -45.21); // zero, neg double
        add_test1(6452, 0); // pos int, zero

    }

    public void add_test1(double a, double b) {

        mainActivity = getActivity();
/*
        TextView tv1 = (TextView) mainActivity.findViewById(R.id.editText);
        TextView tv2 = (TextView) mainActivity.findViewById(R.id.editText2);
        TextView tv3 = (TextView) mainActivity.findViewById(R.id.editText3);
        Button addBtn = (Button) mainActivity.findViewById(R.id.button);

        tv1.setText(String.valueOf(a));
        tv2.setText(String.valueOf(b));

        addBtn.performClick();

        double result = Double.parseDouble(tv3.getText().toString());
        double ref = a + b;
        */

        double result = mainActivity.sum(a,b);
        assertEquals(result, a+b);

    }


}