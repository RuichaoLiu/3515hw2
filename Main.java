activity_main.xml

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="82dp"
        android:layout_height="26dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="132dp"
        android:layout_marginEnd="51dp"
        android:text="Name"
        android:textSize="18sp"
        app:layout_constraintEnd_toStartOf="@+id/name"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/name"
        android:layout_width="215dp"
        android:layout_height="38dp"
        android:layout_marginEnd="47dp"
        android:layout_marginBottom="11dp"
        android:ems="10"
        android:hint="Enter name "
        android:inputType="textPersonName"
        app:layout_constraintBottom_toTopOf="@+id/email"
        app:layout_constraintEnd_toEndOf="parent" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="76dp"
        android:layout_height="32dp"
        android:layout_marginStart="20dp"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="50dp"
        android:inputType="textEmailAddress"
        android:text="Email"
        android:textSize="18sp"
        app:layout_constraintEnd_toStartOf="@+id/email"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <EditText
        android:id="@+id/email"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="52dp"
        android:layout_marginBottom="25dp"
        android:ems="10"
        android:hint="Enter email"
        android:inputType="textEmailAddress"
        app:layout_constraintBottom_toTopOf="@+id/mobile"
        app:layout_constraintEnd_toEndOf="parent" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="90dp"
        android:layout_height="41dp"
        android:layout_marginStart="28dp"
        android:layout_marginTop="33dp"
        android:layout_marginEnd="54dp"
        android:text="mobile no"
        android:textSize="18sp"
        app:layout_constraintEnd_toStartOf="@+id/mobile"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView2" />

    <EditText
        android:id="@+id/mobile"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="52dp"
        android:layout_marginBottom="31dp"
        android:ems="10"
        android:hint="Enter mobile no"
        android:inputType="textPersonName"
        app:layout_constraintBottom_toTopOf="@+id/password"
        app:layout_constraintEnd_toEndOf="parent" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="98dp"
        android:layout_height="47dp"
        android:layout_marginStart="20dp"
        android:layout_marginTop="27dp"
        android:layout_marginEnd="28dp"
        android:text="Password"
        android:textSize="18sp"
        app:layout_constraintEnd_toStartOf="@+id/password"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView3" />

    <EditText
        android:id="@+id/password"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="52dp"
        android:layout_marginBottom="37dp"
        android:ems="10"
        android:hint="Enter password"
        android:inputType="textPassword"
        app:layout_constraintBottom_toTopOf="@+id/confirmpassword"
        app:layout_constraintEnd_toEndOf="parent" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="138dp"
        android:layout_height="58dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="38dp"
        android:layout_marginEnd="3dp"
        android:text="Confirm Password"
        android:textSize="18sp"
        app:layout_constraintEnd_toStartOf="@+id/confirmpassword"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView4" />

    <EditText
        android:id="@+id/confirmpassword"
        android:layout_width="251dp"
        android:layout_height="43dp"
        android:layout_marginEnd="11dp"
        android:layout_marginBottom="118dp"
        android:ems="10"
        android:hint="confirm password"
        android:inputType="textPassword"
        app:layout_constraintBottom_toTopOf="@+id/signup"
        app:layout_constraintEnd_toEndOf="parent" />

    <TextView
        android:id="@+id/textView6"
        android:layout_width="129dp"
        android:layout_height="40dp"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="133dp"
        android:text="Application"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/signup"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="117dp"
        android:text="SignUp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
and MainActivity.java

package temple.edu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static androidx.core.os.LocaleListCompat.create;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder alertDialog;
    Button signup;
    EditText name,email,mobile,password,confirmpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get all  fields using id
        signup=(Button)findViewById(R.id.signup);
        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        mobile=(EditText)findViewById(R.id.mobile);
        password=(EditText)findViewById(R.id.password);
        confirmpassword=(EditText) findViewById(R.id.confirmpassword);

        //creating alertbox for showing the username after successfull signup
        //you can remove this code as per your demand
        alertDialog=new AlertDialog.Builder(MainActivity.this);

        //checking the empty edittext


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //check whether the fields are empty of not
                if(name.getText().toString().isEmpty() || email.getText().toString().isEmpty() || mobile.getText().toString().isEmpty() || password.getText().toString().isEmpty() ||
                        confirmpassword.getText().toString().isEmpty()  )
                {
                    Toast.makeText(MainActivity.this, "All Fields Are Mandatory !", Toast.LENGTH_SHORT).show();
                    //if yes then toast will apear to show the fields are mandatory


                }
                else if(!password.getText().toString().equals(confirmpassword.getText().toString()))
                {

                    Toast.makeText(MainActivity.this, "Password Mismatch !", Toast.LENGTH_SHORT).show();
                        //if password mismatch then this toast will apear
                }
                else
                {

                    //successfully showing the msg in the form of alert
                    alertDialog.setTitle("Welcome");
                    alertDialog.setMessage(""+name.getText().toString());
                     alertDialog.setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }




                });
                //Creating dialog box
                AlertDialog alert = alertDialog.create();
                //Setting the title manually
                alert.setTitle("Welcome");
                alert.show();
            }





    }
        });



    }
}