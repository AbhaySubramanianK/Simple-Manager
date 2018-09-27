package com.example.helloworld.testapp;

        import android.content.Intent;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class chooseclass extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;
    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);


        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                    Intent intent = new Intent(chooseclass.this,menu.class);
                    Toast.makeText(chooseclass.this, "Welcome to the Class", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }


            });



        button2.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {

            Intent intent = new Intent(chooseclass.this,menu.class);
            Toast.makeText(chooseclass.this, "Welcome to the Class", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }


    });



button3.setOnClickListener(new View.OnClickListener()
        {
@Override
public void onClick(View view)
        {

        Intent intent = new Intent(chooseclass.this,menu.class);
        Toast.makeText(chooseclass.this, "Welcome to the Class", Toast.LENGTH_SHORT).show();
        startActivity(intent);
        }


        });
        }

        //code to implement double back press to exit functionality
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();//this exits the activity just like finish() function
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}

